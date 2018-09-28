package com.alc.google.tourguideapp;

import android.content.Context;

import java.util.ArrayList;

public class StadiumData {

    /**
     * An {@link ArrayList} to store data.
     */
    private static ArrayList<TouristAttraction> mData;

    /**
     * Private constructor to prevent instantiation
     */
    private StadiumData() {
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

            mData.add(new TouristAttraction(context.getString(R.string.stadium_1_name),
                    context.getString(R.string.stadium_1_location)));

            mData.add(new TouristAttraction(context.getString(R.string.stadium_2_name),
                    context.getString(R.string.stadium_2_location)));

            mData.add(new TouristAttraction(context.getString(R.string.stadium_3_name),
                    context.getString(R.string.stadium_3_location)));
        }

        return mData;
    }
}
