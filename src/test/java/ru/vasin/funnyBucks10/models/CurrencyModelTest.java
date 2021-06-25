package ru.vasin.funnyBucks10.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class CurrencyModelTest {
    @DisplayName("Проверяем создание модели котировок")
    @Test
    void shouldToHaveCorrectConstructor() {
        Map<String,Double> rates = Map.of("TEST", 123.4);
        CurrencyModel currencyModel = new CurrencyModel("TEST",rates);

        assertEquals("TEST", currencyModel.getBase());
        assertTrue(rates.equals(currencyModel.getRates()));
    }
}