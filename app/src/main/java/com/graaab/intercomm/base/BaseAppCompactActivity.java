package com.graaab.intercomm.base;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by USER-28 on 16/3/2018.
 */

public abstract class BaseAppCompactActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupContent();
        setupActionBar();
    }

    protected abstract void setupContent();
    protected abstract void setupActionBar();
    protected abstract void checkIntent();
    protected abstract void setupUI();
    protected abstract void setupData();



    private ProgressDialog dialog(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            return new ProgressDialog(context, android.R.style.Theme_Material_Light_Dialog_Alert);
        } else {
            return new ProgressDialog(context);
        }
    }


    public AlertDialog alertDialog(Context context, String title, String message) {
        message = message.replace("[", "").replace("]", "");

        android.app.AlertDialog.Builder builder;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new android.app.AlertDialog.Builder(context, android.R.style.Theme_Material_Light_Dialog_Alert);
        } else {
            builder = new android.app.AlertDialog.Builder(context);
        }

        AlertDialog alertDialog = builder.create();
        alertDialog.setMessage(message);
        alertDialog.setCancelable(false);

        return alertDialog;
    }

}
