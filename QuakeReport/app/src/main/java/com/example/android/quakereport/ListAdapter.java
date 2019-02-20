package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
        TextView timeText = convertView.findViewById(R.id.time);

        Date dateObject = new Date(earthquakeData.getmTimeInMilliseconds());
        String formattedData = formatDate(dateObject);
        String formattedTime = formatTime(dateObject);

        magnitudeText.setText(earthquakeData.getmMagnitude());
        locationText.setText(earthquakeData.getmLocation());
        dateText.setText(formattedData);
        timeText.setText(formattedTime);


        return convertView;
    }
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}
