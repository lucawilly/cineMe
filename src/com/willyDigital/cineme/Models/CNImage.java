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
	
	
	
	public String getthum(){
		return this.thumbnail;
	}
	
	public String getProfile(){
		return this.profile;
	}
	
	public String getDetailed(){
		return this.detailed;
	}
	
	
	public String getOriginal(){
		return this.original;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(original);
		dest.writeString(detailed);
		dest.writeString(profile);
		dest.writeString(thumbnail);

	}
	
	CNImage(Parcel in){
		original = in.readString();
		detailed = in.readString();
		profile = in.readString();
		thumbnail = in.readString();
	}
	
	
	public static final Parcelable.Creator<CNImage> CREATOR = new Parcelable.Creator<CNImage>() {
		public CNImage createFromParcel(Parcel in) {
			return new CNImage(in);
		}

		public CNImage[] newArray(int size) {
			return new CNImage[size];
		}
	};

}
