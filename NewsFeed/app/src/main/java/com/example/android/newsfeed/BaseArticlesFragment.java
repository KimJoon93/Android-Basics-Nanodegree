package com.example.android.newsfeed;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class BaseArticlesFragment extends Fragment implements LoaderManager.LoaderCallbacks<List<NewsData>>{

    private static final String LOG_TAG = BaseArticlesFragment.class.getName();
    private static final int NEWS_LOADER_ID = 1;

    public BaseArticlesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_base_articles, container, false);
        return view;
    }

    @NonNull
    @Override
    public Loader<List<NewsData>> onCreateLoader(int i, @Nullable Bundle bundle) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<List<NewsData>> loader, List<NewsData> newsData) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<List<NewsData>> loader) {

    }
}
