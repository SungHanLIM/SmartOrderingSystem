package com.example.test2;

import java.util.ArrayList;
import java.util.Enumeration;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DataAdapter3 extends ArrayAdapter<CData_SecParse_Mdish> {
	private LayoutInflater mInflater2;
	
	int modified_value;
	int modified_value2;
	
	static public int number_value2;
	static public int number_value4;
	
	int price2;
	int cal_price = 0;
	int cal_price_pasta = 0;
	int cal_price_appetizer = 0;
	
	String price1;
	String sidedish_price;
	
	String number_value;
	String side_number_value;
	String sidedish_index;
	
	static public String title1;
	static public String side_dish_title;
	int last_value;
	int my_j;
	String index1;
	int index2;
	int my_size;
	String steak1_title;
	String steak1_index_test1;	
	
	TextView title;
	TextView number;
	TextView price;
	ImageView img;
	
	Button second_parse_minusbutton;
	Button second_parse_plusbutton;
	
	int steakIndex1;
	int steakIndex2;
	int steakIndex3;
	int steakIndex4;
	
	int pastaIndex1;
	int pastaIndex2;
	int pastaIndex3;
	int pastaIndex4;
	int pastaIndex5;
	
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
	
	
	static CData_SecParse_Mdish data2;
	String number_st_value2;
	String price2_st;
	
	String tPrice3;
	static public int price3;
	
	
	static public int my_arryIndex[] = new int[20];
	private static final String TAG = null;
	

	static public int mainDish_arrayIndex2[] = new int[20];

	public DataAdapter3(Context context, ArrayList<CData_SecParse_Mdish> object) {
		super(context, 0, object);

		mInflater2 = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		for (int num1 = 0; num1 < 20; num1++) {
			mainDish_arrayIndex2[num1] = -1;
		}
	}

	@Override
	public View getView(int position, final View v, ViewGroup parent) {
		View view2 = null;

		if (v == null) {
			view2 = mInflater2.inflate(R.layout.custom_view, null);
		} else {
			view2 = v;
		}
		
		for (int num1 = 0; num1 < 20; num1++) {
			my_arryIndex[num1] = -1;
		}
		
		data2 = this.getItem(position);

		if (data2 != null) {

			title = (TextView) view2.findViewById(R.id.title_tv1);
			number = (TextView) view2.findViewById(R.id.number_tv2);
			price = (TextView) view2.findViewById(R.id.price_tv3);
			img = (ImageView) view2.findViewById(R.id.img);

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
			// 여기서 메인메뉴 사이드 리스트뷰로 나타난 아이템목록을 터치시 
			// 수량과 가격을 받아와서 int형으로 파싱합니다.
			
			
			Korean_OrderDetail.mainmenu_mListView1
					.setOnItemClickListener(new OnItemClickListener() {
						@Override
						public void onItemClick(final AdapterView<?> arg0,
								View arg1, int arg2, long arg3) {
							CData_SecParse_Mdish data = (CData_SecParse_Mdish) arg0.getAdapter().getItem(arg2);

							title1 = data.getTitle();
							number_value = data.getNumber();
							price1 = data.getPrice();
							index1 = data.getIndex();

							index2 = Integer.parseInt(index1); // 인티저 바꾸고
							

							Log.e(TAG,"가져올 스테이크 텍스트:"+title1);
							steak1_title = title1;
//							Log.e(TAG,"스테이크는?"+steak1_index);
////							// 0  == "머쉬룸 서로인 스테이크 포 유"
//							if(steak1_index.equals("머쉬룸 서로인 스테이크 포 유")){
//								steak1_index_test1 = steak1_index;
//							}
//							Log.e(TAG,"받아온 스테이크는?"+steak1_index_test1);
							
							Enumeration en = Korean_OrderDetail.ht.keys();
							
							try{
								steakIndex1 = Korean_OrderDetail.ht.get("steak_save_index1");
							}catch(Exception e){
								e.printStackTrace();
							}
							
							try{
								steakIndex2 = Korean_OrderDetail.ht.get("steak_save_index2");
							}catch(Exception e){
								e.printStackTrace();
							}
							
							try{
								steakIndex3 = Korean_OrderDetail.ht.get("steak_save_index3");
							}catch(Exception e){
								e.printStackTrace();
							}
							
							try{
								steakIndex4 = Korean_OrderDetail.ht.get("steak_save_index4");
							}catch(Exception e){
								e.printStackTrace();
							}
							
							try{
								pastaIndex1 = Korean_OrderDetail.ht.get("pasta_save_index1");
							}catch(Exception e){
								e.printStackTrace();
							}
							
							try{
								pastaIndex2 = Korean_OrderDetail.ht.get("pasta_save_index2");
							}catch(Exception e){
								e.printStackTrace();
							}
							
							try{
								pastaIndex3 = Korean_OrderDetail.ht.get("pasta_save_index3");
							}catch(Exception e){
								e.printStackTrace();
							}
							
							try{
								pastaIndex4 = Korean_OrderDetail.ht.get("pasta_save_index4");
							}catch(Exception e){
								e.printStackTrace();
							}
							
							try{
								pastaIndex5 = Korean_OrderDetail.ht.get("pasta_save_index5");
							}catch(Exception e){
								e.printStackTrace();
							}
			
							
							Log.d(TAG,"steak_save_index1= " +steakIndex1);
							Log.d(TAG,"steak_save_index2= " +steakIndex2);
							Log.d(TAG,"steak_save_index3= " +steakIndex3);
							Log.d(TAG,"steak_save_index4= " +Korean_OrderDetail.ht.get("steak_save_index4"));
							
							Log.d(TAG,"pasta_save_index1= " +pastaIndex1);
							Log.d(TAG,"pasta_save_index2= " +pastaIndex2);
							Log.d(TAG,"pasta_save_index3= " +Korean_OrderDetail.ht.get("pasta_save_index3"));
							Log.d(TAG,"pasta_save_index4= " +Korean_OrderDetail.ht.get("pasta_save_index4"));
							Log.d(TAG,"pasta_save_index5= " +Korean_OrderDetail.ht.get("pasta_save_index5"));
							
							
							while(en.hasMoreElements())
							{
								String key = en.nextElement().toString();
								/*
								Toast.makeText(getContext(), ""+Korean_OrderDetail.ht.get(key),
										Toast.LENGTH_SHORT).show();
								*/
								Log.d(TAG,"out = " +Korean_OrderDetail.ht.get(key));	
							}
							
							
							
							my_size = Korean_OrderDetail.alist3.size();
							
							number_value2 = Integer.parseInt(number_value);
							price2 = Integer.parseInt(price1);
							modified_value = (price2 / number_value2);
							
							// 더하기
							
							price3 = price2 + modified_value;
							tPrice3 = Integer.toString(price3);
							
							tPrice3 = data.getPrice();

							
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
						
						if(title1.equals("머쉬룸 서로인 스테이크 포 유")||title1.equals("갈릭 립아이")||title1.equals("휠렛 오스카 스타일")||title1.equals("우드 화이어 그릴 스테이크 오 포와")){
						cal_price = cal_price-modified_value;
						}
						if(title1.equals("스파이시 치킨 & 쉬림프 스파게티")||title1.equals("투움바 파스타")||title1.equals("바질 페스토 올리브 파스타")||title1.equals("씨푸드 뽀모도로")||title1.equals("치킨 까르보나라")){
						cal_price_pasta = cal_price_pasta-modified_value;	
						}
						
						if(title1.equals("스파이시 비프 퀘사디아")||title1.equals("골드 코스트 코코넛 쉬림프")||title1.equals("오지 치즈 후라이즈")||title1.equals("그릴드 쿠카부라 윙")||title1.equals("레인지랜드 립레츠")||title1.equals("기브미 파이브")){
						cal_price_appetizer = cal_price_appetizer-modified_value;
						Log.e(TAG,"스파이시 선택");
						}
						Log.e(TAG,"cal_price_appetizer 값" + cal_price_appetizer);
						
						Log.e(TAG,"cal_price 값" + cal_price);
						Log.e(TAG,"cal_price 값" + cal_price_pasta);
						number_value2--;
					}		
					
						if(title1.equals("머쉬룸 서로인 스테이크 포 유")){ //0
							Korean_OrderDetail.steak_num_data1 = number_value2;
							if(steakIndex1 == 0){
								//Log.e(TAG, "cal_price값:  "+cal_price);
								updateView(steakIndex1);	
							}
						}
						if(title1.equals("갈릭 립아이")){ // 1,      0번째 가능 1번째 가능
							Korean_OrderDetail.steak_num_data2 = number_value2;
							if(steakIndex2 == 0 || steakIndex2 == 1){
								updateView(steakIndex2);
							}
						}
						
						if(title1.equals("휠렛 오스카 스타일")){ // 2    0번째 1번째 2번째 가능
							Korean_OrderDetail.steak_num_data3 = number_value2;
							if(steakIndex3 == 0 || steakIndex3 == 1 || steakIndex3 == 2){
							updateView(steakIndex3);
							}
						}
						
						if(title1.equals("우드 화이어 그릴 스테이크 오 포와")){ // 3 0번째 1번째 2번째 3번째
							Korean_OrderDetail.steak_num_data4 = number_value2;
							if(steakIndex4 == 0 || steakIndex4 == 1 || steakIndex4 == 2 || steakIndex4 == 3){
								updateView(steakIndex4);
							}
						}
						
						if(title1.equals("스파이시 치킨 & 쉬림프 스파게티")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data1 = number_value2;
							if(pastaIndex1 == 0 || pastaIndex1 == 1 || pastaIndex1 == 2 || pastaIndex1 == 3 || pastaIndex1 == 4){
								Log.e(TAG,"스파이시 치킨완료"+pastaIndex1);
								updateView(pastaIndex1);
							}
						}
						
						if(title1.equals("투움바 파스타")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data2 = number_value2;
							if(pastaIndex2 == 0 || pastaIndex2 == 1 || pastaIndex2 == 2 || pastaIndex2 == 3 || pastaIndex2 == 4 || pastaIndex2 == 5){
								updateView(pastaIndex2);
							}
						}
						
						if(title1.equals("바질 페스토 올리브 파스타")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data3 = number_value2;
							if(pastaIndex3 == 0 || pastaIndex3 == 1 || pastaIndex3 == 2 || pastaIndex3 == 3 || pastaIndex3 == 4 || pastaIndex3 == 5 || pastaIndex3 == 6){
								updateView(pastaIndex3);
							}
						}
						
						if(title1.equals("씨푸드 뽀모도로")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data4 = number_value2;
							if(pastaIndex4 == 0 || pastaIndex4 == 1 || pastaIndex4 == 2 || pastaIndex4 == 3 || pastaIndex4 == 4 || pastaIndex4 == 5 || pastaIndex4 == 6 || pastaIndex4 == 7){
								updateView(pastaIndex4);
							}
						}
						
						if(title1.equals("치킨 까르보나라")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data5 = number_value2;
							if(pastaIndex5 == 0 || pastaIndex5 == 1 || pastaIndex5 == 2 || pastaIndex5 == 3 || pastaIndex5 == 4 || pastaIndex5 == 5 || pastaIndex5 == 6 || pastaIndex5 == 7 || pastaIndex5 == 8){
								updateView(pastaIndex5);
							}
						}
						Toast.makeText(getContext(), ""+number_value2+"개"+price2+"원",
								Toast.LENGTH_SHORT).show();
											
				}
			});
			
			second_parse_plusbutton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					
					price2 = price2 + modified_value; // 총액에서 한개가격을 빼준 나머지 
				

					if(title1.equals("머쉬룸 서로인 스테이크 포 유")||title1.equals("갈릭 립아이")||title1.equals("휠렛 오스카 스타일")||title1.equals("우드 화이어 그릴 스테이크 오 포와")){
					cal_price = cal_price+modified_value;
					}
					if(title1.equals("스파이시 치킨 & 쉬림프 스파게티")||title1.equals("투움바 파스타")||title1.equals("바질 페스토 올리브 파스타")||title1.equals("씨푸드 뽀모도로")||title1.equals("치킨 까르보나라")){
					cal_price_pasta = cal_price_pasta+modified_value;	
					}

					if(title1.equals("스파이시 비프 퀘사디아")||title1.equals("골드 코스트 코코넛 쉬림프")||title1.equals("오지 치즈 후라이즈")||title1.equals("그릴드 쿠카부라 윙")||title1.equals("레인지랜드 립레츠")||title1.equals("기브미 파이브")){
					cal_price_appetizer = cal_price_appetizer-modified_value;
					}
					
					Log.e(TAG,"메뉴 한개의 값  "+ modified_value);
					Log.e(TAG,"변경된 메뉴 값  "+ price2);
					
					Log.e(TAG,"cal_price 값" + cal_price);
					Log.e(TAG,"cal_price_pasta 값" + cal_price_pasta);
					Log.e(TAG,"cal_price_appetizer 값  "+ cal_price_appetizer);
					
					
					number_value2++;
					
//						// 몇번째 칸이 눌렸는지 			
						if(title1.equals("머쉬룸 서로인 스테이크 포 유")){ //0
							Korean_OrderDetail.steak_num_data1 = number_value2;
							if(steakIndex1 == 0){
								//Log.e(TAG, "cal_price값:  "+cal_price);
								updateView(steakIndex1);
							}
						}
						if(title1.equals("갈릭 립아이")){ // 1,      0번째 가능 1번째 가능
							Korean_OrderDetail.steak_num_data2 = number_value2;
							if(steakIndex2 == 0 || steakIndex2 == 1){
								updateView(steakIndex2);
							}
						}
						
						if(title1.equals("휠렛 오스카 스타일")){ // 2    0번째 1번째 2번째 가능
							Korean_OrderDetail.steak_num_data3 = number_value2;
							if(steakIndex3 == 0 || steakIndex3 == 1 || steakIndex3 == 2){
							updateView(steakIndex3);
							}
						}
						
						if(title1.equals("우드 화이어 그릴 스테이크 오 포와")){ // 3 0번째 1번째 2번째 3번째
							Korean_OrderDetail.steak_num_data4 = number_value2;
							if(steakIndex4 == 0 || steakIndex4 == 1 || steakIndex4 == 2 || steakIndex4 == 3){
								updateView(steakIndex4);
								}
						}
						
						if(title1.equals("스파이시 치킨 & 쉬림프 스파게티")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data1 = number_value2;
							if(pastaIndex1 == 0 || pastaIndex1 == 1 || pastaIndex1 == 2 || pastaIndex1 == 3 || pastaIndex1 == 4){
								updateView(pastaIndex1);
							}
						}
						
						if(title1.equals("투움바 파스타")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data2 = number_value2;
							if(pastaIndex2 == 0 || pastaIndex2 == 1 || pastaIndex2 == 2 || pastaIndex2 == 3 || pastaIndex2 == 4 || pastaIndex2 == 5){
								updateView(pastaIndex2);
							}
						}
						
						if(title1.equals("바질 페스토 올리브 파스타")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data3 = number_value2;
							if(pastaIndex3 == 0 || pastaIndex3 == 1 || pastaIndex3 == 2 || pastaIndex3 == 3 || pastaIndex3 == 4 || pastaIndex3 == 5 || pastaIndex3 == 6){
								updateView(pastaIndex3);
							}
						}
						
						if(title1.equals("씨푸드 뽀모도로")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data4 = number_value2;
							if(pastaIndex4 == 0 || pastaIndex4 == 1 || pastaIndex4 == 2 || pastaIndex4 == 3 || pastaIndex4 == 4 || pastaIndex4 == 5 || pastaIndex4 == 6 || pastaIndex4 == 7){
								updateView(pastaIndex4);
							}
						}
						
						if(title1.equals("치킨 까르보나라")){ // 3 0번째 1번째 2번째 3번째 4번째
							Korean_OrderDetail.pasta_num_data5 = number_value2;
							if(pastaIndex5 == 0 || pastaIndex5 == 1 || pastaIndex5 == 2 || pastaIndex5 == 3 || pastaIndex5 == 4 || pastaIndex5 == 5 || pastaIndex5 == 6 || pastaIndex5 == 7 || pastaIndex5 == 8){
								updateView(pastaIndex5);
							}
						}

					Toast.makeText(getContext(), ""+number_value2+"개"+price2+"원",
							Toast.LENGTH_SHORT).show();
				}
			});
			
		return view2;
	}

	private void updateView(int index){
	    View v = Korean_OrderDetail.mainmenu_mListView1.getChildAt(index - 
	    		Korean_OrderDetail.mainmenu_mListView1.getFirstVisiblePosition());
	
	    if(v == null)
	       return;

	    TextView modify_number_vaule = (TextView) v.findViewById(R.id.number_tv2);
	    TextView modify_price_value = (TextView) v.findViewById(R.id.price_tv3);
	    modify_number_vaule.setText(" 갯수 : " + number_value2);
	    modify_price_value.setText(" 가격 : " + price2);
	    
		Korean_Fragment_Steak.steak_final_total =  Korean_Fragment_Steak.steak_total1
				+ Korean_Fragment_Steak.steak_total2
				+ Korean_Fragment_Steak.steak_total3
				+ Korean_Fragment_Steak.steak_total4;
		
		Korean_Fragment_Steak.steak_final_total += cal_price;
				
		// 63500 원 나왔는데 왜 더해?
		// 
		
		Korean_Fragment_Pasta.pasta_final_total =  Korean_Fragment_Pasta.pasta_total1
				+ Korean_Fragment_Pasta.pasta_total2
				+ Korean_Fragment_Pasta.pasta_total3
				+ Korean_Fragment_Pasta.pasta_total4;
		
		Korean_Fragment_Pasta.pasta_final_total += cal_price_pasta;
		
	    
//		Korean_Fragment_Appetizer.appetizer_final_total =  Korean_Fragment_Appetizer.appetizer_total1
//				+ Korean_Fragment_Appetizer.appetizer_total2
//				+ Korean_Fragment_Appetizer.appetizer_total3
//				+ Korean_Fragment_Appetizer.appetizer_total4;
//
//		Korean_Fragment_Appetizer.appetizer_final_total += cal_price_appetizer;
//		
		
		Korean_OrderDetail.steak_save_price.setText(""+Korean_Fragment_Steak.steak_final_total);
		Korean_OrderDetail.pasta_save_price.setText(""+Korean_Fragment_Pasta.pasta_final_total);
		Korean_OrderDetail.appetizer_save_price.setText(""+Korean_Fragment_Appetizer.appetizer_final_total);
		
		Korean_OrderDetail.final_tval_data = (Korean_Fragment_Steak.steak_final_total + Korean_Fragment_Appetizer.appetizer_final_total + Korean_Fragment_Pasta.pasta_final_total + Korean_Fragment_Salad.salad_final_total + Korean_Fragment_Seafood.seafood_final_total);

		Korean_OrderDetail.final_total_save_price.setText(""+Korean_OrderDetail.final_tval_data);
	    
	}
	    //modify_number_tv2.setText(" 갯수 : " + number_value2); // 어디위치에 number_value2 값을 바꿔야함.
	    
	    /*
	   // 아예 업데이트를 시켜버리자
	   
	   number_st_value2 = Integer.toString(number_value2);
	   price2_st = Integer.toString(price2);
	   
		try {
			if (mainDish_arrayIndex2[0] != -1)
				Korean_OrderDetail.alist3.remove(mainDish_arrayIndex2[0]);
		} catch (Exception e) {
		}
		mainDish_arrayIndex2[0] = Korean_Activity.alist.size();
		
	   Korean_OrderDetail.adapter3.add(new CData_SecParse_Mdish(getContext(),Korean_OrderDetail.steak_name_data1,number_st_value2, price2_st, R.drawable.steak1,Korean_OrderDetail.index_count1));
		if (Korean_Fragment_Steak.steak_count_value1 == 0) {
			mainDish_arrayIndex2[0] = -1;
		}
	}
	*/
	private void updateView2(int index){
	    View v = Korean_OrderDetail.mainmenu_mListView1.getChildAt(index - 
	    		Korean_OrderDetail.mainmenu_mListView1.getFirstVisiblePosition());
	
	    if(v == null)
	       return;
	    
		   number_st_value2 = Integer.toString(number_value2);
		   price2_st = Integer.toString(price2);
		   
		   Korean_OrderDetail.adapter3.add(new CData_SecParse_Mdish(getContext(),Korean_OrderDetail.steak_name_data2,number_st_value2, price2_st, R.drawable.steak2,Korean_OrderDetail.index_count1));	

	}
	
	
	
}
