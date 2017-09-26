package com.example.csq.csqcoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by legend on 9/25/2017.
 */

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
