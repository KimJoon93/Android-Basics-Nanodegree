package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<EarthquakeData> {


    public ListAdapter(Context context, ArrayList<EarthquakeData> arrayList) {
        super(context, 0, arrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        EarthquakeData earthquakeData = getItem(position);

        TextView magnitudeText = convertView.findViewById(R.id.magnitude);
        TextView locationText = convertView.findViewById(R.id.location);
        TextView dateText = convertView.findViewById(R.id.date);

        magnitudeText.setText(earthquakeData.getmMagnitude());
        locationText.setText(earthquakeData.getmLocation());
        dateText.setText(earthquakeData.getmDate());
        return convertView;
    }
}
