package com.hzh.weather.mvp.sample.bean;

/**
 * Package: com.hzh.weather.mvp.sample.bean
 * FileName: MainModelBean
 * Date: on 2017/12/23  下午9:24
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public class MainModelBean {
    //城市
    private String city;
    //风向
    private String wd;
    //风级
    private String ws;
    //发布时间
    private String time;

    public String getCity() {
        return city;
    }

    public MainModelBean setCity(String city) {
        this.city = city;
        return this;
    }

    public String getWd() {
        return wd;
    }

    public MainModelBean setWd(String wd) {
        this.wd = wd;
        return this;
    }

    public String getWs() {
        return ws;
    }

    public MainModelBean setWs(String ws) {
        this.ws = ws;
        return this;
    }

    public String getTime() {
        return time;
    }

    public MainModelBean setTime(String time) {
        this.time = time;
        return this;
    }
}