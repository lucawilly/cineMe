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
	
	
	/**
	 * getter and setter
	 */
	
	public String getTotal(){
		return this.total;
	}
	
	public void setTotal(String s){
		this.total = s;
	}
	
	public CNMovies getMovies(){
		return this.movies;
	}
	
	public void setMovies(CNMovies movies){
		this.movies = movies;
	}
	
	public String getSynopsis(){
		return this.synopsis;
	}
	
	public void setSynopsis(String s){
		this.synopsis=s;
	}
	
	public CNImage getImages(){
		return this.posters;
	}
	
	public void setImages(CNImage post){
		this.posters = post;
	}
	

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int arg1) {
		// TODO Auto-generated method stub
		
		out.writeString(total);
		out.writeString(synopsis);
		
		
		
	}
	
	CNUpcoming(Parcel in){
		total = in.readString();
		synopsis = in.readString();
	}
	
	public static final Parcelable.Creator<CNUpcoming> CREATOR = new Parcelable.Creator<CNUpcoming>() {
		public CNUpcoming createFromParcel(Parcel in) {
			return new CNUpcoming(in);
		}

		public CNUpcoming[] newArray(int size) {
			return new CNUpcoming[size];
		}
	};
	

}
