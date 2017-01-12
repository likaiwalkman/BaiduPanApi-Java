package com.baidupanapi.util;

public class TimeUtil {

    public static String getSecondTime(){
        return String.valueOf(System.currentTimeMillis()).substring(0,10);
    }

}
