package com.shiyan.mvp;

import android.support.annotation.UiThread;

public interface MvpView extends IMvpView {

    /**
     * 显示加载中对话框
     * @param action 区分不同事件
     */
    @UiThread
    void showLoading(String action);

    /**
     * 隐藏加载中对话框
     * @param action 区分不同事件
     */
    @UiThread
    void hideLoading(String action);
}
