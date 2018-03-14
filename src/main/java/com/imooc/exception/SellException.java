package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by fz on 2018-03-14.
 */
public class SellException extends RuntimeException {

    private Integer code;
    private String message;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
