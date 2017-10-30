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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
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

        tourItems.add(new TourItem(R.drawable.nest_of_angels, getResources().getString(R.string.baracca), getResources().getString(R
                .string.address_nest_of_angels), getResources().getString(R.string.description_nest_of_angels), getResources().getString(R.string.price_range_nest_of_angels)));
        tourItems.add(new TourItem(R.drawable.che_guevara, getResources().getString(R.string.che_guevara), getResources().getString(R.string.address_che_guevara), getResources().getString(R
                .string.description_che_guevara), getResources().getString(R.string.price_range_che_guevara)));
        tourItems.add(new TourItem(R.drawable.diesel_club, getResources().getString(R.string.diesel_club), getResources().getString(R
                .string.address_diesel_club), getResources().getString(R.string.description_diesel_club), getResources().getString(R.string.price_range_diesel_club)));
        tourItems.add(new TourItem(R.drawable.flying_circus_pub, getResources().getString(R.string.flying_circus), getResources().getString(R
                .string.address_flying_circus), getResources().getString(R.string.description_flying_circus), getResources().getString(R.string.price_range_flying_circus)));
        tourItems.add(new TourItem(R.drawable.after_eight, getResources().getString(R.string.after_eight), getResources().getString(R
                .string.address_after_eight), getResources().getString(R.string.description_after_eight), getResources().getString(R.string.price_range_after_eight)));
        tourItems.add(new TourItem(R.drawable.the_londoner_pub, getResources().getString(R.string.the_londoner), getResources().getString(R
                .string.address_the_londoner), getResources().getString(R.string.description_the_londoner), getResources().getString(R.string.price_range_the_londoner)));
        tourItems.add(new TourItem(R.drawable.lab_cocktail_bistro, getResources().getString(R.string.the_lab_cocktail), getResources().getString(R
                .string.address_the_lab_cocktail), getResources().getString(R.string.description_the_lab_cocktail), getResources().getString(R.string.price_range_the_lab_cocktail)));
        tourItems.add(new TourItem(R.drawable.euphoria_music_hall, getResources().getString(R.string.euphoria), getResources().getString(R
                .string.address_euphoria), getResources().getString(R.string.description_euphoria), getResources().getString(R.string.price_range_euphoria)));

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

