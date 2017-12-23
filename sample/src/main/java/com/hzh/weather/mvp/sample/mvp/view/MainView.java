package com.hzh.weather.mvp.sample.mvp.view;

import com.hzh.weather.mvp.sample.bean.MainModelBean;

/**
 * Package: com.hzh.weather.mvp.sample.mvp
 * FileName: MainView
 * Date: on 2017/12/23  下午9:18
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public interface MainView {
    void showData(MainModelBean bean);

    void showProgress();

    void hideProgress();
}