/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version test2:test2.java v1.0 2020/6/2 2:15 下午 chenpeng Exp $
 */
public class test2 {
    private final static String format = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
//        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        Instant instant = date.toInstant();
        LocalDateTime localDateTime1 = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.ofHours(8)).toLocalDateTime();
        LocalDateTime localDateTime2 = instant.atOffset(ZoneOffset.ofHours(0)).toLocalDateTime();
//        instant.atOffset(ZoneOffset)
        System.out.println(localDateTime.format(dtf));
        System.out.println(dtf.format(localDateTime));

        System.out.println(dtf.format(localDateTime1));
        System.out.println(dtf.format(localDateTime2));

    }

    public static void test(){
        //字符串转时间格式
        String str = "2017-09-28 17:07:05";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);

        LocalDateTime parse = LocalDateTime.parse(str, dtf);
        //LocalDateTime转为Date
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = null;
        Instant instant = localDateTime.atOffset(ZoneOffset.ofHours(8)).toInstant();
        Date date = Date.from(instant);
        System.out.println(date.getTime());
    }
}
