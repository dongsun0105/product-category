package com.musinsa.product.category.dto.res;

import com.musinsa.product.category.entity.ProductCategory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.ObjectUtils;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
public class CategoryRes extends SubCategoryRes {
    private List<SubCategoryRes> subCategories;

    public CategoryRes(ProductCategory productCategory) {
        super(productCategory);
    }

    public CategoryRes(ProductCategory productCategory, List<ProductCategory> subCategories) {
        super(productCategory);
        this.subCategories = ObjectUtils.isEmpty(subCategories) ? null : subCategories.stream()
                .map(subCategory -> new SubCategoryRes(subCategory))
                .collect(Collectors.toList());
    }
}
