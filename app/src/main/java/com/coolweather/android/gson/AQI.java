package com.coolweather.android.gson;

/**
 * Created by feiniao on 2018/11/4.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
