package com.example.android.jtunes;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter<SingInfo> {
    ArrayList<SingInfo> singList;

    public SongListAdapter(Context context, ArrayList<SingInfo> singList) {
        super(context,0, singList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.music_list_layout,parent,false);
        }
        SingInfo singInfo = getItem(position);

        TextView songtitle = (TextView) listItemView.findViewById(R.id.song_title_text);
        TextView sinername = (TextView) listItemView.findViewById(R.id.song_singer_text);

        songtitle.setText(singInfo.getSingTitle());
        sinername.setText(singInfo.getSingerName());

        return listItemView;
    }
}
