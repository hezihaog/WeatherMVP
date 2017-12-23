package com.hzh.weather.mvp.sample;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hzh.weather.mvp.sample.bean.MainModelBean;
import com.hzh.weather.mvp.sample.mvp.presenter.MainPresenter;
import com.hzh.weather.mvp.sample.mvp.view.MainView;
import com.hzh.weather.mvp.sample.util.UIHelper;

public class MainActivity extends AppCompatActivity implements MainView {
    private UIHelper mUiHelper;
    private MainPresenter mMainPresenter;
    private TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loadBtn = findViewById(R.id.loadBtn);
        resultTv = findViewById(R.id.result);
        mUiHelper = new UIHelper();
        mMainPresenter = new MainPresenter(this);

        loadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showProgress();
                new Handler(getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mMainPresenter.startLoadData();
                    }
                }, 1500);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainPresenter.detachView();
    }

    @Override
    public void showData(MainModelBean bean) {
        String data = getResources().getString(R.string.city) + " :" + bean.getCity() + "\n"
                + getResources().getString(R.string.wd) + " :" + bean.getWd() + "\n"
                + getResources().getString(R.string.ws) + " :" + bean.getWs() + "\n"
                + getResources().getString(R.string.time) + " :" + bean.getTime();
        resultTv.setText(data);
    }

    @Override
    public void showProgress() {
        mUiHelper.showDialog(this);
    }

    @Override
    public void hideProgress() {
        mUiHelper.dismissDialog();
    }
}
