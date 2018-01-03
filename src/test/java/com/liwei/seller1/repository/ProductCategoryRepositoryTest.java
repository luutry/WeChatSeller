package com.liwei.seller1.repository;

import com.liwei.seller1.dataObject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liwei on 2017/11/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Transactional
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);

        log.info("---------"+ productCategory);

        Assert.assertNotNull(productCategory);

        System.out.println(productCategory.toString());

    }

    @Test
    public void findByCategoryTypeInTest(){

        List<Integer> list = Arrays.asList(2,3,4);
        repository.findByCategoryTypeIn(list);
    }

}