package com.example.fangchen.weathercast.gson;

/**
 * Created by fangchen on 2017/8/12.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}


