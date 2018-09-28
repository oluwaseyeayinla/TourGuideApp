package com.alc.google.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class TourGuideFragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;
    private Context mContext;

    public TourGuideFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public TourGuideFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, HotelFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, ChurchFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, MuseumFragment.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, StadiumFragment.class.getName());
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hotels);
        } else if (position == 1) {
            return mContext.getString(R.string.churches);
        } else if (position == 2) {
            return mContext.getString(R.string.museums);
        } else {
            return mContext.getString(R.string.stadiums);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
