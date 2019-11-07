package com.liuhongyin.mybatispluslearn.common.api;

/**
 * 封装API的错误码
 * Created by liuhongyin on 2019/11/07.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
