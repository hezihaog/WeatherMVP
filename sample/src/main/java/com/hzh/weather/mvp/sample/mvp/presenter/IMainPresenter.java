package com.hzh.weather.mvp.sample.mvp.presenter;

import com.hzh.weather.mvp.sample.bean.MainModelBean;
import com.hzh.weather.mvp.sample.mvp.view.MainView;

/**
 * Package: com.hzh.weather.mvp.sample.mvp.presenter
 * FileName: MainPresenter
 * Date: on 2017/12/23  下午9:26
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public interface IMainPresenter extends Presenter<MainView> {
    void startLoadData();

    void loadDataSuccess(MainModelBean bean);

    void loadDataFail();
}