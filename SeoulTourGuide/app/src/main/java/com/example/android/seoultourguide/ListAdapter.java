package com.example.android.seoultourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public ListAdapter(Context context, ArrayList<NewsList> newsLists) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return ;
    }

    @Override
    public Object getItem(int i) {
        return ;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.news_list_layout,viewGroup,false);
        }
        ImageView seoulNewsImage = view.findViewById(R.id.seoulNewsListImg);
        TextView seoulNewsTitle = view.findViewById(R.id.seoulNewsTitle);
        TextView seoulNewsBody = view.findViewById(R.id.seoulNewsBody);

        NewsList currentNews = getItem(i);

        seoulNewsTitle.setText(currentNews.getNewsTitle());
        seoulNewsBody.setText(currentNews.getNewsBody());

        return view;
    }
}
