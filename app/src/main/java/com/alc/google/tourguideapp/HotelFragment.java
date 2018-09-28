package com.alc.google.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_hotel, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.hotel_list_view);
        TouristAttractionAdapter touristAttractionAdapter = new TouristAttractionAdapter(rootView.getContext(),
                HotelData.getData(rootView.getContext()));
        listView.setAdapter(touristAttractionAdapter);

        return rootView;
    }
}
