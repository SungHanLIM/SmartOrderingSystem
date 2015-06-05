package com.example.test2;

import java.util.ArrayList;
import java.util.Enumeration;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class DataAdapter4 extends ArrayAdapter<CData_SecParse_Sdish> {
	private LayoutInflater mInflater2;
	
	static public String title1;
	String number_value;
	String price1;
	private static final String TAG = null;
	static public int number_value2;
	int price2;
	int modified_value;
	int cal_price_appetizer = 0;
	int cal_price_salad = 0;
	int cal_price_seafood = 0;
	
	int AppetizerIndex1;
	int AppetizerIndex2;
	int AppetizerIndex3;
	int AppetizerIndex4;
	int AppetizerIndex5;
	int AppetizerIndex6;
	
	int SaladIndex1;
	int SaladIndex2;
	int SaladIndex3;
	int SaladIndex4;
	
	int SeafoodIndex1;
	int SeafoodIndex2;
	int SeafoodIndex3;
	
	Button second_parse_minusbutton;
	Button second_parse_plusbutton;
	
	public DataAdapter4(Context context, ArrayList<CData_SecParse_Sdish> object) {
		super(context, 0, object);	
		
		mInflater2 = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}

	@Override
	public View getView(int position, View v, ViewGroup parent) {
		View view2 = null;
		
		if (v == null) {
			view2 = mInflater2.inflate(R.layout.custom_view, null);
		} else {
			view2 = v;
		}
		final CData_SecParse_Sdish data2 = this.getItem(position);
		
		if (data2 != null) {
			
			TextView title = (TextView) view2.findViewById(R.id.title_tv1);
			TextView number = (TextView) view2.findViewById(R.id.number_tv2);
			TextView price = (TextView) view2.findViewById(R.id.price_tv3);
			ImageView img = (ImageView) view2.findViewById(R.id.img);
			
			second_parse_minusbutton = (Button) view2
					.findViewById(R.id.second_parse_minusbutton);
			second_parse_minusbutton.setFocusable(false);

			second_parse_plusbutton = (Button) view2
					.findViewById(R.id.second_parse_plusbutton);
			second_parse_plusbutton.setFocusable(false);
			
			title.setText(" " + data2.getTitle());
			number.setText(" 갯수 : " + data2.getNumber());
			price.setText(" 가격 : " + data2.getPrice());
			img.setImageResource(data2.getImg());
		}
		
		
		Korean_OrderDetail.sidemenu_mListView2.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {	
				CData_SecParse_Sdish data = (CData_SecParse_Sdish)arg0.getAdapter().getItem(arg2);
				
				
				title1 = data.getTitle();
				number_value = data.getNumber();
				price1 = data.getPrice();
				
				
				Enumeration en2 = Korean_OrderDetail.ht2.keys();
				
				try{
					AppetizerIndex1 = Korean_OrderDetail.ht2.get("appetizer_save_index1");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					AppetizerIndex2 = Korean_OrderDetail.ht2.get("appetizer_save_index2");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					AppetizerIndex3 = Korean_OrderDetail.ht2.get("appetizer_save_index3");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					AppetizerIndex4 = Korean_OrderDetail.ht2.get("appetizer_save_index4");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					AppetizerIndex5 = Korean_OrderDetail.ht2.get("appetizer_save_index5");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					AppetizerIndex6 = Korean_OrderDetail.ht2.get("appetizer_save_index6");
				}catch(Exception e){
					e.printStackTrace();
				}

				try{
					SaladIndex1 = Korean_OrderDetail.ht2.get("salad_save_index1");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					SaladIndex2 = Korean_OrderDetail.ht2.get("salad_save_index2");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					SaladIndex3 = Korean_OrderDetail.ht2.get("salad_save_index3");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					SaladIndex4 = Korean_OrderDetail.ht2.get("salad_save_index4");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					SeafoodIndex1 = Korean_OrderDetail.ht2.get("seafood_save_index1");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					SeafoodIndex2 = Korean_OrderDetail.ht2.get("seafood_save_index2");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					SeafoodIndex3 = Korean_OrderDetail.ht2.get("seafood_save_index3");
				}catch(Exception e){
					e.printStackTrace();
				}
				
				while(en2.hasMoreElements())
				{
					String key = en2.nextElement().toString();
					/*
					Toast.makeText(getContext(), ""+Korean_OrderDetail.ht.get(key),
							Toast.LENGTH_SHORT).show();
					*/
					Log.d(TAG,"out = " +Korean_OrderDetail.ht2.get(key));	
				}
				
				
				Log.d(TAG,"AppetizerIndex1= " +AppetizerIndex1);
				Log.d(TAG,"AppetizerIndex2= " +AppetizerIndex2);
				Log.d(TAG,"AppetizerIndex3= " +AppetizerIndex3);
				Log.d(TAG,"AppetizerIndex4= " +AppetizerIndex4);
				Log.d(TAG,"AppetizerIndex5= " +AppetizerIndex5);
				Log.d(TAG,"AppetizerIndex6= " +AppetizerIndex6);
				
				Log.d(TAG,"SaladIndex1= " +SaladIndex1);
				Log.d(TAG,"SaladIndex2= " +SaladIndex2);
				Log.d(TAG,"SaladIndex3= " +SaladIndex3);
				Log.d(TAG,"SaladIndex4= " +SaladIndex4);
				
				Log.d(TAG,"SeafoodIndex1= " +SeafoodIndex1);
				Log.d(TAG,"SeafoodIndex2= " +SeafoodIndex2);
				Log.d(TAG,"SeafoodIndex3= " +SeafoodIndex3);
			
				number_value2 = Integer.parseInt(number_value);
				price2 = Integer.parseInt(price1);
				modified_value = (price2 / number_value2);
				
				//Log.e(TAG,"수량 :   " +number_value2+  "가격:  " +price2+  "한개 가격:  " +modified_value);
			}
			
			
		});
		
		second_parse_minusbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(number_value2 != 0){					
					price2 = price2 - modified_value; // 총액에서 한개가격을 빼준 나머지
					
					Log.e(TAG,"메뉴 한개의 값  "+ modified_value);
					Log.e(TAG,"변경된 메뉴 값  "+ price2);
					
					
					if(title1.equals("스파이시 비프 퀘사디아")||title1.equals("골드 코스트 코코넛 쉬림프")||title1.equals("오지 치즈 후라이즈")||title1.equals("그릴드 쿠카부라 윙")||title1.equals("레인지랜드 립레츠")||title1.equals("기브미 파이브")){
						cal_price_appetizer = cal_price_appetizer-modified_value;
					}
					if(title1.equals("레몬 시저 샐러드")||title1.equals("캘리포니아 스테이크 샐러드")||title1.equals("치킨 텐더 샐러드")||title1.equals("그릴드 씨푸드 로메인 샐러드")){
						cal_price_salad = cal_price_salad-modified_value;
					}
					if(title1.equals("치즈 랍스터 & 쉬림프 케익")||title1.equals("웨스턴 그릴드 씨푸드 플래터")||title1.equals("피시 & 칩스")){
						cal_price_seafood = cal_price_seafood-modified_value;
					}
					Log.e(TAG,"cal_price_appetizer 값" + cal_price_appetizer);
					Log.e(TAG,"cal_price_salad 값" + cal_price_salad);
					Log.e(TAG,"cal_price_seafood 값" + cal_price_seafood);
					
					number_value2--;
				}		
				

					
					if(title1.equals("스파이시 비프 퀘사디아")){
						Korean_OrderDetail.appetizer_num_data1 = number_value2;
						if(AppetizerIndex1 == 0){
							updateView(AppetizerIndex1);
						}
					}
					
					if(title1.equals("골드 코스트 코코넛 쉬림프")){
						Korean_OrderDetail.appetizer_num_data2 = number_value2;
						if(AppetizerIndex2 == 0 || AppetizerIndex2 == 1){
							updateView(AppetizerIndex2);
						}
					}
					
					if(title1.equals("오지 치즈 후라이즈")){
						Korean_OrderDetail.appetizer_num_data3 = number_value2;
						if(AppetizerIndex3 == 0 || AppetizerIndex3 == 1 || AppetizerIndex3 == 2){
							updateView(AppetizerIndex3);
						}
					}
					
					if(title1.equals("그릴드 쿠카부라 윙")){
						Korean_OrderDetail.appetizer_num_data4 = number_value2;
						if(AppetizerIndex4 == 0 || AppetizerIndex4 == 1 || AppetizerIndex4 == 2 || AppetizerIndex4 == 3){
							updateView(AppetizerIndex4);
						}
					}
					
					if(title1.equals("레인지랜드 립레츠")){
						Korean_OrderDetail.appetizer_num_data5 = number_value2;
						if(AppetizerIndex5 == 0 || AppetizerIndex5 == 1 || AppetizerIndex5 == 2 || AppetizerIndex5 == 3 || AppetizerIndex5 == 4){
							updateView(AppetizerIndex5);
						}
					}
					
					if(title1.equals("기브미 파이브")){
						Korean_OrderDetail.appetizer_num_data6 = number_value2;
						if(AppetizerIndex6 == 0 || AppetizerIndex6 == 1 || AppetizerIndex6 == 2 || AppetizerIndex6 == 3 || AppetizerIndex6 == 4 || AppetizerIndex6 == 5){
							updateView(AppetizerIndex6);
						}
					}
					
					if(title1.equals("레몬 시저 샐러드")){
						Korean_OrderDetail.salad_num_data1 = number_value2;
						if(SaladIndex1 == 0 || SaladIndex1 == 1 || SaladIndex1 == 2 || SaladIndex1 == 3 || SaladIndex1 == 4 || SaladIndex1 == 5 || SaladIndex1 == 6){
							updateView(SaladIndex1);
						}
					}
					
					if(title1.equals("캘리포니아 스테이크 샐러드")){
						Korean_OrderDetail.salad_num_data2 = number_value2;
						if(SaladIndex2 == 0 || SaladIndex2 == 1 || SaladIndex2 == 2 || SaladIndex2 == 3 || SaladIndex2 == 4 || SaladIndex2 == 5 || SaladIndex2 == 6 || SaladIndex2 == 7){
							updateView(SaladIndex2);
						}
					}
					
					if(title1.equals("치킨 텐더 샐러드")){
						Korean_OrderDetail.salad_num_data3 = number_value2;
						if(SaladIndex3 == 0 || SaladIndex3 == 1 || SaladIndex3 == 2 || SaladIndex3 == 3 || SaladIndex3 == 4 || SaladIndex3 == 5 || SaladIndex3 == 6 || SaladIndex3 == 7 || SaladIndex3 == 8){
							updateView(SaladIndex3);
						}
					}
					
					if(title1.equals("그릴드 씨푸드 로메인 샐러드")){
						Korean_OrderDetail.salad_num_data4 = number_value2;
						if(SaladIndex4 == 0 || SaladIndex4 == 1 || SaladIndex4 == 2 || SaladIndex4 == 3 || SaladIndex4 == 4 || SaladIndex4 == 5 || SaladIndex4 == 6 || SaladIndex4 == 7 || SaladIndex4 == 8 || SaladIndex4 == 9){
							updateView(SaladIndex4);
						}
					}
					
					if(title1.equals("치즈 랍스터 & 쉬림프 케익")){
						Korean_OrderDetail.seafood_num_data1 = number_value2;
						if(SeafoodIndex1 == 0 || SeafoodIndex1 == 1 || SeafoodIndex1 == 2 || SeafoodIndex1 == 3 || SeafoodIndex1 == 4 || SeafoodIndex1 == 5 || SeafoodIndex1 == 6 || SeafoodIndex1 == 7 || SeafoodIndex1 == 8 || SeafoodIndex1 == 9 || SeafoodIndex1 == 10){
							updateView(SeafoodIndex1);
						}
					}
					
					if(title1.equals("웨스턴 그릴드 씨푸드 플래터")){
						Korean_OrderDetail.seafood_num_data2 = number_value2;
						if(SeafoodIndex2 == 0 || SeafoodIndex2 == 1 || SeafoodIndex2 == 2 || SeafoodIndex2 == 3 || SeafoodIndex2 == 4 || SeafoodIndex2 == 5 || SeafoodIndex2 == 6 || SeafoodIndex2 == 7 || SeafoodIndex2 == 8 || SeafoodIndex2 == 9 || SeafoodIndex2 == 10 || SeafoodIndex2 == 11){
							updateView(SeafoodIndex2);
						}
					}
					
					if(title1.equals("피시 & 칩스")){
						Korean_OrderDetail.seafood_num_data3 = number_value2;
						if(SeafoodIndex3 == 0 || SeafoodIndex3 == 1 || SeafoodIndex3 == 2 || SeafoodIndex3 == 3 || SeafoodIndex3 == 4 || SeafoodIndex3 == 5 || SeafoodIndex3 == 6 || SeafoodIndex3 == 7 || SeafoodIndex3 == 8 || SeafoodIndex3 == 9 || SeafoodIndex3 == 10 || SeafoodIndex3 == 11 || SeafoodIndex3 == 12){
							updateView(SeafoodIndex3);
						}
					}
			}
		});
		
		second_parse_plusbutton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				price2 = price2 + modified_value; // 총액에서 한개가격을 빼준 나머지 
			

				if(title1.equals("스파이시 비프 퀘사디아")||title1.equals("골드 코스트 코코넛 쉬림프")||title1.equals("오지 치즈 후라이즈")||title1.equals("그릴드 쿠카부라 윙")||title1.equals("레인지랜드 립레츠")||title1.equals("기브미 파이브")){
				cal_price_appetizer = cal_price_appetizer+modified_value;
				}
				if(title1.equals("레몬 시저 샐러드")||title1.equals("캘리포니아 스테이크 샐러드")||title1.equals("치킨 텐더 샐러드")||title1.equals("그릴드 씨푸드 로메인 샐러드")){
					cal_price_salad = cal_price_salad+modified_value;
				}
				if(title1.equals("치즈 랍스터 & 쉬림프 케익")||title1.equals("웨스턴 그릴드 씨푸드 플래터")||title1.equals("피시 & 칩스")){
					cal_price_seafood = cal_price_seafood+modified_value;
				}
				
				Log.e(TAG,"메뉴 한개의 값  "+ modified_value);
				Log.e(TAG,"변경된 메뉴 값  "+ price2);
				
				Log.e(TAG,"cal_price_appetizer 값  "+ cal_price_appetizer);
				Log.e(TAG,"cal_price_salad 값" + cal_price_salad);
				Log.e(TAG,"cal_price_seafood 값" + cal_price_seafood);
				
				
				number_value2++;
				

					
					if(title1.equals("스파이시 비프 퀘사디아")){
						Korean_OrderDetail.appetizer_num_data1 = number_value2;
						if(AppetizerIndex1 == 0){
							updateView(AppetizerIndex1);
						}
					}
					
					if(title1.equals("골드 코스트 코코넛 쉬림프")){
						Korean_OrderDetail.appetizer_num_data2 = number_value2;
						if(AppetizerIndex2 == 0 || AppetizerIndex2 == 1){
							updateView(AppetizerIndex2);
						}
					}
					
					if(title1.equals("오지 치즈 후라이즈")){
						Korean_OrderDetail.appetizer_num_data3 = number_value2;
						if(AppetizerIndex3 == 0 || AppetizerIndex3 == 1 || AppetizerIndex3 == 2){
							updateView(AppetizerIndex3);
						}
					}
					
					if(title1.equals("그릴드 쿠카부라 윙")){
						Korean_OrderDetail.appetizer_num_data4 = number_value2;
						if(AppetizerIndex4 == 0 || AppetizerIndex4 == 1 || AppetizerIndex4 == 2 || AppetizerIndex4 == 3){
							updateView(AppetizerIndex4);
						}
					}
					
					if(title1.equals("레인지랜드 립레츠")){
						Korean_OrderDetail.appetizer_num_data5 = number_value2;
						if(AppetizerIndex5 == 0 || AppetizerIndex5 == 1 || AppetizerIndex5 == 2 || AppetizerIndex5 == 3 || AppetizerIndex5 == 4){
							updateView(AppetizerIndex5);
						}
					}
					
					if(title1.equals("기브미 파이브")){
						Korean_OrderDetail.appetizer_num_data6 = number_value2;
						if(AppetizerIndex6 == 0 || AppetizerIndex6 == 1 || AppetizerIndex6 == 2 || AppetizerIndex6 == 3 || AppetizerIndex6 == 4 || AppetizerIndex6 == 5){
							updateView(AppetizerIndex6);
						}
					}
					if(title1.equals("레몬 시저 샐러드")){
						Korean_OrderDetail.salad_num_data1 = number_value2;
						if(SaladIndex1 == 0 || SaladIndex1 == 1 || SaladIndex1 == 2 || SaladIndex1 == 3 || SaladIndex1 == 4 || SaladIndex1 == 5 || SaladIndex1 == 6){
							updateView(SaladIndex1);
						}
					}
					
					if(title1.equals("캘리포니아 스테이크 샐러드")){
						Korean_OrderDetail.salad_num_data2 = number_value2;
						if(SaladIndex2 == 0 || SaladIndex2 == 1 || SaladIndex2 == 2 || SaladIndex2 == 3 || SaladIndex2 == 4 || SaladIndex2 == 5 || SaladIndex2 == 6 || SaladIndex2 == 7){
							updateView(SaladIndex2);
						}
					}
					
					if(title1.equals("치킨 텐더 샐러드")){
						Korean_OrderDetail.salad_num_data3 = number_value2;
						if(SaladIndex3 == 0 || SaladIndex3 == 1 || SaladIndex3 == 2 || SaladIndex3 == 3 || SaladIndex3 == 4 || SaladIndex3 == 5 || SaladIndex3 == 6 || SaladIndex3 == 7 || SaladIndex3 == 8){
							updateView(SaladIndex3);
						}
					}
					
					if(title1.equals("그릴드 씨푸드 로메인 샐러드")){
						Korean_OrderDetail.salad_num_data4 = number_value2;
						if(SaladIndex4 == 0 || SaladIndex4 == 1 || SaladIndex4 == 2 || SaladIndex4 == 3 || SaladIndex4 == 4 || SaladIndex4 == 5 || SaladIndex4 == 6 || SaladIndex4 == 7 || SaladIndex4 == 8 || SaladIndex4 == 9){
							updateView(SaladIndex4);
						}
					}
					
					if(title1.equals("치즈 랍스터 & 쉬림프 케익")){
						Korean_OrderDetail.seafood_num_data1 = number_value2;
						if(SeafoodIndex1 == 0 || SeafoodIndex1 == 1 || SeafoodIndex1 == 2 || SeafoodIndex1 == 3 || SeafoodIndex1 == 4 || SeafoodIndex1 == 5 || SeafoodIndex1 == 6 || SeafoodIndex1 == 7 || SeafoodIndex1 == 8 || SeafoodIndex1 == 9 || SeafoodIndex1 == 10){
							updateView(SeafoodIndex1);
						}
					}
					
					if(title1.equals("웨스턴 그릴드 씨푸드 플래터")){
						Korean_OrderDetail.seafood_num_data2 = number_value2;
						if(SeafoodIndex2 == 0 || SeafoodIndex2 == 1 || SeafoodIndex2 == 2 || SeafoodIndex2 == 3 || SeafoodIndex2 == 4 || SeafoodIndex2 == 5 || SeafoodIndex2 == 6 || SeafoodIndex2 == 7 || SeafoodIndex2 == 8 || SeafoodIndex2 == 9 || SeafoodIndex2 == 10 || SeafoodIndex2 == 11){
							updateView(SeafoodIndex2);
						}
					}
					
					if(title1.equals("피시 & 칩스")){
						Korean_OrderDetail.seafood_num_data3 = number_value2;
						if(SeafoodIndex3 == 0 || SeafoodIndex3 == 1 || SeafoodIndex3 == 2 || SeafoodIndex3 == 3 || SeafoodIndex3 == 4 || SeafoodIndex3 == 5 || SeafoodIndex3 == 6 || SeafoodIndex3 == 7 || SeafoodIndex3 == 8 || SeafoodIndex3 == 9 || SeafoodIndex3 == 10 || SeafoodIndex3 == 11 || SeafoodIndex3 == 12){
							updateView(SeafoodIndex3);
						}
					}

				Toast.makeText(getContext(), ""+number_value2+"개"+price2+"원",
						Toast.LENGTH_SHORT).show();
			}
		});
		
		
		return view2;
	}
	
	private void updateView(int index){
	    View v = Korean_OrderDetail.sidemenu_mListView2.getChildAt(index - 
	    		Korean_OrderDetail.sidemenu_mListView2.getFirstVisiblePosition());
	
	    if(v == null)
	       return;

	    TextView modify_number_vaule = (TextView) v.findViewById(R.id.number_tv2);
	    TextView modify_price_value = (TextView) v.findViewById(R.id.price_tv3);
	    modify_number_vaule.setText(" 갯수 : " + number_value2);
	    modify_price_value.setText(" 가격 : " + price2);
		
	    Korean_Fragment_Appetizer.appetizer_final_total =  Korean_Fragment_Appetizer.appetizer_total1
				+ Korean_Fragment_Appetizer.appetizer_total2
				+ Korean_Fragment_Appetizer.appetizer_total3
				+ Korean_Fragment_Appetizer.appetizer_total4;

	    Korean_Fragment_Salad.salad_final_total =  Korean_Fragment_Salad.salad_total1
				+ Korean_Fragment_Salad.salad_total2
				+ Korean_Fragment_Salad.salad_total3
				+ Korean_Fragment_Salad.salad_total4;
	    
	    Korean_Fragment_Seafood.seafood_final_total =  Korean_Fragment_Seafood.seafood_total1
				+ Korean_Fragment_Seafood.seafood_total2
				+ Korean_Fragment_Seafood.seafood_total3;
	    
		Korean_Fragment_Appetizer.appetizer_final_total += cal_price_appetizer;
		Korean_Fragment_Salad.salad_final_total += cal_price_salad;
		Korean_Fragment_Seafood.seafood_final_total += cal_price_seafood;
		
		
		Korean_OrderDetail.appetizer_save_price.setText(""+Korean_Fragment_Appetizer.appetizer_final_total);
		Korean_OrderDetail.salad_save_price.setText(""+Korean_Fragment_Salad.salad_final_total);
		Korean_OrderDetail.seafood_save_price.setText(""+Korean_Fragment_Seafood.seafood_final_total);
		
		
		Korean_OrderDetail.final_tval_data = (Korean_Fragment_Steak.steak_final_total + Korean_Fragment_Appetizer.appetizer_final_total + Korean_Fragment_Pasta.pasta_final_total + Korean_Fragment_Salad.salad_final_total + Korean_Fragment_Seafood.seafood_final_total);

		Korean_OrderDetail.final_total_save_price.setText(""+Korean_OrderDetail.final_tval_data);
	}
}