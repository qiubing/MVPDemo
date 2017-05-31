package com.example.mvpdemo.view;

import android.app.Activity;
import android.os.Bundle;

import com.example.mvpdemo.presenter.BasePresenter;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-05-31 11:09
 */
public abstract class MVPBaseActivity<V,T extends BasePresenter> extends Activity {
    protected T mPresenter;//Presenter����
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mPresenter = createPresenter();//����Presenter
        mPresenter.attachView((V)this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    protected abstract T createPresenter();
}
