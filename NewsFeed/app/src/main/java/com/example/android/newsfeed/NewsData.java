package com.example.android.newsfeed;

public class NewsData {
    private String mTtitle;
    private String mSectionName;
    private String mAuthor;
    private String mDate;
    private String mWebUrl;
    private String mThumbnail;
    private String mTrailTextHtml;


    public NewsData(String mTtitle, String mSectionName, String mAuthor, String mDate, String mWebUrl, String mThumbnail, String mTrailTextHtml) {
        this.mTtitle = mTtitle;
        this.mSectionName = mSectionName;
        this.mAuthor = mAuthor;
        this.mDate = mDate;
        this.mWebUrl = mWebUrl;
        this.mThumbnail = mThumbnail;
        this.mTrailTextHtml = mTrailTextHtml;
    }

    public String getmTtitle() {
        return mTtitle;
    }

    public String getmSectionName() {
        return mSectionName;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmWebUrl() {
        return mWebUrl;
    }

    public String getmThumbnail() {
        return mThumbnail;
    }

    public String getmTrailTextHtml() {
        return mTrailTextHtml;
    }
}

