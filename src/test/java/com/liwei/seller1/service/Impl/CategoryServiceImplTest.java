package com.liwei.seller1.service.Impl;

import com.liwei.seller1.dataObject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by liwei on 2017/12/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void testFindAll() throws Exception {

    }

    @Test
    public void testFindOne() throws Exception {

        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());

    }

    @Test
    public void testFindByCategoryTypeIn() throws Exception {

    }

    @Test
    public void testSave() throws Exception {

    }
}