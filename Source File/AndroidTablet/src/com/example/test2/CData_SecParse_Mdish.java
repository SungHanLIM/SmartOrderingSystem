package com.example.test2;

import android.content.Context;
import android.widget.Button;

public class CData_SecParse_Mdish  {

	private String Title;
	private String Number;
	private String Price;
	private int Img;
	public Button PButton;
	public Button MButton;
	public String Index;
	
	public CData_SecParse_Mdish(Context context, String mTitle, String mNumber, String mPrice, int mImg, String mindexNumber ) {		
		
		Title = mTitle;
		Number = mNumber;
		Price= mPrice;
		Img = mImg;
		Index = mindexNumber;
		
	//	MButton = mButton1;
	//	PButton = pButton1;		
	
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

	public String getIndex(){
		return Index;
	}
	/*
	public Button getPbutton(){
		return MButton;
	}
	
	public Button getMbutton(){
		return PButton;
	}
*/
}