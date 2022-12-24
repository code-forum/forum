package com.forum.base.uitls;

import com.forum.model.entity.BaseEntity;
import com.forum.model.entity.Category;
import com.forum.model.vo.CategoryTreeVo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author 李晓龙
 * @version 1.0
 * @description: 构造树形结构
 * @date 2022/10/30 17:01
 */
public class BuildTree {
    public static List<CategoryTreeVo> getBuildTree(List<Category> node){
        List<CategoryTreeVo> categoryTreeVoList=new ArrayList<>();
        for (Category category : node) {
            CategoryTreeVo categoryTreeVo=new CategoryTreeVo();
            //父节点
            if(category.getPId()==0){
                BeanUtils.copyProperties(category,categoryTreeVo);
                categoryTreeVo.setChildren(getChild(node,categoryTreeVo));
                categoryTreeVoList.add(categoryTreeVo);
            }
        }
        return categoryTreeVoList;
    }

    private static List<CategoryTreeVo> getChild(List<Category> node, CategoryTreeVo categoryPrintTreeVo) {
        List<CategoryTreeVo> child=new ArrayList<>();
        for (Category category : node) {
            CategoryTreeVo categoryTreeVo=new CategoryTreeVo();
            if(category.getPId().longValue()==categoryPrintTreeVo.getId().longValue()){
                BeanUtils.copyProperties(category,categoryTreeVo);
                categoryTreeVo.setChildren(getChild(node,categoryTreeVo));
                child.add(categoryTreeVo);
            }
            categoryTreeVo.setChildren(null);
        }
        return child;
    }
}
