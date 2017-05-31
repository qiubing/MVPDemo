package com.example.mvpdemo.presenter;

import com.example.mvpdemo.User;
import com.example.mvpdemo.model.IUserModel;
import com.example.mvpdemo.model.UserModel;
import com.example.mvpdemo.view.IUserView;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-05-31 11:36
 */
public class UserPresenter extends BasePresenter {
    private IUserModel mUserModel;
    private IUserView mUserView;

    public UserPresenter(IUserView view){
        this.mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id,String name){
        mUserModel.setId(id);
        mUserModel.setName(name);
    }

    public void loadUser(int id){
        User user = mUserModel.load(id);
        mUserView.setId(user.getId());
        mUserView.setName(user.getName());
    }
}
