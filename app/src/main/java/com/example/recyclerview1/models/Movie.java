package com.example.recyclerview1.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    public String name;
    public int logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public Movie(String name, int logo) {
        this.name = name;
        this.logo = logo;
    }

    protected Movie(Parcel in) {
        name = in.readString();
        logo = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(logo);
    }
}
