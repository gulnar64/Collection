package test;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.sql.*;
import java.util.Locale;

public class DateClass {
    public static void main(String[] args) throws java.text.ParseException {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM/d HH:mm:ss");
        String format = dateFormat.format(LocalDateTime.now());
        Collections collections;
        System.out.println(format);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM/d");
        String formatS = simpleDateFormat.format(new Date());
        System.out.println(formatS);
        String str = "2023-05/7";
        Date date = simpleDateFormat.parse(str);
        System.out.println("date: " + date);
        date.setTime(1000000000l);
        System.out.println(simpleDateFormat.format(date));
        System.out.println(str);
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate:" + LocalDate.now());
        System.out.println("LocalDateTime:" + LocalDateTime.now());
        System.out.println("localTime" + LocalTime.now());
        System.out.println("date:" + new Date());
        System.out.println("sql date: " + new java.sql.Date(System.currentTimeMillis()));
        System.out.println( "clock: " + Clock.systemDefaultZone().instant());
        System.out.println( "calendar: " + Calendar.getInstance(Locale.KOREAN).getTime());

    }
}
