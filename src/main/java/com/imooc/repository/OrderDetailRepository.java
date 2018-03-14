package com.imooc.repository;



import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author fz
 * @Date 2018-03-09 15:29
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {


    /**
     * 通过订单id查找订单详情
     * @param orderId
     * @return
     */
    List<OrderDetail> findByOrderId(String orderId);
}
