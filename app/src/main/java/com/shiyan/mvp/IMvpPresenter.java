package com.shiyan.mvp;

import android.support.annotation.UiThread;

/**
 * MVP 根Presenter
 */
public interface IMvpPresenter<V extends IMvpView> {

    /**
     * 将view添加到当前presenter
     * @param view
     */
    @UiThread
    void attachView(V view);

    /**
     * 将view从当前presenter移除
     */
    @UiThread
    void detachView();
}
