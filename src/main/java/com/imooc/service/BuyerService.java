package com.imooc.service;


import com.imooc.dto.OrderDTO;

/**
 * @Author fz
 * @Date 2018-03-16 16:19
 *
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
