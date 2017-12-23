package com.hzh.weather.mvp.sample.mvp.presenter;

import com.hzh.weather.mvp.sample.bean.MainModelBean;
import com.hzh.weather.mvp.sample.mvp.model.MainModel;
import com.hzh.weather.mvp.sample.mvp.view.MainView;

/**
 * Package: com.hzh.weather.mvp.sample.mvp.presenter
 * FileName: MainPresenter
 * Date: on 2017/12/23  下午9:29
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public class MainPresenter implements IMainPresenter {
    private MainView mMainView;
    private final MainModel mMainModel;

    public MainPresenter(MainView view) {
        attachView(view);
        mMainModel = new MainModel(this);
    }

    @Override
    public void attachView(MainView view) {
        this.mMainView = view;
    }

    @Override
    public void detachView() {
        this.mMainView = null;
    }

    @Override
    public void startLoadData() {
        mMainModel.loadData();
    }

    @Override
    public void loadDataSuccess(MainModelBean bean) {
        this.mMainView.hideProgress();
        mMainView.showData(bean);
    }

    @Override
    public void loadDataFail() {
        this.mMainView.hideProgress();
    }
}