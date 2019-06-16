package com.lufax.translucentdemo;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import com.lufax.translucentdemo.base.BaseActivity;
import com.lufax.translucentdemo.ui.fragment.OneFragment;
import com.lufax.translucentdemo.ui.fragment.ThreeFragment;
import com.lufax.translucentdemo.ui.fragment.TwoFragment;
import com.lufax.translucentdemo.util.StatusBarUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R.id.iv_img)
    ImageView ivImg;
    private ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
    /*    if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();*/
        initFragments();
    }

    @Override
    protected boolean isShowToolBar() {
        return false;
    }

    @Override
    protected void initCustomTopbar() {
        // todo 需要建立一个toolbarBuilder用于通用toolbar的快速设置
    }


    private void initFragments() {
        fragments.add(new OneFragment());
        fragments.add(new TwoFragment());
        fragments.add(new ThreeFragment());
    }

    @Override
    protected void setStatusBar() {
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
      /*  StatusBarUtil.setTransparentForWindow(this);
        if (StatusBarUtil.setStatusBarDarkMode(getWindow(), true)) {
            StatusBarUtil.setColor(this, Color.WHITE, 0);
        } else {
            StatusBarUtil.setColor(this, Color.BLACK, 255);
        }*/
    }
}
