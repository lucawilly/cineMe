package com.willyDigital.cineme.Models;

import com.google.gson.annotations.SerializedName;

import android.os.Parcel;
import android.os.Parcelable;

public class CNMovies implements Parcelable {
	
	@SerializedName("id")
	private String id;
	
	
	@SerializedName("title")
	private String title;
	
	@SerializedName("year")
	private String year;
	
	

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub

	}

}
