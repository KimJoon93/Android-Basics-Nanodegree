package com.example.android.newsfeed;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ListAdapter extends ArrayAdapter<NewsData> {

    private static final String LOG_TAG = ListAdapter.class.getSimpleName();

    public ListAdapter(Context context, List<NewsData> newsdatas) {
        super(context, 0, newsdatas);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        return convertView;
    }


    private String formatDate(Date dateObj) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(dateObj);
    }

    private Date parseDate(String strDate) {
        if (strDate == null) return null;
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = null;
        try {
            date = parser.parse(strDate);
        } catch (ParseException e) {
            Log.e(LOG_TAG, "Error parsing date", e);
        }
        return date;
    }

}
