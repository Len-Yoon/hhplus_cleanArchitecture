package org.hhplus.clean_architecture.hhplustcleanarchitecture.service.lecture.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class LectureApplyControllerTest {

    @Autowired
    MockMvc mockMvc;

    private ObjectMapper objectMapper;

    @Test
    @DisplayName("특강 리스트 조회 검증")
    void checkLectures() throws Exception {
        int userId = 1;

        mockMvc.perform(get("/lectures"))
                .andDo(print())
                .andExpect(status().isOk());


    }

    @Test
    @DisplayName("특강 신청 검증")
    void apply() throws Exception {
        mockMvc.perform(post("/lectures/apply?lectureId="+1+"&userId="+4))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    @DisplayName("신청한 특강 목록 조회")
    void application() throws Exception {
        int userId = 1;

        mockMvc.perform(get("/lectures/application/"+userId))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();


    }
}