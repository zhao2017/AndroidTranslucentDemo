package com.lufax.translucentdemo.ui.activity;

import android.os.Bundle;

import com.lufax.translucentdemo.base.BaseActivity;
import com.lufax.translucentdemo.util.StatusBarUtil;

public class SeaActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initCustomTopbar() {

    }

    @Override
    protected void setStatusBar() {
        super.setStatusBar();
        StatusBarUtil.setTransparentForWindow(this);
        StatusBarUtil.setStatusBarDarkMode(getWindow(), false);
        StatusBarUtil.setTranslucentForCoordinatorLayout(this, 0);
    }
}
