package com.iris.android.tourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iris on 2017-03-06.
 */

public class PlaceAdapter extends ArrayAdapter<PlaceInfo> {
    private int mColorId;
/*
constructor for a new instance construction
    */

    public PlaceAdapter(Activity context, ArrayList<PlaceInfo> places, int color) {
        super(context, 0, places);//0 is original for simple_list_view_1
        mColorId = color;
    }

    @Override
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     * instructions for how to give view to listview
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            ViewHolder mViewHolder;
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
            mViewHolder = new ViewHolder(listItemView);
            listItemView.setTag(mViewHolder);
        }

        // Get the {@link word} object located at this position in the list
        PlaceInfo currentPlace = getItem(position);
        //get viewholder for each listItemView
        ViewHolder viewHolder = (ViewHolder) listItemView.getTag();

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);


        //get reference and set value
        //1.place name
        viewHolder.mPlaceName.setText(currentPlace.getmPlaceName());
        //2.phone number or email
        viewHolder.mContactInfo.setText(currentPlace.getmContactInfo());
        //3.address
        viewHolder.mAddress.setText(currentPlace.getmAddress());
        //4.bussiness hour
        viewHolder.mOpenHour.setText(currentPlace.getmBusinessHour());
        //5.description
        viewHolder.mDescription.setText(currentPlace.getmDescription());
        //6.image
        viewHolder.mImage.setImageResource(currentPlace.getmImage());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

    class ViewHolder {
        private TextView mPlaceName;
        private TextView mContactInfo;
        private TextView mAddress;
        private TextView mOpenHour;
        private ImageView mImage;
        private  TextView mDescription;

        public ViewHolder(View listItemView) {
            this.mPlaceName = (TextView) listItemView.findViewById(R.id.item_name);
            this.mContactInfo = (TextView) listItemView.findViewById(R.id.phone_nubmer_text_view);
            this.mAddress = (TextView) listItemView.findViewById(R.id.address_text_view);
            this.mOpenHour = (TextView) listItemView.findViewById(R.id.business_hour_text_view);
            this.mDescription = (TextView) listItemView.findViewById(R.id.description_text_view);
            this.mImage=(ImageView) listItemView.findViewById(R.id.image_view);
        }
    }
}
