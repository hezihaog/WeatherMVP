package com.hzh.weather.mvp.sample.mvp.presenter;

/**
 * Package: com.hzh.weather.mvp.sample.mvp.presenter
 * FileName: Presenter
 * Date: on 2017/12/23  下午9:25
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public interface Presenter<V> {
    void attachView(V view);

    void detachView();
}