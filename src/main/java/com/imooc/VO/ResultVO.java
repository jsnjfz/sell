package com.imooc.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author fz
 * @Date 2018-03-09 15:22
 */
@Data
public class ResultVO<T> implements Serializable {

//    private static final long serialVersionUID = 3236329195874147801L;
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
