package com.yzeng.qf.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateKit {

    /**
     * 得到当前系统时间
     * @return 时间
     */
    public static String getNowTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date;
        date = format.format(new Date());
        return date;
    }
}
