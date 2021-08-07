package com.musinsa.product.category.repository;

import com.musinsa.product.category.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    List<ProductCategory> findAllByDeletedYnIsFalseAndParentCategoryIdIsNullOrderByOrd();
    List<ProductCategory> findAllByDeletedYnIsFalseAndParentCategoryIdIsNotNullOrderByOrd();
    ProductCategory findByCategoryIdAndParentCategoryIdIsNullAndDeletedYnIsFalse(Long categoryId);
    List<ProductCategory> findAllByParentCategoryIdAndDeletedYnIsFalseOrderByOrd(Long parentCategoryId);
    ProductCategory findByCategoryIdAndDeletedYnIsFalse(Long categoryId);
}
