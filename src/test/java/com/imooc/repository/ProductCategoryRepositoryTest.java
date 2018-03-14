package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Author fz
 * @Date 2018-03-09 16:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repo;

    @Test
    public void Test(){
        ProductCategory test = repo.findOne(1);
        System.out.println(test);
    }

    @Test
    public void AddTest(){
        ProductCategory test = repo.findOne(1);
        test.setCategoryName("test22333");

//        test.setCategoryType(66);
        repo.save(test);
//        System.out.println(test);
    }

}