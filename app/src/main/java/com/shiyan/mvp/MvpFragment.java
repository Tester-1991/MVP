package com.shiyan.mvp;

import android.os.Bundle;
import android.view.View;

import com.trello.rxlifecycle3.components.support.RxFragment;

import androidx.annotation.Nullable;

public abstract class MvpFragment<P extends MvpPresenter> extends RxFragment implements MvpView{

    protected P p;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if(p == null) {

            p = bindPresenter();

            if(p != null){

                p.attachView(this);

            }
        }
    }

    protected abstract P bindPresenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        if(p != null) {

            p.detachView();

        }
    }
}
