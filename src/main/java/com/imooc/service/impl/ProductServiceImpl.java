package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.enums.ProductStatusEnum;
import com.imooc.repository.ProductInfoRepository;
import com.imooc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author fz
 * @Date 2018-03-09 15:22
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;


    @Override
    public ProductInfo findOne(String productId) {
        return null;
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return this.productInfoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }

}