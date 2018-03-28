package com.graaab.intercomm.base;

import android.content.Context;
import android.os.Environment;

import com.graaab.intercomm.BuildConfig;

import java.io.File;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class BaseRealm {
    private Context mContext;
    private int mSchemaVersion;

    public BaseRealm(Context context) {
        mContext = context;
    }

    public void setSchemaVersion(int schemaVersion) {
        mSchemaVersion = schemaVersion;
    }

    public void initConfiguration() {


        File storageDir = new File(Environment.getExternalStorageDirectory().toString(), "/Android/data/" + BuildConfig.APPLICATION_ID + "/realm/");

        if (!storageDir.exists()) {
            storageDir.mkdirs();
        }


        String path = Environment.getExternalStorageDirectory().toString();

        Realm.init(mContext);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
//                .directory(storageDir)
                .name(BuildConfig.APPLICATION_ID + ".realm")
                .schemaVersion(mSchemaVersion)
                .migration(new BaseRealmMigration())
                .build();

        Realm.setDefaultConfiguration(realmConfiguration);
    }
}
