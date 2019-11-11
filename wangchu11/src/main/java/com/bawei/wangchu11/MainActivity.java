package com.bawei.wangchu11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.bawei.base.BaseActivity;
import com.bawei.base.BasePresenter;
import com.bawei.bean.News;
import com.bawei.presenter.IPresenter;
import com.google.gson.Gson;
import com.stx.xhb.xbanner.XBanner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private List<News.DataBean.GridDataBean> list = new ArrayList<>();
    private RecyclerView mRecy;
    private XBanner xBanner;
    @Override
    protected void conmming() {

    }

    @Override
    protected BasePresenter initPresenter() {
        return new IPresenter();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
         mRecy = findViewById(R.id.mRecy);
         xBanner=findViewById(R.id.xBanner);

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onRuccess(String json) {
        //log打印
        Log.i("aaa", "onRuccess: "+json);
        //gson解析
        Gson gson = new Gson();
        News news = gson.fromJson(json,News.class);
        List<News.DataBean.GridDataBean> da = news.getData().getGridData();
        list.addAll(da);

    }

    @Override
    public void onError(String error) {

    }
}
