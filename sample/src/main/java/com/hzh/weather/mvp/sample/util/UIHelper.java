package com.hzh.weather.mvp.sample.util;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Package: com.hzh.weather.mvp.sample.util
 * FileName: UIHelper
 * Date: on 2017/12/23  下午9:34
 * Auther: zihe
 * Descirbe:
 * Email: hezihao@linghit.com
 */

public class UIHelper {

    private ProgressDialog dialog;

    public UIHelper() {
    }

    public void showDialog(Context context) {
        if (dialog == null) {
            dialog = new ProgressDialog(context);
        }
        if (dialog.isShowing()) {
            return;
        }
        dialog.show();
    }

    public void dismissDialog() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}