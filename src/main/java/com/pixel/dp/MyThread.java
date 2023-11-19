package com.pixel.dp;

import java.util.Calendar;

public class MyThread implements Runnable{
    @Override
    public void run() {
        Calendar myCalendar = CalendarSingleton.INSTANCE.getCalendar();
        System.out.println(myCalendar.toInstant() + " " + Thread.currentThread().getName() + " " + myCalendar.hashCode());
    }
}
