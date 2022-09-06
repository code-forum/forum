package com.forum.base.result;

import java.io.Serializable;

/**
 * @projectName: forum
 * @package: com.forum.base.common
 * @className: ResultEntity
 * @author: 李晓龙
 * @description: ResultEntity JSON对象
 * @date: 2022/9/3 18:06
 * @version: 1.0
 */

public class ResultEntity<T> implements Serializable {
    private Integer code;

    private String msg;

    private T data;

    public static final String SUCCESS = "SUCCESS";
    public static final String FAILED = "FAILED";

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultEntity() {
    }

    public ResultEntity(Integer code, String msg, T obj) {
        this.code = code;
        this.msg = msg;
        this.data = obj;
    }

    public Object getData() {
        return data;
    }

    /**
     * 返回成功 增删改查
     *
     * @param <Type>
     * @return ResultEntity
     */
    public static <Type> ResultEntity<Type> successWithoutData() {
        return ResultEntity.successWithoutData(0, SUCCESS, null);
    }

    /**
     * 返回成功 数据查询
     *
     * @param data
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithoutData(Type data) {
        return ResultEntity.successWithoutData(0, SUCCESS, data);
    }

    /**
     * 返回成功 携带消息
     *
     * @param msg    msg
     * @param data   data
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithoutData(String msg, Type data) {

        return ResultEntity.successWithoutData(0, msg, data);
    }

    /**
     * 返回成功，携带状态吗
     *
     * @param code   code
     * @param msg    msg
     * @param data   data
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> successWithoutData(Integer code, String msg, Type data) {

        return new ResultEntity<>(code, msg, data);
    }

    /**
     * 返回失败 携带状态码返回值与数据
     *
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> failed(Integer code, String msg, Type data) {

        return new ResultEntity<>(code, msg, data);
    }

    /**
     * 返回失败 返回消息以及值
     *
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> failed(String msg, Type data) {

        return ResultEntity.failed(-1, msg, data);
    }

    /**
     * 返回失败 不携带数据
     *
     * @param <Type>
     * @return
     */
    public static <Type> ResultEntity<Type> failed() {
        return new ResultEntity<>(-1, FAILED, null);
    }
}
