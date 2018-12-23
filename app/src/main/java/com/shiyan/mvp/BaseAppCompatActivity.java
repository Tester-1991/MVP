package com.shiyan.mvp;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

public abstract class BaseAppCompatActivity extends MVPAppCompatActivity {

    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getContentViewId());
        
        mContext = this;
        
        initBundleData();
        
        initView();
        
        initData();
    }

    /**
     * 获取显示view的xml文件ID
     */
    protected abstract int getContentViewId();


    /**
     * 获取上一个界面传送过来的数据
     */
    protected abstract void initBundleData();

    /**
     * 初始化view
     */
    protected abstract void initView();

    /**
     * 初始化Data
     */
    protected abstract void initData();

}
