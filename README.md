# 상품 카테고리 관리
- 상품 카테고리를 등록/수정/삭제할 수 있어야 한다.
- 상위 카테고리를 이용해 해당 카테고리의 전체 하위 카테고리를 조회할 수 있어야 한다.
- 상위 카테고리 미지정 시 전체 카테고리를 조회한다.

## Environment
- JAVA 11
- Spring Boot 2.5.3
- H2 Database
- JPA
- JUnit5

## Build
```
gradle build
```

## Execution
```
java -jar build/libs/product-category-1.0.0.jar
```
