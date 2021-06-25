package ru.vasin.funnyBucks10.utils;

public class SelectionTag {
    public String getTag(Double todaysСourse, Double yesterdayCourse) {
        return todaysСourse > yesterdayCourse ? "rich" : "broke";
    }
}
