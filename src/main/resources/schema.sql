DROP TABLE product_category IF EXISTS;

CREATE TABLE product_category (
    category_id bigint NOT NULL auto_increment,
    parent_category_id bigint NULL,
    name varchar(30) NOT NULL,
    status varchar(10) NOT NULL,
    ord integer NOT NULL,
    deleted_yn boolean NOT NULL,
    created_at timestamp NOT NULL,
    updated_at timestamp NOT NULL,
    CONSTRAINT PK_category_id PRIMARY KEY (category_id)
);