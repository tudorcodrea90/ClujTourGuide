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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
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
        tourItems.add(new TourItem(R.drawable.botanical_garden, getResources().getString(R.string
                .botanical_garden),  getResources().getString(R.string.address_botanical_garden), getResources().getString(R
                .string.description_botanical_garden), getResources().getString(R.string
                .price_range_botanical_garden)));
        tourItems.add(new TourItem(R.drawable.the_central_park, getResources().getString(R.string
                .central_park),  getResources().getString(R.string.address_central_park), getResources().getString(R
                .string.description_central_park), getResources().getString(R.string.price_range_central_park)));
        tourItems.add(new TourItem(R.drawable.etnografic_park, getResources().getString(R.string
                .etnographic_parck),  getResources().getString(R.string.address_etnographic_parck), getResources().getString(R
                .string.description_etnographic_parck), getResources().getString(R.string.price_range_etnographic_parck)));
        tourItems.add(new TourItem(R.drawable.turda_salt_mine, getResources().getString(R.string
                .turda_salt_mine),  getResources().getString(R.string.address_turda_salt_mine), getResources().getString(R
                .string.description_turda_salt_mine), getResources().getString(R.string.price_range_turda_salt_mine)));
        tourItems.add(new TourItem(R.drawable.history_museum, getResources().getString(R.string
                .history_museum),  getResources().getString(R.string.address_history_museum), getResources().getString(R
                .string.description_history_museum), getResources().getString(R.string.price_range_history_museum)));
        tourItems.add(new TourItem(R.drawable.st_michael_church, getResources().getString(R.string
                .st_michael_church),  getResources().getString(R.string.address_st_michael_church), getResources().getString(R
                .string.description_st_michael_church), getResources().getString(R.string.price_range_st_michael_church)));
        tourItems.add(new TourItem(R.drawable.pharmacy_museum, getResources().getString(R.string
                .pharmacy_museum),  getResources().getString(R.string.address_pharmacy_museum), getResources().getString(R
                .string.description_pharmacy_museum), getResources().getString(R.string.price_range_pharmacy_museum)));

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
