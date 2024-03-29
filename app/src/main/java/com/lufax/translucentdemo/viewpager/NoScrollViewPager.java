package com.lufax.translucentdemo.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/**
 * @autor :zh
 */
public class NoScrollViewPager extends ViewPager {

    public NoScrollViewPager(@NonNull Context context) {
        super(context);
    }

    public NoScrollViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void setCurrentItem(int item) {
        //表示切换的时候，不需要切换时间。
        super.setCurrentItem(item, false);
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }


}
