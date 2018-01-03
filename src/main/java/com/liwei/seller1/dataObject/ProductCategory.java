package com.liwei.seller1.dataObject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * 类目表
 * Created by liwei on 2017/11/27.
 */
@Data
@Entity
@DynamicUpdate
public class ProductCategory {


    /* 类目ID. **/
    @Id
    @GeneratedValue
    private Integer categoryId;

    /* 类目名称. **/
    private String categoryName;

    /* 类目编号. **/
    private Integer categoryType;


    public ProductCategory() {
    }
}
