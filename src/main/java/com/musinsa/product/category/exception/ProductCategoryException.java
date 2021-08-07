package com.musinsa.product.category.exception;

import lombok.Getter;

@Getter
public class ProductCategoryException extends RuntimeException {
    private String code;
    private String message;

    public ProductCategoryException(ExceptionCode exceptionCode) {
        super();
        this.code = exceptionCode.getCode();
        this.message = exceptionCode.getMessage();
    }
}
