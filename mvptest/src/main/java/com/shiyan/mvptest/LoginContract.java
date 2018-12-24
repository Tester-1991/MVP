package com.shiyan.mvptest;

import com.shiyan.mvp.MvpView;

public interface LoginContract {

    interface LoginView extends MvpView {
        void showButton();
    }

    interface LoginPresenter{
        void login();

        void userExit();
    }

    interface LgoinModle{
        void getLoginInfo();
    }
}
