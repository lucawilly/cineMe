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
	
	
	
	/////getter and setter
	
	public String getTitle(){
	    return this.title;
	}
	
	
	public void setTitle(String s){
		this.title = s;
	}
	
	
	public String getYear(){
		return this.year;
	}
	
	
	public void setYear(String s){
		this.year = s;
	}
	
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		
		dest.writeString(id);
		dest.writeString(title);
		dest.writeString(year);

	}
	
	CNMovies(Parcel in){
		id = in.readString();
		title = in.readString();
		year = in.readString();
	}
	
	public static final Parcelable.Creator<CNMovies> CREATOR = new Parcelable.Creator<CNMovies>() {
		public CNMovies createFromParcel(Parcel in) {
			return new CNMovies(in);
		}

		public CNMovies[] newArray(int size) {
			return new CNMovies[size];
		}
	};

}
