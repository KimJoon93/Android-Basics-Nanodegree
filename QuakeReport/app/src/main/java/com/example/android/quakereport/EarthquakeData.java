package com.example.android.quakereport;

public class EarthquakeData {
    private Double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public EarthquakeData(Double mMagnitude, String mLocation, long mTimeInMilliseconds) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
