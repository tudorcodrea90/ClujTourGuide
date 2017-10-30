package com.example.android.clujtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Find and inflate ListView to use with adapter
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of Sights
        final ArrayList<TourItem> tourItems = new ArrayList<TourItem>();


        // Populate item list
        tourItems.add(new TourItem(R.drawable.opera_plaza_hotel, getResources().getString(R.string
                .opera_plaza), getResources().getString(R.string.description_opera_plaza), getResources().getString(R.string.address_opera_plaza),
                 getResources().getString(R.string.price_range_opera_plaza)));
        tourItems.add(new TourItem(R.drawable.grand_hotel_italia, getResources().getString(R.string
                .grand_hotel_italia), getResources().getString(R.string.description_grand_hotel_italia), getResources().getString(R.string.address_grand_hotel_italia),
                 getResources().getString(R.string.price_range_grand_hotel_italia)));
        tourItems.add(new TourItem(R.drawable.grand_hotel_napoca, getResources().getString(R.string
                .grand_hotel_napoca), getResources().getString(R.string.description_grand_hotel_napoca), getResources().getString(R.string.address_grand_hotel_napoca),
                getResources().getString(R.string.price_range_grand_hotel_napoca)));
        tourItems.add(new TourItem(R.drawable.alexgeorge_hotel, getResources().getString(R.string
                .alexgeorge), getResources().getString(R.string.description_alexgeorge), getResources().getString(R.string.address_alexgeorge),
                getResources().getString(R.string.price_range_alexgeorge)));
        tourItems.add(new TourItem(R.drawable.sunny_hill_hotel, getResources().getString(R.string
                .sunny_hill), getResources().getString(R.string.description_sunny_hill), getResources().getString(R.string.address_sunny_hill),
                getResources().getString(R.string.price_range_sunny_hill)));
        tourItems.add(new TourItem(R.drawable.sun_hotel, getResources().getString(R.string
                .sun_hotel), getResources().getString(R.string.description_sun_hotel), getResources().getString(R.string.address_sun_hotel),
                getResources().getString(R.string.price_range_sun_hotel)));
        tourItems.add(new TourItem(R.drawable.hampton_hotel, getResources().getString(R.string
                .hilton), getResources().getString(R.string.description_hilton), getResources().getString(R.string.address_hilton),
                getResources().getString(R.string.price_range_hilton)));


        // Create an {@link CustomItemAdapter}, whose data source is a list of {@link TourItem}s.
        // The adapter knows how to create list items for each item in the list.
        CustomItemAdapter adapter = new CustomItemAdapter(getActivity(), tourItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CustomItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link TourItem} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
