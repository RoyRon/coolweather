package com.example.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author jiangyingfeng
 * on 2020/8/7
 **/
public class HttpUtil {
    public static void sendOkHttpRequest(String url, Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(url).build();
        client.newCall(request).enqueue(callback);
    }

}
