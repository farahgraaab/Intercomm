package com.graaab.intercomm.presenter;

import android.support.annotation.NonNull;

import java.lang.ref.WeakReference;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class BasePresenter<V> {
    private WeakReference<V> view;

    public void bindView(@NonNull V view) {
        this.view = new WeakReference<>(view);
//        if (setupDone()) updateView();
    }

    public void unBindView() {
        this.view = null;
    }

//    protected abstract void updateView();

    protected V view() {
        if (view != null) return view.get();

        return null;
    }

    protected boolean setupDone() {
        return view() != null;
    }
}
