package com.alc.google.tourguideapp;

public class TouristAttraction {

    private static final int NONE = -1;

    private String mName;
    private String mLocation;
    private String mHours;
    private int mImageResourceId;


    public TouristAttraction(String name, String location) {
        mName = name;
        mLocation = location;
        mImageResourceId = NONE;
    }

    public TouristAttraction(String name, String location, int imageResourceId) {
        mName = name;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }


    public TouristAttraction(String name, String location, String hours, int imageResourceId) {
        mName = name;
        mHours = hours;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String title) { mName = title; }

    public String getLocation() {
        return mLocation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public String getSchedule() {
        return mHours;
    }

    public boolean hasSchedule(){ return getSchedule() != null; }

    public boolean hasImageResourceId() { return getImageResourceId() != NONE; }
}
