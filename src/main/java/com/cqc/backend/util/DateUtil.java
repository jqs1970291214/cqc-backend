

package com.cqc.backend.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {

    public static String DEFAULTDATEFORMAT = "yyyy-MM-dd";

    public static Date convertStringToDate(String dateStr) {
        return convertStringToDate(DEFAULTDATEFORMAT, dateStr);
    }

    public static Date convertStringToDate(String pattern, String dateStr) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }
        DateTime dateTime = ConvertStringToDateTime(pattern, dateStr);
        if (dateTime == null) {
            return null;
        }
        return dateTime.toDate();
    }


    public static DateTime ConvertStringToDateTime(String pattern, String dateStr) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern(pattern);
        DateTime dateTime;
        dateTime = formatter.parseDateTime(dateStr);
        return dateTime;
    }

    public static String ConvertDateToString(String pattern, Date date) {
        DateFormat formatPattern = new SimpleDateFormat(pattern);
        return formatPattern.format(date);
    }

    public static String ConvertDateToString(Date date) {
        return ConvertDateToString(DEFAULTDATEFORMAT, date);
    }

    /**
     * 获取日期差
     *
     * @param smallDate
     * @param bigDate
     * @return
     * @throws ParseException
     */
    public static int daysBetween(Date smallDate, Date bigDate) {
        long between_days;
        Calendar cal = Calendar.getInstance();

        cal.setTime(smallDate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bigDate);
        long time2 = cal.getTimeInMillis();
        between_days = (time2 - time1) / (1000 * 3600 * 24);

        return Integer.parseInt(String.valueOf(between_days));
    }

}
