package com.example.csq.csqcoolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by legend on 9/21/2017.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
