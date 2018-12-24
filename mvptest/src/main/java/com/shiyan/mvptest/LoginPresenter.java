package com.shiyan.mvptest;

import com.shiyan.mvp.MvpPresenter;

public class LoginPresenter extends MvpPresenter<LoginContract.LoginView> implements LoginContract.LoginPresenter{


    public void login(){
        //调用登录接口
        new LoginModle().login();

        //登录成功后修改UI变化
        getView().toast();
    }

}
