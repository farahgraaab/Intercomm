package com.graaab.intercomm.helper;

/**
 * Created by USER-28 on 16/3/2018.
 */

public class ApiConstantHelper {

    private static final String TAG = ApiConstantHelper.class.getSimpleName();

    // Staging
    public static final String HOST = "https://app.graaab.com/public/trackingapi/v1/";
//    public static final String HOST = "http://graaabphpservice.herokuapp.com/trackingapi/";

    // Production
//    public static final String HOST = "http://graaabproductionapi.herokuapp.com/public/trackingapi/";

    public static final String URL = "";

    public static final String AUTHENTICATE_URL = "guard_login_authenticate";
    public static final String SCANNING_URL = "guard_scan_recorder";
    public static final String HISTORY_URL = "guard_history_listing";

    public static final String API_SUCCESS = "success";
    public static final String API_ERROR = "error";
    public static final String API_NETWORK_ERROR = "networkError";
    public static final String API_UNKNOWN_ERROR = "unknownError";
}
