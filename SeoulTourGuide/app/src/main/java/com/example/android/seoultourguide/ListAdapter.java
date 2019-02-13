package com.example.android.seoultourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter<ListData> {

    public ListAdapter(Context context, ArrayList<ListData> listData) {
        super(context, 0, listData);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout,parent,false);
        }
        ImageView seoulNewsImage = convertView.findViewById(R.id.seoulListImg);
        TextView seoulNewsTitle = convertView.findViewById(R.id.seoulTitle);
        TextView seoulNewsBody = convertView.findViewById(R.id.seoulBody);

        ListData currentNews = getItem(position);
        seoulNewsImage.setBackgroundResource(currentNews.getImageId());
        seoulNewsTitle.setText(currentNews.getTitle());

        if(currentNews.hasBody()){
            seoulNewsBody.setText(currentNews.getBody());
            seoulNewsBody.setVisibility(View.VISIBLE);
        }else{
            seoulNewsBody.setVisibility(View.GONE);
        }

        return convertView;
    }
}
