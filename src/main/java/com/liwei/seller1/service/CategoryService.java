package com.liwei.seller1.service;

import com.liwei.seller1.dataObject.ProductCategory;

import java.util.List;

/**
 * Created by liwei on 2017/12/18.
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);

    ProductCategory save(ProductCategory productCategory);
}
