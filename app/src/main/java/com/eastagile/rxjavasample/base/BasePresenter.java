package com.eastagile.rxjavasample.base;

import android.app.Activity;

public class BasePresenter<T extends Activity> {

    protected T view;

    public void attach(T view) {
        this.view = view;
    }

    public void detatch() {
        this.view = null;
    }
}
