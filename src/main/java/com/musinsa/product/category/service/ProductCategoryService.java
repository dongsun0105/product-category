package com.musinsa.product.category.service;

import com.musinsa.product.category.dto.req.CategoryInsertReq;
import com.musinsa.product.category.dto.req.CategoryUpdateReq;
import com.musinsa.product.category.dto.res.CategoryRes;
import com.musinsa.product.category.dto.res.SubCategoryRes;
import com.musinsa.product.category.entity.ProductCategory;
import com.musinsa.product.category.exception.ExceptionCode;
import com.musinsa.product.category.exception.ProductCategoryException;
import com.musinsa.product.category.repository.ProductCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    public CategoryRes getCategory(Long categoryId) throws Exception {
        ProductCategory productCategory =
                productCategoryRepository.findByCategoryIdAndParentCategoryIdIsNullAndDeletedYnIsFalse(categoryId);

        if (ObjectUtils.isEmpty(productCategory)) {
            throw new ProductCategoryException(ExceptionCode.ERR001);
        }

        CategoryRes categoryRes = new CategoryRes(productCategory);
        categoryRes.setSubCategories(
                productCategoryRepository.findAllByParentCategoryIdAndDeletedYnIsFalseOrderByOrd(categoryId).stream()
                        .map(subCategory -> new SubCategoryRes(subCategory))
                        .collect(Collectors.toList()));

        return categoryRes;
    }

    public List<CategoryRes> getCategoryList() throws Exception {
        List<ProductCategory> categoryList =
                productCategoryRepository.findAllByDeletedYnIsFalseAndParentCategoryIdIsNullOrderByOrd();

        Map<Long, List<ProductCategory>> subCategoryMap =
                productCategoryRepository.findAllByDeletedYnIsFalseAndParentCategoryIdIsNotNullOrderByOrd().stream()
                        .collect(Collectors.groupingBy(category -> category.getParentCategoryId()));

        return categoryList.stream()
                .map(category -> new CategoryRes(category, subCategoryMap.get(category.getCategoryId())))
                .collect(Collectors.toList());
    }

    public void insertCategory(CategoryInsertReq categoryInsertReq) throws Exception {
        ProductCategory productCategory = new ProductCategory(
                categoryInsertReq.getParentCategoryId(),
                categoryInsertReq.getName(),
                categoryInsertReq.getOrd());

        productCategoryRepository.save(productCategory);
    }

    public void updateCategory(CategoryUpdateReq categoryUpdateReq) throws Exception {
        ProductCategory productCategory =
                productCategoryRepository.findByCategoryIdAndDeletedYnIsFalse(categoryUpdateReq.getCategoryId());

        if (ObjectUtils.isEmpty(productCategory)) {
            throw new ProductCategoryException(ExceptionCode.ERR001);
        }

        productCategory.updateProductCategory(
                categoryUpdateReq.getParentCategoryId(),
                categoryUpdateReq.getName(),
                categoryUpdateReq.getStatus(),
                categoryUpdateReq.getOrd());

        productCategoryRepository.save(productCategory);
    }

    public void deleteCategory(Long categoryId) throws Exception {
        ProductCategory productCategory =
                productCategoryRepository.findByCategoryIdAndDeletedYnIsFalse(categoryId);

        if (ObjectUtils.isEmpty(productCategory)) {
            throw new ProductCategoryException(ExceptionCode.ERR001);
        }

        productCategoryRepository.delete(productCategory);
    }
}
