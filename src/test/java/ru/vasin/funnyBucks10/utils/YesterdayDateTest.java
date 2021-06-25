package ru.vasin.funnyBucks10.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class YesterdayDateTest {
    @Configuration
    @Import(YesterdayDate.class)
    static class YesterDayConfiguration { }

    @Autowired
    private YesterdayDate yesterdayDate;

    @DisplayName("Проверяем формат даты")
    @Test
    void shouldToHaveRightFormat() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            format.parse(yesterdayDate.getYesterdayDate());
            Assertions.assertTrue(true);
        } catch (ParseException e) {
            Assertions.fail("Формат даты неверный");
        }
    }
}