package com.musinsa.product.category.repository;

import com.musinsa.product.category.entity.ProductCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    private final static int PARENT_CATEGORIES_TOTAL_COUNT = 23;
    private final static int SUB_CATEGORIES_TOTAL_COUNT = 175;
    private final static int TOP_SUB_CATEGORIES_COUNT = 9;

    @Test
    @DisplayName("상위 카테고리 전체 조회")
    void get_all_parent_categories() throws Exception {
        List<ProductCategory> categoryList =
                productCategoryRepository.findAllByDeletedYnIsFalseAndParentCategoryIdIsNullOrderByOrd();

        assertEquals(categoryList.size(), PARENT_CATEGORIES_TOTAL_COUNT);
    }

    @Test
    @DisplayName("하위 카테고리 전체 조회")
    void get_all_sub_categories() throws Exception {
        List<ProductCategory> categoryList =
                productCategoryRepository.findAllByDeletedYnIsFalseAndParentCategoryIdIsNotNullOrderByOrd();

        assertEquals(categoryList.size(), SUB_CATEGORIES_TOTAL_COUNT);
    }

    @Test
    @DisplayName("특정 카테고리 하위 카테고리 조회")
    void get_sub_categories() throws Exception {
        Long parentCategoryId = 1L;

        List<ProductCategory> categoryList =
                productCategoryRepository.findAllByParentCategoryIdAndDeletedYnIsFalseOrderByOrd(parentCategoryId);

        assertEquals(categoryList.size(), TOP_SUB_CATEGORIES_COUNT);
    }

    @Test
    @DisplayName("상위 카테고리 조회")
    void get_parent_category() throws Exception {
        Long categoryId = 1L;

        ProductCategory productCategory =
                productCategoryRepository.findByCategoryIdAndParentCategoryIdIsNullAndDeletedYnIsFalse(categoryId);

        assertEquals(categoryId, productCategory.getCategoryId());
    }

    @Test
    @DisplayName("카테고리 조회")
    void get_category() throws Exception {
        Long categoryId = 24L;

        ProductCategory productCategory =
                productCategoryRepository.findByCategoryIdAndDeletedYnIsFalse(categoryId);

        assertEquals(categoryId, productCategory.getCategoryId());
    }
}
