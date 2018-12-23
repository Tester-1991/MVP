package com.shiyan.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle3.components.RxActivity;
import com.trello.rxlifecycle3.components.support.RxAppCompatActivity;

public abstract class MVPActivity<P extends MvpPresenter> extends RxActivity implements MvpView {

    protected P p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            if(p == null) {

                p = bindPresenter();

                if(p != null){

                    p.attachView(this);

                }
            }

    }

    /**
     * 创建Presenter
     * @return
     */
    public abstract P bindPresenter();


    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(p != null) {

            p.detachView();

        }
    }
}
