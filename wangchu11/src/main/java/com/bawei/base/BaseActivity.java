package com.bawei.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bawei.Controller;

/*
 *@auther:王楚
 *@Date: 2019/11/11
 *@Time:9:04
 *@Description:${DESCRIPTION}
 **/
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements Controller.View {
    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        initView();
        initData();
        mPresenter=initPresenter();
        if (mPresenter!=null){
            mPresenter.onAttch(this);
        }
        conmming();
    }

    protected abstract void conmming();

    protected abstract P initPresenter();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int layoutId();
    //销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

