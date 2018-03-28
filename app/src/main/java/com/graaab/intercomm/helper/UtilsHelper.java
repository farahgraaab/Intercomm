package com.graaab.intercomm.helper;

import android.os.Build;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class UtilsHelper {

    /**
     * Method to detect current version is Jelly Bean
     *
     * @return boolean
     */
    public static boolean isJellyBean() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN;
    }

    /**
     * Method to detect current version is Kitkat
     *
     * @return boolean
     */
    public static boolean isKitkat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }

    /**
     * Method to detect current version is Lollipop
     *
     * @return boolean
     */
    public static boolean isLollipop() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

    /**
     * Method to detect current version is Marshmallow
     *
     * @return boolean
     */
    public static boolean isMarshmallow() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }


    /**
     * Method to detect current version is Nougat
     *
     * @return boolean
     */
    public static boolean isNougat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N;
    }
}
