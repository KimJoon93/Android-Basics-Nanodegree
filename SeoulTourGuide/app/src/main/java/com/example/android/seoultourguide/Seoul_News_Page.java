package com.example.android.seoultourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

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
        final ArrayList<ListData> newsLists = new ArrayList<>();
        newsLists.add(new ListData("Seoul Trip in cold waves and fine dust","Content",R.mipmap.seoul));
        newsLists.add(new ListData("Seoul Cafe trip","Content",R.mipmap.seoul));
        newsLists.add(new ListData("Starting point of Seoul","Content",R.mipmap.seoul));
        newsLists.add(new ListData("Hot spots in Seoul","Content",R.mipmap.seoul));
        newsLists.add(new ListData("Starting point of Seoul","Content",R.mipmap.seoul));

        View view = inflater.inflate(R.layout.fragment_seoul__news__page, container, false);

        ListView news_list = view.findViewById(R.id.news_listview);
        ListAdapter listAdapter = new ListAdapter(getContext(),newsLists);
        news_list.setAdapter(listAdapter);

        news_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), Seoul_News_Content.class);
                intent.putExtra("newsTitle",newsLists.get(i).getTitle());
                intent.putExtra("newsBody",newsLists.get(i).getBody());
                intent.putExtra("newsImg",newsLists.get(i).getImageId());
                startActivity(intent);

            }
        });

        return view;
    }

}
