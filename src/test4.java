/**
 * meituan.com Inc.
 * Copyright (c) 2010-2020 All Rights Reserved.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 * @author chenpeng
 * @version :test4.java v1.0 2020/8/5 5:59 下午 chenpeng Exp $
 */
public class test4 {

    public static void main(String[] args) throws ParseException {
        String str = "2020-07-22 23:07:05";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String x1 = "2018-06-05 10:11";
        String x2 = "2018-06-05 10:08";

        Date date1 = sdf.parse(x1);
        Date date2 = sdf.parse(x2);

        System.out.println(date1.getTime() > date2.getTime());

    }
}
