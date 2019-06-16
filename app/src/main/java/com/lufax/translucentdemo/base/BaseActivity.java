package com.lufax.translucentdemo.base;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.lufax.translucentdemo.R;
import com.lufax.translucentdemo.util.StatusBarUtil;

public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isSetStatusBar()) {
            setStatusBar();
        }
        initToolBar();
    }

    /**
     * ToolBar的操作
     */
    private void initToolBar() {
        // 自定义的ToolBar通用的
        if (!isShowToolBar()) {
            return;
        }
        if (toolbar == null) {
            toolbar = (Toolbar) View.inflate(this, R.layout.common_base_toolbar, null);
            initCustomTopbar();
        }
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(false);
    }

    protected boolean isSetStatusBar() {
        return true;
    }

    protected void setStatusBar() {
        StatusBarUtil.setColor(this, ContextCompat.getColor(this, R.color.color_white), 0);
    }

    protected boolean isShowToolBar() {
        return true;
    }

    protected abstract void initCustomTopbar();

    public void openActivity(Class<?> pClass) {
        openActivity(pClass, null);
    }

    public void openActivity(Class<?> pClass, Bundle pBundle) {
        Intent intent = new Intent(this, pClass);
        if (pBundle != null) {
            intent.putExtras(pBundle);
        }
        startActivity(intent);
    }
}
