package com.example.test2;

import android.content.Context;

public class CData3 {
		private String Title;
		private int Number;
		private int Price;
	
		public CData3(Context context, String mTitle, int mNumber, int mPrice) {		
			Title = mTitle;
			Number = mNumber;
			Price= mPrice;
		}	

		public String getTitle() {
			return Title;
		}

		public int getNumber() {
			return Number;
		}
		
		public int getPrice(){
			return Price;
		}

}
