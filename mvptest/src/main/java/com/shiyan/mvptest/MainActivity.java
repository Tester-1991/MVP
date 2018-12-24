package com.shiyan.mvptest;

import android.widget.Toast;

import com.shiyan.mvp.BaseAppCompatActivity;
import com.shiyan.mvp.MvpPresenter;

public class MainActivity extends BaseAppCompatActivity implements LoginContract.LoginView{

    private LoginPresenter loginPresenter = new  LoginPresenter();

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
    }

    @Override
    public void showLoading(String action) {

    }

    @Override
    public void hideLoading(String action) {

    }

    @Override
    public void toast() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_LONG).show();
    }
}
