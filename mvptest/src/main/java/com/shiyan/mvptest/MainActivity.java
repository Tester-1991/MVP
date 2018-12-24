package com.shiyan.mvptest;

import com.shiyan.mvp.BaseAppCompatActivity;
import com.shiyan.mvp.MvpPresenter;

public class MainActivity extends BaseAppCompatActivity implements LoginContract.LoginView{

    private LoginPresenter loginPresenter = new  LoginPresenter(new LoginModle());

    @Override
    public MvpPresenter bindPresenter() {
        return loginPresenter;
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initBundleData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        loginPresenter.login();

        loginPresenter.userExit();
    }

    @Override
    public void showLoading(String action) {

    }

    @Override
    public void hideLoading(String action) {

    }


    @Override
    public void showButton() {

    }

}
