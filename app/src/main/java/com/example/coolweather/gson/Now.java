package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author jiangyingfeng
 * on 2020/9/16
 **/
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
