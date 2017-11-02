package com.example.fangchen.weathercast;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Vibrator;
import com.baidu.location.service.LocationService;
import com.baidu.mapapi.SDKInitializer;

import org.litepal.LitePal;

/**
 * Created by fangchen on 2017/10/11.
 */

public class WeatherApplication extends Application {
    public LocationService locationService;
    public Vibrator mVibrator;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
        LitePal.initialize(context);

        locationService = new LocationService(context);
        mVibrator =(Vibrator)context.getSystemService(Service.VIBRATOR_SERVICE);
        SDKInitializer.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}




