package com.bawei;

/*
 *@auther:王楚
 *@Date: 2019/11/11
 *@Time:8:56
 *@契约类
 **/
public interface Controller {

    interface Model{
        void getInfo(String url,MyCallBack myCallBack);
        interface MyCallBack{
            void onRuccess(String json);
            void onError(String error);
        }
    }
    interface View{
        void onRuccess(String json);
        void onError(String error);
    }
    interface Presenter{
        void startRequext(String url);
    }
}
