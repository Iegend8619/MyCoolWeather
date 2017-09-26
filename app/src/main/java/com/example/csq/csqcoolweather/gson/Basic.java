package com.example.csq.csqcoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by legend on 9/25/2017.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
