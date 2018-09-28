package com.alc.google.tourguideapp;

import android.content.Context;

import java.util.ArrayList;

public class MuseumData {

    /**
     * An {@link ArrayList} to store data.
     */
    private static ArrayList<TouristAttraction> mData = null;

    /**
     * Private constructor to prevent instantiation
     */
    private MuseumData() {
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

            mData.add(new TouristAttraction(context.getString(R.string.museum_1_name),
                    context.getString(R.string.museum_1_location),
                    context.getString(R.string.dummy_attraction_hours),
                    -1));

            mData.add(new TouristAttraction(context.getString(R.string.museum_2_name),
                    context.getString(R.string.museum_2_location),
                    context.getString(R.string.dummy_attraction_hours),
                    -1));

            mData.add(new TouristAttraction(context.getString(R.string.museum_3_name),
                    context.getString(R.string.museum_3_location),
                    context.getString(R.string.dummy_attraction_hours),
                    -1));
        }

        return mData;
    }
}
