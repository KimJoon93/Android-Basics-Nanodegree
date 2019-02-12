package com.example.android.seoultourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class Seoul_News_Page extends Fragment {

    public Seoul_News_Page() {
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

        View view = inflater.inflate(R.layout.fragment_seoul__news__page, container, false);

        TextView tempereture_text = view.findViewById(R.id.temperature_text);
        ListView news_list = view.findViewById(R.id.news_listview);
        ListAdapter listAdapter = new ListAdapter();
        news_list.setAdapter(listAdapter);






        return view;
    }

}
