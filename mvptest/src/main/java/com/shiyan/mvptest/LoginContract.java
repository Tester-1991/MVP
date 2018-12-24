package com.shiyan.mvptest;

import com.shiyan.mvp.MvpView;

public interface LoginContract {

    interface LoginView extends MvpView {
        //登录成功后 UI变化
        void toast();
    }

    interface LoginPresenter{
        //用户登录
        void login();

    }

    interface LgoinModle{
        //用户登录
        void login();
    }
}
