package com.example.mvpdemo.presenter;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-05-31 11:03
 */
public abstract class BasePresenter<T> {
    protected Reference<T> mViewRef;

    public void attachView(T view){
        mViewRef = new WeakReference<T>(view);
    }

    protected T getView(){
        return mViewRef.get();
    }

    public boolean isViewAttached(){
        return mViewRef != null && mViewRef.get() != null;
    }

    public void detachView(){
        if (mViewRef != null){
            mViewRef.clear();
            mViewRef = null;
        }
    }
}
