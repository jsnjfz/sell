package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author fz
 * @Date 2018-03-09 15:29
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {


//    /**
//     * 通过类目id查找类目
//     * @param categoryTypeList
//     * @return
//     */
//    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
