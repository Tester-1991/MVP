package com.shiyan.mvptest;

import com.shiyan.mvp.MvpPresenter;

public class LoginPresenter extends MvpPresenter<LoginContract.LoginView> implements LoginContract.LoginPresenter{
    LoginModle loginModle;
    public LoginPresenter(LoginModle loginModle) {
        this.loginModle = loginModle;
    }

    public void login(){
        loginModle.getLoginInfo();

        getView().showButton();
    }

    @Override
    public void userExit() {


        getView().showButton();
    }



}
