package com.hzh.weather.mvp.sample.mvp.model;

import com.hzh.weather.mvp.sample.bean.MainModelBean;
import com.hzh.weather.mvp.sample.mvp.presenter.IMainPresenter;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

/**
 * Package: com.hzh.weather.mvp.sample.mvp.model
 * FileName: MainModel
 * Date: on 2017/12/23  下午9:39
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public class MainModel {
    private IMainPresenter mPresenter;

    public MainModel(IMainPresenter presenter) {
        this.mPresenter = presenter;
    }

    public void loadData() {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get("http://www.weather.com.cn/adat/sk/101010100.html", new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                try {
                    JSONObject weatherInfo = response.getJSONObject("weatherinfo");
                    MainModelBean bean = new MainModelBean();
                    bean.setCity(weatherInfo.getString("city"));
                    bean.setTime(weatherInfo.getString("time"));
                    bean.setWd(weatherInfo.getString("WD"));
                    bean.setWs(weatherInfo.getString("WS"));
                    mPresenter.loadDataSuccess(bean);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
                mPresenter.loadDataFail();
            }
        });
    }
}