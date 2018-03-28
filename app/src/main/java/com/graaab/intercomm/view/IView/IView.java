package com.graaab.intercomm.view.IView;

/**
 * Created by USER-28 on 16/3/2018.
 */

public interface IView {

    /**
     * determine whether to show/hide loading progress dialog on current screen
     *
     * @param state true to show loading, false to hide loading
     * @author YoonJin Park (Dennis)
     * @since 2.0
     */
    void showLoading();

    /**
     * set all created objects within the current activity to null.
     * @author YoonJin Park (Dennis)
     * @since 2.0
     */
    void unsetView();

    void hideLoading();
}
