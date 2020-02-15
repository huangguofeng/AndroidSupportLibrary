package com.test.library;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;

public class BaseImageView extends AppCompatImageView {

    public BaseImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.e("Demo","Android Support ： BaseImageView 构造器 attrs ："+attrs.getClassAttribute());
    }

    public BaseImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.e("Demo","Android Support ： BaseImageView 构造器 attrs："+attrs.getClassAttribute()+"   defStyleAttr： "+defStyleAttr);
    }
    public BaseImageView(Context context) {
        super(context);
        Log.e("Demo","Android Support ：BaseImageView 构造器 1");
    }
}
