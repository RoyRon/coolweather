package com.example.coolweather.gson;

/**
 * @author jiangyingfeng
 * on 2020/9/16
 **/
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
