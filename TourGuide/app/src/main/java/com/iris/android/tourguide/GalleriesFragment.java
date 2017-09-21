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
public class GalleriesFragment extends Fragment {


    public GalleriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<PlaceInfo> places = new ArrayList<>();
        places.add(new PlaceInfo(getString(R.string.galleries_name_ago), getString(R.string.galleries_contactInfo_ago), getString(R.string.galleries_location_ago), getString(R.string.galleries_description_ago), getString(R.string.galleries_openHour_ago), R.drawable.gallery_ago));
        places.add(new PlaceInfo(getString(R.string.galleries_name_art_museum_at_ut), getString(R.string.galleries_contactInfo_art_museum_at_ut), getString(R.string.galleries_location_art_museum_at_ut), getString(R.string.galleries_description_art_museum_at_ut), getString(R.string.galleries_openHour_art_museum_at_ut), R.drawable.gallery_art_museum_at_ut));
        places.add(new PlaceInfo(getString(R.string.galleries_name_museum_of_contemporary_art), getString(R.string.galleries_contactInfo_museum_of_contemporary_art), getString(R.string.galleries_location_museum_of_contemporary_art), getString(R.string.galleries_description_museum_of_contemporary_art), getString(R.string.galleries_openHour_museum_of_contemporary_art), R.drawable.gallery_museum_of_contemporary_art));
        places.add(new PlaceInfo(getString(R.string.galleries_name_power_plant), getString(R.string.galleries_contactInfo_power_plant), getString(R.string.galleries_location_power_plant), getString(R.string.galleries_description_power_plant), getString(R.string.galleries_openHour_power_plant), R.drawable.gallery_power_plant_comtemporary_art_gallery));
        PlaceAdapter mPlaceAdapter = new PlaceAdapter(getActivity(), places, R.color.category_galleries);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(mPlaceAdapter);
        return rootView;
    }

}
