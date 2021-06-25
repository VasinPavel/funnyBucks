package ru.vasin.funnyBucks10.clients;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GifClientTest {
    @Import(GifClient.class)
    static class GifConfiguration {}

    @Autowired
    private GifClient gifClient;

    @DisplayName("Проверяем получение Gif")
    @Test
    void shouldGetNotNullGifs(){
        assertNotNull(gifClient.getPicture("rich"));
        assertNotNull(gifClient.getPicture("broke"));
    }
}