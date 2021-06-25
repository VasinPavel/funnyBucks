package ru.vasin.funnyBucks10.clients;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CurrencyClientTest {
    @ComponentScan(basePackages = "ru.vasin.funnyBucks10.clients")
    static class FeignConfiguration {}

    @Autowired
    private CurrencyClient currencyClient;

    @DisplayName("Проверяем получение котировок")
    @Test
    void shouldToGetNotNullObject() {
        assertNotNull(currencyClient.getCurrentToday());
        assertNotNull(currencyClient.getCurrentYesterday("2021-06-24"));
    }
}