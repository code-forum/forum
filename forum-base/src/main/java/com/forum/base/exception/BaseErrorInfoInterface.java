package com.forum.base.exception;

/**
 * 通用异常接口.
 *
 * @author li
 * @since 2022/9/16 15:35
 */
public interface BaseErrorInfoInterface {

    /**
     * 获取返回码.
     *
     * @return 返回码
     */
    String getResultCode();

    /**
     * 获取结果信息.
     *
     * @return 结果信息
     */
    String getResultMsg();
}