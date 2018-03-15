package com.imooc.dto;

import lombok.Data;

/**
 * @Author fz
 * @Date 2018-03-15 15:40
 * 
 */
@Data
public class CartDTO {
    /**
     * 商品Id.
     */
    private String productId;

    /**
     * 数量.
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
