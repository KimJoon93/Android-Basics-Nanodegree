package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentword = getItem(position);

        TextView miwokText = (TextView)listItemView.findViewById(R.id.miwok_textview);
        TextView defaulttext = (TextView)listItemView.findViewById(R.id.default_textview);
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.numberimage);
        miwokText.setText(currentword.getmMiwokTranslation());
        defaulttext.setText(currentword.getmDefaultTranslation());
        imageView.setImageResource(currentword.getmImageResourceId());

        return listItemView;
    }
}
