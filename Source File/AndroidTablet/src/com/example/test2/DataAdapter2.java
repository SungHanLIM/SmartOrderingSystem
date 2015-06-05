package com.example.test2;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DataAdapter2 extends ArrayAdapter<CData4> {
	private LayoutInflater mInflater;
	

	private Context context;
	private TextView title;
	private TextView number;
	private TextView price;
	
	public DataAdapter2(Context context, ArrayList<CData4> object) {
		super(context, 0, object);	
		
		mInflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}

	@Override
	public View getView(int position, View v, ViewGroup parent) {
		View view = null;
		
		if (v == null) {
			view = mInflater.inflate(R.layout.spec_view2, null);
		} else {
			view = v;
		}
		final CData4 data = this.getItem(position);
		
		if (data != null) {
			
			title = (TextView) view.findViewById(R.id.title_spec2);
			number = (TextView) view.findViewById(R.id.number_spec2);
			price = (TextView) view.findViewById(R.id.price_spec2);
			
			title.setText(""+ data.getTitle());
			number.setText("" + data.getNumber());
			price.setText("" + data.getPrice());
		}
			
		return view;
	}
	
}