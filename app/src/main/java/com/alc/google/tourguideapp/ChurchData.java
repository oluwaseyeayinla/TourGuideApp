package com.alc.google.tourguideapp;

import android.content.Context;

import java.util.ArrayList;

public class ChurchData {

    /**
     * An {@link ArrayList} to store data.
     */
    private static ArrayList<TouristAttraction> mData = null;

    /**
     * Private constructor to prevent instantiation
     */
    private ChurchData() {
    }

    /**
     * Returns {@link TouristAttraction} data.
     *
     * @return ArrayList of Model objects.
     */
    public static ArrayList<TouristAttraction> getData(Context context) {
        if (mData == null) {
            mData = new ArrayList<>();

            mData.add(new TouristAttraction(context.getString(R.string.church_1_name),
                    context.getString(R.string.church_1_location), R.drawable.synagogue));

            mData.add(new TouristAttraction(context.getString(R.string.church_2_name),
                    context.getString(R.string.church_2_location), R.drawable.harvesters_chruch));

            mData.add(new TouristAttraction(context.getString(R.string.church_3_name),
                    context.getString(R.string.church_3_location), R.drawable.trem_church));
        }

        return mData;
    }
}
