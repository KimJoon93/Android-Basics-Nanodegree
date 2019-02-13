package com.example.android.seoultourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Enjoy_Page extends Fragment {

    public Enjoy_Page() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<ListData> enjoyLists = new ArrayList<>();
        enjoyLists.add(new ListData("SeoulTower",R.drawable.seoul));
        enjoyLists.add(new ListData("Lotte World",R.drawable.seoul));
        enjoyLists.add(new ListData("Olympic Park",R.drawable.seoul));
        enjoyLists.add(new ListData("63 Building",R.drawable.seoul));
        enjoyLists.add(new ListData("Seoul Square",R.drawable.seoul));

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_enjoy__page, container, false);
        ListView enjoylist = view.findViewById(R.id.enjoy_list);
        ListAdapter listAdapter = new ListAdapter(getContext(),enjoyLists);
        enjoylist.setAdapter(listAdapter);

        enjoylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;
    }
}
