package test;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.*;
import java.sql.*;
import java.util.Date;


public class DateClass {
    public static void main(String[] args) throws java.text.ParseException {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM/d HH:mm:ss");
        String format = dateFormat.format(LocalDateTime.now());
        Collections collections;
        System.out.println(format);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM/d");
        String formatS = simpleDateFormat.format(new java.sql.Date(System.currentTimeMillis()));
        System.out.println(formatS);
        String str = "2023-05/7";
        java.util.Date date = simpleDateFormat.parse(str);
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
        System.out.println("clock: " + Clock.systemDefaultZone().instant());
        System.out.println("calendar: " + Calendar.getInstance(Locale.KOREAN).getTime());

        Date date1 = new Date(System.currentTimeMillis());
        Date.from(Instant.now());
        date1.setTime(-100000000l);
        date1.compareTo(new Date(System.currentTimeMillis()));
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println("display: " + calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault()));
        System.out.println("max: " + calendar.getActualMaximum(Calendar.YEAR));
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2024, 12, 5);
        System.out.println(Arrays.toString(Calendar.getAvailableLocales()));
        System.out.println("date1: " + date1);
        System.out.println(Locale.ENGLISH.getDisplayCountry());
        Locale english = Locale.of("English", "English");
        System.out.println(english.getCountry());
        System.out.println(ZoneId.getAvailableZoneIds());
        TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("America/Cuiaba"));
        java.sql.Date date3 = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate1 = LocalDate.now();
        localDate1.get(ChronoField.DAY_OF_WEEK);
        LocalDateTime localDateTime = LocalDateTime.now();
        localDate1.isAfter(localDate1);
        localDate1.isAfter(ChronoLocalDate.from(localDateTime));
        System.out.println(localDateTime.minus(Duration.ofDays(5)));
        ValueRange range = localDate1.range(ChronoField.DAY_OF_WEEK);
        LocalDate localDate2 = localDate1.withYear(2025);
        System.out.println(localDate2);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(YearMonth.now());
        System.out.println(MonthDay.now());
    }
}
