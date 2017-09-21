package com.iris.android.tourguide;


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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<PlaceInfo> places = new ArrayList<>();
        places.add(new PlaceInfo(getString(R.string.restaurant_name_alo), getString(R.string.restaurant_contactInfo_alo), getString(R.string.restaurant_location_alo), getString(R.string.restaurant_description_alo), getString(R.string.restaurant_openHour_alo), R.drawable.restaurant_alo));
        places.add(new PlaceInfo(getString(R.string.restaurant_name_byblo), getString(R.string.restaurant_contactInfo_byblo), getString(R.string.restaurant_location_byblo), getString(R.string.restaurant_description_byblo), getString(R.string.restaurant_openHour_byblo), R.drawable.restaurant_byblo));
        places.add(new PlaceInfo(getString(R.string.restaurant_name_george), getString(R.string.restaurant_contactInfo_george), getString(R.string.restaurant_location_george), getString(R.string.restaurant_description_george), getString(R.string.restaurant_openHour_george), R.drawable.restaurant_george));
        places.add(new PlaceInfo(getString(R.string.restaurant_name_richmond_station), getString(R.string.restaurant_contactInfo_richmond_station), getString(R.string.restaurant_location_richmond_station), getString(R.string.restaurant_description_richmond_station), getString(R.string.restaurant_openHour_richmond_station), R.drawable.restaurant_richmond_station));
        PlaceAdapter mPlaceAdapter = new PlaceAdapter(getActivity(), places, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(mPlaceAdapter);
        return rootView;
    }

}
