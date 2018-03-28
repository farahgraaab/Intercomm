package com.graaab.intercomm.helper;

import android.content.res.AssetManager;
import android.graphics.Typeface;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class FontHelper {

    public static Typeface getGotham(AssetManager manager){
        return Typeface.createFromAsset(manager,"fonts/Gotham.ttf");
    }

    public static Typeface getGothamBold(AssetManager manager){
        return Typeface.createFromAsset(manager,"fonts/Gotham-Rounded-Bold.ttf");
    }

    public static Typeface getGothamBook(AssetManager manager){
        return Typeface.createFromAsset(manager,"fonts/Gotham-Rounded-Book.ttf");
    }

    public static Typeface getGothamLight(AssetManager manager){
        return Typeface.createFromAsset(manager,"fonts/Gotham-Rounded-Light.ttf");
    }

    public static Typeface getGothamMedium(AssetManager manager){
        return Typeface.createFromAsset(manager,"fonts/Gotham-Rounded-Medium.ttf");
    }
}
