package com.example.android.newsfeed;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<NewsData>> {

    private static final String LOG_TAG = NewsLoader.class.getName();
    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public List<NewsData> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<NewsData> newsData = QueryUtils.fetchNewsData(mUrl);
        return newsData;
    }
}
