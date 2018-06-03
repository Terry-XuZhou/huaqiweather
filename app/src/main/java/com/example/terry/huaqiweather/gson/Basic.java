package com.example.terry.huaqiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by terry on 2018/5/30.
 */

public class Basic {
    @SerializedName("location")
    public String cityName;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
