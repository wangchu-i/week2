package com.bawei.app;

import android.app.Application;
import android.content.Context;

/*
 *@auther:王楚
 *@Date: 2019/11/11
 *@Time:8:47
 *@
 **/
public class AppContext extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
