package com.example.android.seoultourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelInfo_Page extends Fragment {

    public HotelInfo_Page() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final ArrayList<ListData> hotelListdata = new ArrayList<>();
        hotelListdata.add(new ListData("One Hotel","Near Samsungdong",R.mipmap.seoul));
        hotelListdata.add(new ListData("Two Hotel","Near Samsungdong",R.mipmap.seoul));
        hotelListdata.add(new ListData("Three Hotel","Near Samsungdong",R.mipmap.seoul));
        hotelListdata.add(new ListData("Four Hotel","Near Samsungdong",R.mipmap.seoul));
        hotelListdata.add(new ListData("Five Hotel","Near Samsungdong",R.mipmap.seoul));

        View view = inflater.inflate(R.layout.fragment_hotel_info__page, container, false);
        ListAdapter hotellistadapter = new ListAdapter(getContext(),hotelListdata);
        ListView hotellist = view.findViewById(R.id.hotelList);
        hotellist.setAdapter(hotellistadapter);

        return view;
    }

}
