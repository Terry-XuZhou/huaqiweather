package com.example.terry.huaqiweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by terry on 2018/5/24.
 */


public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String provinceName){
        this.cityName=provinceName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int provinceCode){
        this.cityCode=provinceCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}

