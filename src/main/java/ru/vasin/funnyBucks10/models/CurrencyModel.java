package ru.vasin.funnyBucks10.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Map;

@Data
@AllArgsConstructor
public class CurrencyModel {
    private String base;
    private Map<String, Double> rates;
}