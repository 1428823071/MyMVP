package com.bawe.mymvp.view.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawe.mymvp.presenter.IPresenter;
import com.bawe.mymvp.view.IView;

public abstract
        /**
         *　　　   ◢▀▅　　　　▃
         *　　　 　▋ 　　 ▋　◢▀　▀◣
         *　　　　▌　 　 　▌　▌ 　 　 .▌                       ┏┓　 ┏┓
         *　　 　 ▌　　　　▌ ▌　　　　▌                       ┏┛┻━━━┛┻┓
         *　 　　▐ 　 　　 ▌ ▌ 　 　　▌                     ┃　　　　　　 ┃ 　
         *　 　　 ▐ 　 　 ▀■▀ 　 　　▌                     ┃　　　━　　  ┃
         *　　　◢◤　　　　　　　　　▀▃                      ┃　┳┛　┗┳　  ┃
         *　　◢◤　　　　　　　　　 　　 ◥◣                 ┃　　　　　　 ┃
         *　　▌　　　　　　　　　　 　　　　▌                  ┃　　┻　  　 ┃
         *　▐　 　●　　 　　　　●　　　　　▌ 　               ┃　　　　　 ┃
         *　　▌　　　　　　　　　　　　　　 ▌                   ┗━┓　　　┏━┛
         *　　◥◣ 　 　　 ╳ 　　　　　　◢◤                     ┃　　　┃　　　　　　　
         *　　 ◢▀▅▃▂　　　▂▂▃▅▀▅                        　　   ┃     ┃
         *　◢◤　　　　▀▀▀▀▀　　　　　◥◣                      　┃　　　┗━━━┓
         *▐◣▃▌　　　　　　　　　　　▐▃◢▌                      　　┃　　　　　┣┓
         *◥◣▃▌　　　　　　　　　　　▐▃◢◤                      　　┃　　　　┏┛
         *　 ▀▅▃　　　　　 　 　　▂▅▀                       　　    ┗┓┓┏━┳┓┏┛
         *　　 　 ▀■▆▅▅▅▅▅▆■█▀                                   ┃┫┫　┃┫┫
         *　　　 　▐▃▃▃▲▃▃▃◢                                      ┗┻┛ ┗┻┛
         * +----------------------------------------------------------
         * |项目名称:      | MyMVP
         * +----------------------------------------------------------
         * /包名:         | com.bawe.mymvp.view.activity
         * +----------------------------------------------------------
         * |类名:         | BaseActivity
         * +----------------------------------------------------------
         * |描述:         |
         * +----------------------------------------------------------
         * |作者:         | 榆木脑袋
         * +----------------------------------------------------------
         * |创建日期:      | 2021/11/10 19:30
         * +----------------------------------------------------------
         * |更新者:       | 榆木脑袋
         * +----------------------------------------------------------
         * |更新日期:     | 2021/11/10 19:30
         * +----------------------------------------------------------
         * |版本:        | 1.0
         * +----------------------------------------------------------
         */
class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IActivity, IView {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());

        initView();
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.onDestroy();
            mPresenter = null;
        }
    }

    @Override
    public void showToToast(String s) {
        Toast.makeText(this, String.valueOf(s), Toast.LENGTH_SHORT).show();
    }
}
