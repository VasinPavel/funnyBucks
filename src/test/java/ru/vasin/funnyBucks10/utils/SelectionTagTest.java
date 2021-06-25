package ru.vasin.funnyBucks10.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTagTest {
    private static final String RICH = "rich";
    private static final String BROKE = "broke";

    @DisplayName("Проверяем возвращение тегов для получения gif")
    @Test
    void shouldToGetTag() {
        SelectionTag selectionTag = new SelectionTag();
        Double less = 1.1;
        Double more = 2.2;

        //for case when todaey course more then yesterday
        String actualTag = selectionTag.getTag(more,less);
        Assertions.assertEquals(RICH,actualTag);

        String actualTag2 = selectionTag.getTag(less,more);
        Assertions.assertEquals(BROKE,actualTag2);
    }
}