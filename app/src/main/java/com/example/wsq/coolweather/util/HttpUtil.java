package com.example.wsq.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wsq on 2017/5/27.
 */

public class HttpUtil {
    public static void sendOkHttpClient(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
