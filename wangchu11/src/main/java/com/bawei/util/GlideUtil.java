package com.bawei.util;

import android.app.Application;
import android.widget.ImageView;

import com.bawei.app.AppContext;
import com.bawei.wangchu11.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;

/*
 *@auther:王楚
 *@Date: 2019/11/11
 *@Time:8:49
 *添加图片的接口
 **/
public class GlideUtil {
    public static void loadImage(String url, ImageView imageView){
        Glide.with(AppContext.context)
                .load(url)
                .error(R.mipmap.ic_launcher)
                .priority(Priority.HIGH)
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
    }
}
