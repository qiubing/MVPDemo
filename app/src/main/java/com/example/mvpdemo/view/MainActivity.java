package com.example.mvpdemo.view;

import android.os.Bundle;
import android.widget.EditText;

import com.example.mvpdemo.R;
import com.example.mvpdemo.presenter.UserPresenter;


public class MainActivity extends MVPBaseActivity<IUserView,UserPresenter> implements IUserView{
    private EditText mId,mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mId = (EditText) findViewById(R.id.user_id);
        mName = (EditText) findViewById(R.id.user_name);
    }

    @Override
    protected UserPresenter createPresenter() {
        return new UserPresenter(this);
    }

    @Override
    public int getId() {
        return new Integer(mId.getText().toString());
    }

    @Override
    public String getName() {
        return mName.getText().toString();
    }

    @Override
    public void setId(int id) {
        mId.setText(id);
    }

    @Override
    public void setName(String name) {
        mName.setText(name);
    }
}
