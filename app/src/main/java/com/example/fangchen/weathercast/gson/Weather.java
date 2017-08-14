package com.example.fangchen.weathercast.gson;

import com.google.gson.annotations.SerializedName;
import java.util.*;


/**
 * Created by fangchen on 2017/8/12.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
