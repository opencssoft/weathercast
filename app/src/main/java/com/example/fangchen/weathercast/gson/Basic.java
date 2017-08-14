package com.example.fangchen.weathercast.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangchen on 2017/8/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
