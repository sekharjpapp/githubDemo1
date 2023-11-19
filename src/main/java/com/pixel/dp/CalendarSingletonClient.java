package com.pixel.dp;

import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CalendarSingletonClient {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        MyThread myThread = new MyThread();
        try {
            executorService = Executors.newFixedThreadPool(10);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            executorService.execute(myThread);
            /*Calendar myCalendar = CalendarSingleton.INSTANCE.getCalendar();
            System.out.println(myCalendar.hashCode());
            System.out.println(myCalendar.toInstant());
            Calendar myCalendar1 = CalendarSingleton.INSTANCE.getCalendar();
            System.out.println(myCalendar1.toInstant());
            System.out.println(myCalendar1.hashCode());*/
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (executorService !=null) {
                executorService.shutdown();
            }
        }

    }
}
