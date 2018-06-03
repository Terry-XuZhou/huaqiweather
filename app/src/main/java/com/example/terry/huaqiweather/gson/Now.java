package com.example.terry.huaqiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by terry on 2018/5/30.
 */

public class Now {
    @SerializedName("tmp")
    public String tempreature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
