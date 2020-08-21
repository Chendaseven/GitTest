/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :TimeTest.java v1.0 2020/7/6 3:15 下午 chenpeng Exp $
 */
public class TimeTest {
        public static void main(String[] args) {
            String dataStr = "2020-02-02 12:12:12";
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(dataStr, dateTimeFormatter);
            System.out.println(localDateTime);

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String format = sdf.format(date.getTime());
            System.out.println(format);

            System.out.println(date.getTime());
            Date date1 = new Date(date.getTime());
            System.out.println(date1);
        }
    }
