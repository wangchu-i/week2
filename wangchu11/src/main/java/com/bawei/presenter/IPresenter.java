package com.bawei.presenter;

import com.bawei.Controller;
import com.bawei.base.BasePresenter;
import com.bawei.model.IModel;

/*
 *@auther:王楚
 *@Date: 2019/11/11
 *@Time:9:10
 *@Presenter层
 **/
public class IPresenter extends BasePresenter {
    public Controller.Model model;
    @Override
    protected void initModel() {
        model=new IModel();
    }

    @Override
    public void startRequext(String url) {
        model.getInfo(url, new Controller.Model.MyCallBack() {
            @Override
            public void onRuccess(String json) {
                getView().onRuccess(json);
            }

            @Override
            public void onError(String error) {
                getView().onError(error);
            }
        });
    }
}
