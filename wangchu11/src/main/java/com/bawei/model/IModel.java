package com.bawei.model;

import com.bawei.Controller;
import com.bawei.util.HttpUtil;

/*
 *@auther:王楚
 *@Date: 2019/11/11
 *@Time:9:00
 *@model层
 **/
public  class IModel implements Controller.Model {

    @Override
    public void getInfo(String url, final MyCallBack myCallBack) {
        HttpUtil.getInstance().getInfo(url, new HttpUtil.MyCallBack() {
            @Override
            public void onRuccess(String json) {
                myCallBack.onRuccess(json);
            }

            @Override
            public void onError(String error) {
                myCallBack.onError(error);
            }
        });
    }
}
