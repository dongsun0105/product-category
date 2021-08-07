package com.musinsa.product.category.controller;

import com.musinsa.product.category.dto.common.CommonResponse;
import com.musinsa.product.category.dto.req.CategoryInsertReq;
import com.musinsa.product.category.dto.req.CategoryUpdateReq;
import com.musinsa.product.category.dto.res.CategoryRes;
import com.musinsa.product.category.service.ProductCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/product/category")
@RestController
@RequiredArgsConstructor
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    @GetMapping
    public CommonResponse<List<CategoryRes>> getCategoryList() throws Exception {
        return new CommonResponse<>(productCategoryService.getCategoryList());
    }

    @GetMapping("/{categoryId}")
    public CommonResponse<CategoryRes> getCategory(@PathVariable Long categoryId) throws Exception {
        return new CommonResponse<>(productCategoryService.getCategory(categoryId));
    }

    @PostMapping
    public CommonResponse<Void> insertCategory(@RequestBody @Valid CategoryInsertReq categoryInsertReq) throws Exception {
        productCategoryService.insertCategory(categoryInsertReq);
        return new CommonResponse<>();
    }

    @PutMapping
    public CommonResponse<Void> updateCategory(@RequestBody @Valid CategoryUpdateReq categoryUpdateReq) throws Exception {
        productCategoryService.updateCategory(categoryUpdateReq);
        return new CommonResponse<>();
    }

    @DeleteMapping("/{categoryId}")
    public CommonResponse<Void> deleteCategory(@PathVariable Long categoryId) throws Exception {
        productCategoryService.deleteCategory(categoryId);
        return new CommonResponse<>();
    }

}
