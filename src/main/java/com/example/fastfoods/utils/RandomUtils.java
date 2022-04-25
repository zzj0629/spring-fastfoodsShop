package com.example.fastfoods.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class RandomUtils {
    public static String createActive(){
        return getTime()+Integer.toHexString(new Random().nextInt(900)+100);
    }
    //设置时间戳
    public static String getTime(){
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(Calendar.getInstance().getTime());
    }
    //生成订单编号
    public static String createOrderId(){
        return getTime()+ UUID.randomUUID().toString();
    }
}
