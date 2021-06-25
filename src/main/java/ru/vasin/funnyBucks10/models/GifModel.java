package ru.vasin.funnyBucks10.models;

import lombok.Data;

import java.util.Map;

@Data
public class GifModel {
    private GifModel data;
    private Image images;

    @Data
    public class Image {
        private Map<String, String> original;
    }
}
