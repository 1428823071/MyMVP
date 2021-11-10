package com.bawe.mymvp.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

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
         * /包名:         | com.bawe.mymvp.view.fragment
         * +----------------------------------------------------------
         * |类名:         | BaseFragment
         * +----------------------------------------------------------
         * |描述:         |
         * +----------------------------------------------------------
         * |作者:         | 榆木脑袋
         * +----------------------------------------------------------
         * |创建日期:      | 2021/11/10 19:33
         * +----------------------------------------------------------
         * |更新者:       | 榆木脑袋
         * +----------------------------------------------------------
         * |更新日期:     | 2021/11/10 19:33
         * +----------------------------------------------------------
         * |版本:        | 1.0
         * +----------------------------------------------------------
         */
class BaseFragment<P extends IPresenter> extends Fragment implements IFragment, IView {
    protected P mPresenter;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(bindLayout(),container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
    }

    @Override
    public void showToToast(String s) {
        Toast.makeText(getActivity(), String.valueOf(s), Toast.LENGTH_SHORT).show();
    }

    @Override
    public <V extends View> V findViewById(int id) {
        return view.findViewById(id);
    }
}
