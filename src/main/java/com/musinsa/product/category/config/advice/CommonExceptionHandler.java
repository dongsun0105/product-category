package com.musinsa.product.category.config.advice;

import com.musinsa.product.category.dto.common.CommonResponseBody;
import com.musinsa.product.category.exception.ProductCategoryException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@RequiredArgsConstructor
public class CommonExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<CommonResponseBody<String>> handleException(ProductCategoryException exception) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		CommonResponseBody commonResponseBody = new CommonResponseBody<String>(exception.getCode(), exception.getMessage());
		return new ResponseEntity<>(commonResponseBody, httpHeaders, HttpStatus.OK);
	}
}
