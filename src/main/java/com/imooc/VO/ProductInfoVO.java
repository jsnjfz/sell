package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品详情
 * 出于安全考虑要再建一个类，只返回前端需要信息
 * @Author fz
 * @Date 2018-03-09 15:22
 */
@Data
public class ProductInfoVO implements Serializable {


    private static final long serialVersionUID = 5836171251278038743L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
