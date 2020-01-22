package com.boob.sw.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");


    /**
     * 将带小时日期转变为年月日日期
     *
     * @param currentTime
     * @return
     */
    public static Date parseTimeToDate(Date currentTime) {
        String format = simpleDateFormat.format(currentTime);
        Date currentDate = null;
        try {
            currentDate = simpleDateFormat.parse(format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return currentDate;
    }

}
