package com.musinsa.product.category.entity;

import com.musinsa.product.category.constants.CategoryStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long categoryId;
    private Long parentCategoryId;
    private String name;
    private String status;
    private Integer ord;

    private Boolean deletedYn;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProductCategory(String name, Integer ord) {
        this.name = name;
        this.status = CategoryStatus.ACTIVE;
        this.ord = ord;
        this.deletedYn = false;
        this.createdAt = this.updatedAt = LocalDateTime.now();
    }

    public ProductCategory(Long parentCategoryId, String name, Integer ord) {
        this(name, ord);
        this.parentCategoryId = parentCategoryId;
    }

    public void updateProductCategory(Long parentCategoryId, String name, String status, Integer ord) {
        this.parentCategoryId = parentCategoryId;
        this.name = name;
        this.status = status;
        this.updatedAt = LocalDateTime.now();
        this.ord = ord;
    }

    public void updateDeletedYn(Boolean deletedYn) {
        this.deletedYn = deletedYn;
        this.updatedAt = LocalDateTime.now();
    }
}
