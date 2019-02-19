package com.example.android.seoultourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<InfoData> {

    public InfoAdapter(Context context, ArrayList<InfoData> infoData) {
        super(context,0,infoData);
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.info_layout,parent,false);
        }
        TextView infoTitle = convertView.findViewById(R.id.info_title);
        TextView infoContext = convertView.findViewById(R.id.info_context);

        InfoData currentinfoData = getItem(position);

        infoTitle.setText(currentinfoData.getTitle());
        infoContext.setText(currentinfoData.getBody());

        return convertView;
    }
}
