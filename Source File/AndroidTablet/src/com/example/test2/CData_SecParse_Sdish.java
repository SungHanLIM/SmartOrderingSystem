package com.example.test2;

import android.content.Context;

public class CData_SecParse_Sdish {
	private String Title;
	private String Number;
	private String Price;
	private int Img;
	
	public CData_SecParse_Sdish(Context context, String mTitle, String mNumber, String mPrice, int mImg) {		
		
		Title = mTitle;
		Number = mNumber;
		Price= mPrice;
		Img = mImg;
	//	Parse_pButton = pButton;
	//	Parse_mButton = mButton;
				
	}	

	public String getTitle() {
		return Title;
	}

	public String getNumber() {
		return Number;
	}
	
	public String getPrice(){
		return Price;
	}

	public int getImg() {
		return Img;
	}
}