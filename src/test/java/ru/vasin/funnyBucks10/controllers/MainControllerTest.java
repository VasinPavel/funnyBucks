package ru.vasin.funnyBucks10.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class MainControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MainController controller;

    @DisplayName("Проверяем ответ от /main")
    @Test
    public void testConnectToMain() throws Exception {
        this.mockMvc.perform(get("/main"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("FunnyBucks")));

    }

    @DisplayName("Проверяем ответ от main/randomGIF")
    @Test
    public void testConnectToRandomGIF() throws Exception {
        this.mockMvc.perform(get("/main/RUB"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("FunnyBucks")));
    }
}