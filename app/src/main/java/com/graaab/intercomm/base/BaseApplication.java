package com.graaab.intercomm.base;

import android.app.Application;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class BaseApplication extends Application{
    private static BaseApplication mInstance;

    public static synchronized BaseApplication getInstance() {
        return mInstance;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;

        // Setup Realm
        BaseRealm baseRealm = new BaseRealm(getApplicationContext());
        baseRealm.setSchemaVersion(0);
        baseRealm.initConfiguration();
    }
}
