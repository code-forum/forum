package com.forum.base.exception;

import com.forum.base.enumerate.CommonEnum;
import com.forum.base.result.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @projectName: forum
 * @package: com.forum.base.exception
 * @className: GlobalException
 * @author: 李晓龙
 * @description: 全局异常处理类
 * @date: 2022/9/3 18:46
 * @version: 1.0
 */
@ControllerAdvice
public class GlobalException {
    private static final Logger log = LoggerFactory.getLogger(GlobalException.class);

    /**
     * 通用异常处理
     *
     * @param req
     * @param e   异常
     * @return ResultEntity
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ResultEntity bizExceptionHandler(HttpServletRequest req, BizException e) {
        log.error("发生业务异常！原因是：{}", e.errorMsg);
        return ResultEntity.failed(-1, ResultEntity.FAILED, e.getErrorMsg());
    }

    /**
     * 空指针异常处理
     *
     * @param req
     * @param e   异常
     * @return ResultEntity
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultEntity bizExceptionHandler(HttpServletRequest req, NullPointerException e) {
        log.error("发生指针异常！原因是：{}", e.getMessage());
        return ResultEntity.failed(-1, ResultEntity.FAILED, CommonEnum.BODY_NOT_MATCH.getResultMsg());
    }

    /**
     * 处理其他异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultEntity exceptionHandler(HttpServletRequest req, Exception e) {
        log.error("未知异常！原因是:", e);
        return ResultEntity.failed(-1, ResultEntity.FAILED, CommonEnum.INTERNAL_SERVER_ERROR.getResultMsg());
    }
}
