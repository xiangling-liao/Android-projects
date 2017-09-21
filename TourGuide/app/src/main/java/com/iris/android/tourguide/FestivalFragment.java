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
public class FestivalFragment extends Fragment {


    public FestivalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<PlaceInfo> places = new ArrayList<>();
        places.add(new PlaceInfo(getString(R.string.festival_name_blood_ties), getString(R.string.festival_contactInfo_blood_ties), getString(R.string.festival_location_blood_ties), getString(R.string.festival_description_blood_ties), getString(R.string.festival_openHour_blood_ties), R.drawable.festival_blood_ties));
        places.add(new PlaceInfo(getString(R.string.festival_name_focus_on_gerrad), getString(R.string.festival_contactInfo_focus_on_gerrad), getString(R.string.festival_location_focus_on_gerrad), getString(R.string.festival_description_focus_on_gerrad), getString(R.string.festival_openHour_focus_on_gerrad), R.drawable.festival_focus_on_gerrad_photography_exhibition));
        places.add(new PlaceInfo(getString(R.string.festival_name_toronto_light), getString(R.string.festival_contactInfo_toronto_light), getString(R.string.festival_location_toronto_light), getString(R.string.festival_description_toronto_light), getString(R.string.festival_openHour_toronto_light), R.drawable.festival_toronto_light_festival));
        places.add(new PlaceInfo(getString(R.string.festival_name_winter_station), getString(R.string.festival_contactInfo_winter_station), getString(R.string.festival_location_winter_station), getString(R.string.festival_description_winter_station), getString(R.string.festival_openHour_winter_station), R.drawable.festival_winter_stations_2017));
        PlaceAdapter mPlaceAdapter = new PlaceAdapter(getActivity(), places, R.color.category_festivals);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(mPlaceAdapter);
        return rootView;
    }

}
