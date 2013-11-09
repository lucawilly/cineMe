package com.willyDigital.cineme.Models;

import com.google.gson.annotations.SerializedName;

import android.os.Parcel;
import android.os.Parcelable;

public class CNUpcoming implements Parcelable{
	
	
	@SerializedName
	("total")
	private String total;
	
	@SerializedName("movies")
	private CNMovies movies;
	
	
	@SerializedName("synopsis")
	private String synopsis;
	
	@SerializedName("posters")
	private CNImage posters;
	
	
	
	

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

}
