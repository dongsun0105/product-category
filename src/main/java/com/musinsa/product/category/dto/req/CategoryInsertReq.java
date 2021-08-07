package com.musinsa.product.category.dto.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
public class CategoryInsertReq {
    private Long parentCategoryId;
    @NotEmpty
    private String name;
    @NotNull
    private Integer ord;
}
