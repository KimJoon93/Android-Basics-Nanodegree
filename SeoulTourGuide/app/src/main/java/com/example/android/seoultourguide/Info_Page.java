package com.example.android.seoultourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Info_Page extends Fragment {

    public Info_Page() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final ArrayList<ListData> infoLists = new ArrayList<>();
        infoLists.add(new ListData("TourCallCenter","TourTranslationCall 1330"));
        infoLists.add(new ListData("TourCallCenter","TourTranslationCall 1330"));
        infoLists.add(new ListData("TourCallCenter","TourTranslationCall 1330"));
        infoLists.add(new ListData("TourCallCenter","TourTranslationCall 1330"));
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info__page, container, false);

        ListView infolist = (ListView)view.findViewById(R.id.infolist);
        ListAdapter listAdapter = new ListAdapter(getContext(), infoLists);
        infolist.setAdapter(listAdapter);

        return view;
    }
}
