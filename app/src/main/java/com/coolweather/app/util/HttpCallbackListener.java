package com.coolweather.app.util;

/**
 * Created by liuhaozhen on 16/1/11.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
