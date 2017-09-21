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
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<PlaceInfo> places = new ArrayList<>();
        places.add(new PlaceInfo(getString(R.string.landmarks_name_cn_tower), getString(R.string.landmarks_contactInfo_cn_tower), getString(R.string.landmarks_location_cn_tower), getString(R.string.landmarks_description_cn_tower), getString(R.string.landmarks_openHour_cn_tower), R.drawable.landmark_cn_tower));
        places.add(new PlaceInfo(getString(R.string.landmarks_name_evergrenn), getString(R.string.landmarks_contactInfo_evergrenn), getString(R.string.landmarks_location_evergrenn), getString(R.string.landmarks_description_evergrenn), getString(R.string.landmarks_openHour_evergrenn), R.drawable.landmark_evergreen));
        places.add(new PlaceInfo(getString(R.string.landmarks_name_old_city_hall), getString(R.string.landmarks_contactInfo_old_city_hall), getString(R.string.landmarks_location_old_city_hall), getString(R.string.landmarks_description_old_city_hall), getString(R.string.landmarks_openHour_old_city_hall), R.drawable.landmark_old_city_hall));
        places.add(new PlaceInfo(getString(R.string.landmarks_name_osgood_hall), getString(R.string.landmarks_contactInfo_osgood_hall), getString(R.string.landmarks_location_osgood_hall), getString(R.string.landmarks_description_osgood_hall), getString(R.string.landmarks_openHour_osgood_hall), R.drawable.landmark_osgood_hall));
        PlaceAdapter mPlaceAdapter = new PlaceAdapter(getActivity(), places, R.color.category_landmarks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(mPlaceAdapter);
        return rootView;
    }

}
