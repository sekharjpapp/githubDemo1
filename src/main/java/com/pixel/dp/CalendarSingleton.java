package com.pixel.dp;

import java.util.Calendar;

public enum CalendarSingleton {

    INSTANCE;

    private Calendar calendar;

    CalendarSingleton() {
        calendar = Calendar.getInstance();
    }

    public Calendar getCalendar() {
        return calendar;
    }
}
