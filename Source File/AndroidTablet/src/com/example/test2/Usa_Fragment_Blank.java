package com.example.test2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Usa_Fragment_Blank extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		return inflater.inflate(R.layout.usa_fragment_blank, container,
				false);

	}

	@Override
	public void onPause() {
		super.onPause();
	}
	@Override
	public void onStop(){
		super.onStop();
	}
	@Override
	public void onDestroyView(){
		super.onDestroyView();
	}
	@Override
	public void onDestroy(){
		super.onDestroy();
	}
	@Override
	public void onDetach(){
		super.onDetach();
	}
}