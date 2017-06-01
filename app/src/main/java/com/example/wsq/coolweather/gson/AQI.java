package com.example.wsq.coolweather.gson;

/**
 * Created by wsq on 2017/5/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
