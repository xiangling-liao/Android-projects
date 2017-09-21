package com.iris.android.tourguide;

/**
 * Created by iris on 2017-03-06.
 */

public class PlaceInfo {
    private String mPlaceName;
    private String mContactInfo;
    private String mAddress;
    private String mDescription;
    private String mBusinessHour;
    private int mImage;



    public PlaceInfo(String placeName, String contactInfo, String address, String description, String openHour, int image){
    mPlaceName=placeName;
    mContactInfo=contactInfo;
    mAddress=address;
    mDescription=description;
    mBusinessHour=openHour;
    mImage=image;

}

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmContactInfo() {
        return mContactInfo;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmBusinessHour() {
        return mBusinessHour;
    }
    public int getmImage() {
        return mImage;
    }
}
