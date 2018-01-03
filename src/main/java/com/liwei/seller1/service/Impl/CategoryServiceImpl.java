package com.liwei.seller1.service.Impl;

import com.liwei.seller1.dataObject.ProductCategory;
import com.liwei.seller1.repository.ProductCategoryRepository;
import com.liwei.seller1.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liwei on 2017/12/18.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;


    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
