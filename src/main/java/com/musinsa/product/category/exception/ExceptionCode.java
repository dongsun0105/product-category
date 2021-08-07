package com.musinsa.product.category.exception;

public enum ExceptionCode {

    ERR001("Category ID is invalid.");

    private String code;
    private String message;

    ExceptionCode(String message) {
        this.code = this.name();
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }
    public String getMessage() {
        return this.message;
    }
}
