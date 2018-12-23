package com.shiyan.mvp;

import java.lang.ref.WeakReference;

/**
 * MVP Presenter基础实现
 */
public class MvpPresenter<V extends IMvpView>  implements IMvpPresenter<V>{

    /*view弱引用*/
    private WeakReference<V> viewRef;

    /**
     * 绑定view
     * @param view
     */
    @Override
    public void attachView(V view) {

        viewRef = new WeakReference<>(view);

    }

    /**
     * 移除view
     */
    @Override
    public void detachView() {

        if(viewRef != null){

            viewRef.clear();

            viewRef = null;

        }

    }

    /**
     * 获取view
     * @return
     */
    public V getView(){

        return viewRef == null?null:viewRef.get();

    }

    /**
     * 判断View是否已经添加
     * @return
     */
    public boolean isViewAttached(){

        return viewRef != null && viewRef.get() != null;

    }


}
