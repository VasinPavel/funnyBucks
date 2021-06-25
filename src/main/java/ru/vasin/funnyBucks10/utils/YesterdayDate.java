package ru.vasin.funnyBucks10.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Component
public class YesterdayDate {
    final Calendar calendar;
    final private DateFormat dateFormat;

    public YesterdayDate (@Value("${data.format}") String strDateFormat) {
        dateFormat = new SimpleDateFormat(strDateFormat);
        calendar = Calendar.getInstance();
    }

    public String getYesterdayDate() {
        calendar.add(Calendar.DATE, -1);
        return dateFormat.format(calendar.getTime());
    }
}