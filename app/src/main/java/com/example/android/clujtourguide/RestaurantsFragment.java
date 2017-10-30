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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
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

        tourItems.add(new TourItem(R.drawable.baracca__restaurant, getResources().getString(R.string
                .baracca), getResources().getString(R.string.description_baracca), getResources().getString(R
                .string.address_baracca), getResources(). getString(R.string.phone_number_baracca), getResources().getString(R.string.price_range_baracca)));

        tourItems.add(new TourItem(R.drawable.a_camponeza_restaurant, getResources().getString(R.string
                .a_amponeza), getResources().getString(R.string.description_a_amponeza), getResources().getString(R.string.address_a_amponeza),
                getResources().getString(R.string.phone_number_a_amponeza), getResources().getString(R.string.price_range_a_amponeza)));

        tourItems.add(new TourItem(R.drawable.via_restaurant, getResources().getString(R.string
                .via_restaurant), getResources().getString(R.string.description_via_restaurant), getResources().getString(R.string.address_via_restaurant),
                getResources().getString(R.string.phone_number_via_restaurant), getResources().getString(R.string.price_range_via_restaurant)));

        tourItems.add(new TourItem(R.drawable.via_restaurant, getResources().getString(R.string
                .via_restaurant), getResources().getString(R.string.description_via_restaurant), getResources().getString(R.string.address_via_restaurant),
                getResources().getString(R.string.phone_number_via_restaurant), getResources().getString(R.string.price_range_via_restaurant)));

        tourItems.add(new TourItem(R.drawable.olivo_caffe, getResources().getString(R.string
                .olivo_caffe_bistro), getResources().getString(R.string.description_olivo_caffe_bistro), getResources().getString(R.string.address_olivo_caffe_bistro),
                getResources().getString(R.string.phone_number_olivo_caffe_bistro), getResources().getString(R.string.price_range_olivo_caffe_bistro)));

        tourItems.add(new TourItem(R.drawable.samsara_restaurantjpg, getResources().getString(R.string
                .samsara), getResources().getString(R.string.description_samsara), getResources().getString(R.string.address_samsara),
                getResources().getString(R.string.phone_number_samsara), getResources().getString(R.string.price_range_samsara)));

        tourItems.add(new TourItem(R.drawable.zama_restaurant, getResources().getString(R.string
                .zama), getResources().getString(R.string.description_zama), getResources().getString(R.string.address_zama),
                getResources().getString(R.string.phone_number_zama), getResources().getString(R.string.price_range_zama)));

        tourItems.add(new TourItem(R.drawable.roata_restaurant, getResources().getString(R.string
                .roata), getResources().getString(R.string.description_roata), getResources().getString(R.string.address_roata),
                getResources().getString(R.string.phone_number_roata), getResources().getString(R.string.price_range_roata)));


         // Create an {@link CustomItemAdapter}, whose data source is a list of {@link TourItem}s.
        // The adapter knows how to create list items for each item in the list.
        final CustomItemAdapter adapter = new CustomItemAdapter(getActivity(), tourItems);

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


