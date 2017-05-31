package com.example.mvpdemo.model;

import com.example.mvpdemo.User;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-05-31 11:33
 */
public interface IUserModel {
    void setId(int id);
    int getId();
    void setName(String name);
    String getName();

    User load(int id);
}
