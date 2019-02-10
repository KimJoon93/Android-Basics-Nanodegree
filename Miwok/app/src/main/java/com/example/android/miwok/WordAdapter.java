package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
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

        View textContainer = listItemView.findViewById(R.id.textcontainer);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        if(currentword.hasImage()){
            imageView.setImageResource(currentword.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
