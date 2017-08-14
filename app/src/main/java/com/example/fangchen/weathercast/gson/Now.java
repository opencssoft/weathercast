package com.example.fangchen.weathercast.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangchen on 2017/8/12.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
