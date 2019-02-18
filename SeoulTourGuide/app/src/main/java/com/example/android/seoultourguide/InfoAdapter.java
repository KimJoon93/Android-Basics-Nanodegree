package com.example.android.seoultourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class InfoAdapter extends ArrayAdapter {
    public InfoAdapter(Context context, ArrayAdapter<> listData) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.info_layout,parent,false);
        }
        TextView infoTitle = convertView.findViewById(R.id.info_title);
        TextView infoContext = convertView.findViewById(R.id.info_context);


        return convertView;
    }
}
