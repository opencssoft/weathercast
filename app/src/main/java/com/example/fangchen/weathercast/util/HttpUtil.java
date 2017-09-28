package com.example.fangchen.weathercast.util;

import okhttp3.*;

/**
 * Created by fangchen on 2017/8/11.
 */

public class HttpUtil {

    private static OkHttpClient mClient;

    private static HttpUtil instance;

    private HttpUtil() {
        if (mClient == null) {
            mClient = new OkHttpClient();
        }
    }

    public synchronized static HttpUtil getInstance() {
        if (instance == null) {
            instance = new HttpUtil();
        }

        return instance;
    }

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        Request request = new Request.Builder().url(address).build();
        mClient.newCall(request).enqueue(callback);
    }
}
