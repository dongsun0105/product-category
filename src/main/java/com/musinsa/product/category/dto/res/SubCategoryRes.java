package com.musinsa.product.category.dto.res;

import com.musinsa.product.category.entity.ProductCategory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class SubCategoryRes {
    private Long categoryId;
    private String name;
    private String status;
    private Integer ord;

    public SubCategoryRes(ProductCategory productCategory) {
        this.categoryId = productCategory.getCategoryId();
        this.name = productCategory.getName();
        this.status = productCategory.getStatus();
        this.ord = productCategory.getOrd();
    }
}
