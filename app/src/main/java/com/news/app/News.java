package com.news.app;

/**
 * Created by Ahmed Magdy on 22-Feb-18.
 */

public class News {

    private String mTitle;
    private String mInformation;
    private String mTime;
    private String mUrl;

    public News(String mTitle, String mInformation, String mTime, String mUrl) {
        this.mTitle = mTitle;
        this.mInformation = mInformation;
        this.mTime = mTime;
        this.mUrl = mUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmInformation() {
        return mInformation;
    }

    public String getmTime() {
        return mTime;
    }

    public String getmUrl() {
        return mUrl;
    }
}