package com.project.cx.processcontrol.view.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.project.cx.processcontrol.R;
import com.project.cx.processcontrol.view.IView.ILoginView;

/**
 * Created by Administrator on 2018/1/19 0019.
 */

public class LoginActivity extends AppCompatActivity implements ILoginView,View.OnClickListener {
    Button loginbtn,settingbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        loginbtn= (Button) findViewById(R.id.login);
        settingbtn= (Button) findViewById(R.id.setting);

        loginbtn.setOnClickListener(this);
        settingbtn.setOnClickListener(this);
    }

    @Override
    public void onLoginResult(Boolean result, int code) {

    }

    @Override
    public void onSetProgressBarVisiblity(int visibilty) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:

                break;
        }
    }
}
