package com.musinsa.product.category;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.musinsa.product.category.dto.common.CommonResponseBody;
import com.musinsa.product.category.dto.req.CategoryInsertReq;
import com.musinsa.product.category.dto.req.CategoryUpdateReq;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith({SpringExtension.class})
@Transactional
public class ProductCategoryControllerTest {

    private static final String BASIC_URL = "/product/category";

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .addFilters(new CharacterEncodingFilter("UTF-8", true))
                .alwaysDo(print())
                .build();
    }

    private String getResponseCode(MvcResult result) throws Exception {
        return objectMapper
                .readValue(result.getResponse().getContentAsString(), CommonResponseBody.class)
                .getCode();
    }

    @Test
    @DisplayName("상품 카테고리 전체 조회")
    void get_all_categories() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASIC_URL))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("0", getResponseCode(result));
    }

    @Test
    @DisplayName("상품 카테고리 조회")
    void get_category() throws Exception {
        Long categoryId = 1L;

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASIC_URL + "/" + categoryId))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("0", getResponseCode(result));
    }

    @Test
    @DisplayName("상품 카테고리 전체 조회 - ID 미존재 예외")
    void get_category_invalid_id_exception() throws Exception {
        Long categoryId = 9999L;

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(BASIC_URL + "/" + categoryId))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("ERR001", getResponseCode(result));
    }

    @Test
    @DisplayName("상품 카테고리 추가")
    void insert_category() throws Exception {
        CategoryInsertReq req = new CategoryInsertReq();
        req.setName("추가 카테고리 1");
        req.setOrd(25);

        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.post(BASIC_URL)
                        .content(objectMapper.writeValueAsString(req))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("0", getResponseCode(result));
    }

    @Test
    @DisplayName("상품 카테고리 수정")
    void update_category() throws Exception {
        CategoryUpdateReq req = new CategoryUpdateReq();
        req.setCategoryId(1L);
        req.setName("수정 카테고리 1");
        req.setOrd(1);
        req.setStatus("ACTIVE");

        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.put(BASIC_URL)
                        .content(objectMapper.writeValueAsString(req))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("0", getResponseCode(result));
    }

    @Test
    @DisplayName("상품 카테고리 추가 - ID 미존재 예외")
    void update_category_invalid_id_exception() throws Exception {
        CategoryUpdateReq req = new CategoryUpdateReq();
        req.setCategoryId(9999L);
        req.setName("수정 카테고리 1");
        req.setOrd(1);
        req.setStatus("ACTIVE");

        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.put(BASIC_URL)
                        .content(objectMapper.writeValueAsString(req))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("ERR001", getResponseCode(result));
    }

    @Test
    @DisplayName("상품 카테고리 삭제")
    void delete_category() throws Exception {
        Long categoryId = 1L;

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.delete(BASIC_URL + "/" + categoryId))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("0", getResponseCode(result));
    }

    @Test
    @DisplayName("상품 카테고리 삭제 - ID 미존재 예외")
    void delete_category_invalid_id_exception() throws Exception {
        Long categoryId = 9999L;

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.delete(BASIC_URL + "/" + categoryId))
                .andExpect(status().isOk())
                .andReturn();

        assertEquals("ERR001", getResponseCode(result));
    }
}
