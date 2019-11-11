package com.bawei.base;

import com.bawei.Controller;

import java.lang.ref.WeakReference;

/*
 *@auther:王楚
 *@Date: 2019/11/11
 *@Time:9:04
 *@Description:${DESCRIPTION}
 **/
public abstract class BasePresenter<V extends Controller.View> implements Controller.Presenter {
    public WeakReference<V> mWeak;

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();
    protected void onAttch(V view){
        mWeak=new WeakReference<>(view);
    }
    protected void onDoAtch(){
        if (mWeak!=null){
            mWeak.clear();
            mWeak=null;
        }
    }
    protected V getView(){
        return mWeak.get();
    }
}
