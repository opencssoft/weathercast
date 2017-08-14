package com.example.fangchen.weathercast.util;

import okhttp3.*;

/**
 * Created by fangchen on 2017/8/11.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
