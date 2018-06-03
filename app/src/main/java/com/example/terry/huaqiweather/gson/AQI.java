package com.example.terry.huaqiweather.gson;

import java.util.SimpleTimeZone;

/**
 * Created by terry on 2018/5/30.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
