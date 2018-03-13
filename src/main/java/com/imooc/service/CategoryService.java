package com.imooc.service;


import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author fz
 * @Date 2018-03-09 15:22
 */

public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
