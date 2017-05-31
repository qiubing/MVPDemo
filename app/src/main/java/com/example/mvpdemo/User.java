package com.example.mvpdemo;

/**
 * Description:
 * Author: qiubing
 * Date: 2017-05-31 11:30
 */
public class User {
    private int mId;
    private String mName;

    public User(int id,String name){
        this.mId = id;
        this.mName = name;
    }
    public String getName(){
        return mName;
    }

    public int getId(){
        return mId;
    }
}
