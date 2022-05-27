package com.example.wechatdemo.wechat.utils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Objects;

public class TimeUtil {
    public static final String YYYYMMDD = "yyyyMMdd";

    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    public static final String DD_MM_YYYY = "dd-MM-yyyy";

    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static final String MMDD = "MMdd";

    public static final String FULL_DATE_TIME_FORMAT_IN = "dd-MM-yyyy HH:mm:ss:SS";

    public static final String SIMPLE_DATE_TIME = "yyyyMMdd HH:mm:ss";
    public static final String SIMPLE_DATE_TIME_MILLI = "yyyyMMdd HH:mm:ss SSS";

    public static final String MMDDYYYY = "MM/dd/yyyy";

    public static final String YYYY_MM_DD_HHMMSS = "yyyy-MM-dd HH:mm:ss";

    public static Long localDateTimeToEpochMilli(String date, String pattern, ZoneId zoneId) {
        LocalDateTime dateTime = toLocalDateTime(date, pattern);
        return toEpochMilli(dateTime, zoneId);
    }

    public static Long localDateToEpochMilli(String date, String pattern, ZoneId zoneId) {
        LocalDate dateTime = toLocalDate(date, pattern);
        return toEpochMilli(dateTime.atStartOfDay(), zoneId);
    }

    public static LocalDateTime toLocalDateTime(String date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(date, formatter);
    }

    public static LocalDate toLocalDate(String date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(date, formatter);
    }

    public static Long toEpochMilli(LocalDateTime dateTime, ZoneId zoneId) {
        return Objects.isNull(dateTime) ? null : dateTime.atZone(zoneId).toInstant().toEpochMilli();
    }

    public static Long toEpochMilli(LocalDate dateTime, ZoneId zoneId) {
        return Objects.isNull(dateTime) ? null : dateTime.atStartOfDay().atZone(zoneId).toInstant().toEpochMilli();
    }

    public static String format(LocalDate localDate, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(localDate);
    }

    public static LocalDateTime toLocalDateTime(Long timestamp, ZoneId zoneId) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), zoneId);
    }

    public static String format(LocalDateTime localDateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(localDateTime);
    }

//    /**
//     * 服务时间判断
//     */
//    public static boolean isServiceTime(ServiceRangeResp serviceRange) {
//        LocalTime now = LocalTime.now();
//        boolean isServiceTime;
//        if (serviceRange.getStartTime().isBefore(serviceRange.getEndTime())) {
//            isServiceTime = now.isAfter(serviceRange.getStartTime()) && now.isBefore(serviceRange.getEndTime());
//        } else {
//            isServiceTime = !(now.isAfter(serviceRange.getEndTime()) && now.isBefore(serviceRange.getStartTime()));
//        }
//        return isServiceTime;
//    }

    /**
     * 返回当天剩余毫秒数
     */
    public static long getTodayRemainMs() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endOfDay = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        Duration between = Duration.between(now, endOfDay);
        return between.toMillis();
    }

    public static LocalDate date2LocalDate(Date date) {
        if (null == date) {
            return null;
        }
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * LocalDate实例转Date实例
     * @param localDate
     * @return Date实例
     */
    public static Date localDateToDate(LocalDate localDate) {
        Instant instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        return Date.from(instant);
    }

    /**
     * 获取当天的开始时间
     *
     * @return
     */
    public static Long getBeginTimeForDay(Long currentTime) {
        if (Objects.isNull(currentTime)) {
            currentTime = System.currentTimeMillis();
        }
        LocalDate localDate = Instant.ofEpochMilli(currentTime).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime startToday = LocalDateTime.of(localDate, LocalTime.MIN);
        return startToday.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当天的结束时间
     *
     * @return
     */
    public static Long getEndTimeForDay() {
        LocalDateTime endToday = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
        return endToday.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当月的开始时间
     *
     * @return
     */
    public static Long getBeginTimeForMonth() {
        LocalDateTime startToday = LocalDateTime.now().withDayOfMonth(1).truncatedTo(ChronoUnit.DAYS);
        return startToday.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当月的结束时间
     *
     * @return
     */
    public static Long getEndTimeForMonth() {
        LocalDateTime startToday = LocalDateTime.now().plusMonths(1).withDayOfMonth(1).truncatedTo(ChronoUnit.DAYS).plus(-1, ChronoUnit.MILLIS);
        return startToday.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static Long getTimeBeforeOrAfter(Long currentTime, long days) {
        if (Objects.isNull(currentTime)) {
            currentTime = System.currentTimeMillis();
        }
        LocalDateTime localDateTime = Instant.ofEpochMilli(currentTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime plusTime = localDateTime.plusDays(days);
        return plusTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();
        Long now = TimeUtil.toEpochMilli(LocalDateTime.now(), ZoneId.systemDefault());
        now = now+ 2*24*3600*1000;
        System.out.println(now);
    }
}
