package com.shiyan.mvptest;

import com.shiyan.mvp.MvpPresenter;

public class LoginPresenter extends MvpPresenter<LoginContract.LoginView> implements LoginContract.LoginPresenter{


    public void login(){

        new LoginModle().login();

    }

}
