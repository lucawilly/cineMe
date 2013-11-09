package com.willyDigital.cineme.Models;

import com.google.gson.annotations.SerializedName;

import android.os.Parcel;
import android.os.Parcelable;

public class CNImage implements Parcelable {
	
	@SerializedName("thumbnail")
	private String thumbnail;
	
	
	@SerializedName("profile")
	private String profile;
	
	@SerializedName("detailed")
	private String detailed;
	
	
	@SerializedName("original")
	private String original;
	
	
	

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
