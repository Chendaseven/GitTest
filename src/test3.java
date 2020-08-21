/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test3.java v1.0 2020/7/6 11:00 上午 chenpeng Exp $
 */
public class test3 {

    public static void main(String[] args) {
        //字符串转时间格式
//        String str = "2017-09-28 17:07:05";
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        //LocalDateTime转为Date
//        LocalDateTime localDateTime = LocalDateTime.parse(str,dtf);
//        Instant instant = localDateTime.atOffset(ZoneOffset.ofHours(8)).toInstant();
//        Date date = Date.from(instant);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(date);
//        System.out.println(date.getTime());
//        System.out.println(format);

//        Date date = new Date();
//        Instant instant = date.toInstant();
//        LocalDate localDate1 = instant.atOffset(ZoneOffset.ofHours(8)).toLocalDate();
//        LocalDateTime localDateTime1 = instant.atOffset(ZoneOffset.ofHours(8)).toLocalDateTime();
//        System.out.println(localDate1);
        LocalDate now = LocalDate.now();
        System.out.println(now);

        String str = "2020-07-27 23:07:05";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //LocalDateTime转为Date
        LocalDate localDate2 = LocalDate.parse(str,dtf);
        LocalDateTime localDateTime2 = LocalDateTime.parse(str,dtf);
        System.out.println(localDate2);

        Period per = Period.between(now,localDate2);
        long between1 = ChronoUnit.DAYS.between(localDate2, now);
        System.out.println(15 - between1);


    }
}
