package com.alc.google.tourguideapp;

import android.content.Context;

import java.util.ArrayList;

public class HotelData {

    /**
     * An {@link ArrayList} to store data.
     */
    private static ArrayList<TouristAttraction> mData = null;

    /**
     * Private constructor to prevent instantiation
     */
    private HotelData() {
    }

    /**
     * Returns {@link TouristAttraction} data.
     *
     * @return ArrayList of Model objects.
     */
    public static ArrayList<TouristAttraction> getData(Context context) {
        if (mData == null)
        {
            mData = new ArrayList<>();

            mData.add(new TouristAttraction(context.getString(R.string.hotel_1_name),
                    context.getString(R.string.hotel_1_location)));

            mData.add(new TouristAttraction(context.getString(R.string.hotel_2_name),
                    context.getString(R.string.hotel_2_location)));
        }

        return mData;
    }
}
