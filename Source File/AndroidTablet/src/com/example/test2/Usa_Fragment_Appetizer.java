package com.example.test2;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class Usa_Fragment_Appetizer extends Fragment  {

	static public int appetizer_numInt1;
	static public int appetizer_numInt2;
	static public int appetizer_numInt3;
	static public int appetizer_numInt4;
	static public int appetizer_numInt5;
	static public int appetizer_numInt6;
	
	static public int appetizer_total1;
	static public int appetizer_total2;
	static public int appetizer_total3;
	static public int appetizer_total4;
	static public int appetizer_total5;
	static public int appetizer_total6;
	static public int appetizer_final_total;
	
	static public String appetizer1_name="스파이시 비프 퀘사디아";
	static public String appetizer2_name="골드 코스트 코코넛 쉬림프";
	static public String appetizer3_name="오지 치즈 후라이즈";
	static public String appetizer4_name="그릴드 쿠카부라 윙";
	static public String appetizer5_name="레인지랜드 립레츠";
	static public String appetizer6_name="기브미 파이브";
	
	Button appetizer_minus_button1;
	Button appetizer_plus_button1;
	TextView appetizer_count_text1;
	
	Button appetizer_minus_button2;
	Button appetizer_plus_button2;
	TextView appetizer_count_text2;
	
	Button appetizer_minus_button3;
	Button appetizer_plus_button3;
	TextView appetizer_count_text3;
	
	Button appetizer_minus_button4;
	Button appetizer_plus_button4;
	TextView appetizer_count_text4;
	
	Button appetizer_minus_button5;
	Button appetizer_plus_button5;
	TextView appetizer_count_text5;
	
	Button appetizer_minus_button6;
	Button appetizer_plus_button6;
	TextView appetizer_count_text6;
	
	int appetizer_count_value1 = 0;
	int appetizer_count_value2 = 0;
	int appetizer_count_value3 = 0;
	int appetizer_count_value4 = 0;
	int appetizer_count_value5 = 0;
	int appetizer_count_value6 = 0;
	
	static public int sideDish_arrayIndex[] = new int[20];

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.usa_fragment_appetizer,container, false);
		
		   //Button button = (Button) view.findViewById(R.id.popup_button1);
		   
		ImageView appetizer_image1 = (ImageView) view.findViewById(R.id.appetizer_image1);
		ImageView appetizer_image2 = (ImageView) view.findViewById(R.id.appetizer_image2);
		ImageView appetizer_image3 = (ImageView) view.findViewById(R.id.appetizer_image3);
		ImageView appetizer_image4 = (ImageView) view.findViewById(R.id.appetizer_image4);
		ImageView appetizer_image5 = (ImageView) view.findViewById(R.id.appetizer_image5);
		ImageView appetizer_image6 = (ImageView) view.findViewById(R.id.appetizer_image6);
		
		ScrollView appetizer_contents_popup1 = (ScrollView) view.findViewById(R.id.appetizer_contents_popup1);
		ScrollView appetizer_contents_popup2 = (ScrollView) view.findViewById(R.id.appetizer_contents_popup2);
		ScrollView appetizer_contents_popup3 = (ScrollView) view.findViewById(R.id.appetizer_contents_popup3);
		ScrollView appetizer_contents_popup4 = (ScrollView) view.findViewById(R.id.appetizer_contents_popup4);
		ScrollView appetizer_contents_popup5 = (ScrollView) view.findViewById(R.id.appetizer_contents_popup5);
		ScrollView appetizer_contents_popup6 = (ScrollView) view.findViewById(R.id.appetizer_contents_popup6);
		
		
		final View layout = inflater.inflate(R.layout.appetizer1_contents,(ViewGroup) appetizer_contents_popup1);
		final View layout2 = inflater.inflate(R.layout.appetizer2_contents,(ViewGroup) appetizer_contents_popup2);
		final View layout3 = inflater.inflate(R.layout.appetizer3_contents,(ViewGroup) appetizer_contents_popup3);
		final View layout4 = inflater.inflate(R.layout.appetizer4_contents,(ViewGroup) appetizer_contents_popup4);
		final View layout5 = inflater.inflate(R.layout.appetizer5_contents,(ViewGroup) appetizer_contents_popup5);
		final View layout6 = inflater.inflate(R.layout.appetizer6_contents,(ViewGroup) appetizer_contents_popup6);
		
		
		appetizer_minus_button1 = (Button) view.findViewById(R.id.appetizer_minus_button1);
		appetizer_plus_button1 = (Button) view.findViewById(R.id.appetizer_plus_button1);
		appetizer_count_text1 =  (TextView) view.findViewById(R.id.appetizer_count_text1);
		
		appetizer_minus_button2 = (Button) view.findViewById(R.id.appetizer_minus_button2);
		appetizer_plus_button2 = (Button) view.findViewById(R.id.appetizer_plus_button2);
		appetizer_count_text2 =  (TextView) view.findViewById(R.id.appetizer_count_text2);
		
		appetizer_minus_button3 = (Button) view.findViewById(R.id.appetizer_minus_button3);
		appetizer_plus_button3 = (Button) view.findViewById(R.id.appetizer_plus_button3);
		appetizer_count_text3 =  (TextView) view.findViewById(R.id.appetizer_count_text3);

		appetizer_minus_button4 = (Button) view.findViewById(R.id.appetizer_minus_button4);
		appetizer_plus_button4 = (Button) view.findViewById(R.id.appetizer_plus_button4);
		appetizer_count_text4 =  (TextView) view.findViewById(R.id.appetizer_count_text4);
		
		appetizer_minus_button5 = (Button) view.findViewById(R.id.appetizer_minus_button5);
		appetizer_plus_button5 = (Button) view.findViewById(R.id.appetizer_plus_button5);
		appetizer_count_text5 =  (TextView) view.findViewById(R.id.appetizer_count_text5);
		
		appetizer_minus_button6 = (Button) view.findViewById(R.id.appetizer_minus_button6);
		appetizer_plus_button6 = (Button) view.findViewById(R.id.appetizer_plus_button6);
		appetizer_count_text6 =  (TextView) view.findViewById(R.id.appetizer_count_text6);
		
		appetizer_count_text1.setText(""+appetizer_count_value1);
		appetizer_count_text2.setText(""+appetizer_count_value2);
		appetizer_count_text3.setText(""+appetizer_count_value3);
		appetizer_count_text4.setText(""+appetizer_count_value4);
		appetizer_count_text5.setText(""+appetizer_count_value5);
		appetizer_count_text6.setText(""+appetizer_count_value6);

		
		// steak_spinner1.setadapter2(new
		// Arrayadapter2<String>(getActivity().getApplicationContext(),
		// android.R.layout.simple_spinner_item , items));

		// 여기 문제 이라는 것이 검증됨.
		
		for (int num1 = 0; num1 < 20; num1++) {
			sideDish_arrayIndex[num1] = -1;
		}

	
		appetizer_minus_button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				
				if(appetizer_count_value1 != 0)
				{
					appetizer_count_value1--;
					appetizer_count_text1.setText(""+appetizer_count_value1);
					Usa_Fragment_Appetizer.appetizer_numInt1 = appetizer_count_value1;
					Usa_Fragment_Appetizer.appetizer_total1 = (16900 * Usa_Fragment_Appetizer.appetizer_numInt1);
					Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
							+ Usa_Fragment_Appetizer.appetizer_total2
							+ Usa_Fragment_Appetizer.appetizer_total3
							+ Usa_Fragment_Appetizer.appetizer_total4
							+ Usa_Fragment_Appetizer.appetizer_total5
							+ Usa_Fragment_Appetizer.appetizer_total6;
					
					try {
						if (sideDish_arrayIndex[0] != -1)
							Korean_Activity.alist2.remove(sideDish_arrayIndex[0]);
					} catch (Exception e) {
					}
					sideDish_arrayIndex[0] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Appetizer.appetizer1_name,
							Usa_Fragment_Appetizer.appetizer_numInt1,
							Usa_Fragment_Appetizer.appetizer_total1));
					if (appetizer_count_value1 == 0) {
						sideDish_arrayIndex[0] = -1;
					}
				}
			}
		});

		appetizer_plus_button1.setOnClickListener(new OnClickListener(){

			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				appetizer_count_value1++;
				appetizer_count_text1.setText(""+appetizer_count_value1);
				Usa_Fragment_Appetizer.appetizer_numInt1 = appetizer_count_value1;
				Usa_Fragment_Appetizer.appetizer_total1 = (16900 * Usa_Fragment_Appetizer.appetizer_numInt1);
				Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
						+ Usa_Fragment_Appetizer.appetizer_total2
						+ Usa_Fragment_Appetizer.appetizer_total3
						+ Usa_Fragment_Appetizer.appetizer_total4
						+ Usa_Fragment_Appetizer.appetizer_total5
						+ Usa_Fragment_Appetizer.appetizer_total6;
				
				
				if (appetizer_count_value1 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(sideDish_arrayIndex[0]);
					} catch (Exception e) {
					}
				sideDish_arrayIndex[0] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Appetizer.appetizer1_name,
						Usa_Fragment_Appetizer.appetizer_numInt1,
						Usa_Fragment_Appetizer.appetizer_total1));
			}
		});
		
		
		appetizer_minus_button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(appetizer_count_value2 != 0)
				{
					appetizer_count_value2--;
					appetizer_count_text2.setText(""+appetizer_count_value2);
					Usa_Fragment_Appetizer.appetizer_numInt2 = appetizer_count_value2;
					Usa_Fragment_Appetizer.appetizer_total2 = (17900 * Usa_Fragment_Appetizer.appetizer_numInt2);
					Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
							+ Usa_Fragment_Appetizer.appetizer_total2
							+ Usa_Fragment_Appetizer.appetizer_total3
							+ Usa_Fragment_Appetizer.appetizer_total4
							+ Usa_Fragment_Appetizer.appetizer_total5
							+ Usa_Fragment_Appetizer.appetizer_total6;

					try {
						if (sideDish_arrayIndex[1] != -1)
							Korean_Activity.alist2.remove(sideDish_arrayIndex[1]);
					} catch (Exception e) {
					}
					sideDish_arrayIndex[1] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Appetizer.appetizer2_name,
							Usa_Fragment_Appetizer.appetizer_numInt2,
							Usa_Fragment_Appetizer.appetizer_total2));
					if (appetizer_count_value2 == 0) {
						sideDish_arrayIndex[1] = -1;
					}
				
				}
			}
		});

		appetizer_plus_button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				appetizer_count_value2++;
				appetizer_count_text2.setText(""+appetizer_count_value2);
				Usa_Fragment_Appetizer.appetizer_numInt2 = appetizer_count_value2;
				Usa_Fragment_Appetizer.appetizer_total2 = (17900 * Usa_Fragment_Appetizer.appetizer_numInt2);
				Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
						+ Usa_Fragment_Appetizer.appetizer_total2
						+ Usa_Fragment_Appetizer.appetizer_total3
						+ Usa_Fragment_Appetizer.appetizer_total4
						+ Usa_Fragment_Appetizer.appetizer_total5
						+ Usa_Fragment_Appetizer.appetizer_total6;
				
				if (appetizer_count_value2 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(sideDish_arrayIndex[1]);
					} catch (Exception e) {
					}
				sideDish_arrayIndex[1] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Appetizer.appetizer2_name,
						Usa_Fragment_Appetizer.appetizer_numInt2,
						Usa_Fragment_Appetizer.appetizer_total2));
			}
		});
		

		appetizer_minus_button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(appetizer_count_value3 != 0)
				{
					appetizer_count_value3--;
					appetizer_count_text3.setText(""+appetizer_count_value3);
					Usa_Fragment_Appetizer.appetizer_numInt3 = appetizer_count_value3;
					Usa_Fragment_Appetizer.appetizer_total3 = (18900 * Usa_Fragment_Appetizer.appetizer_numInt3);
					Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
							+ Usa_Fragment_Appetizer.appetizer_total2
							+ Usa_Fragment_Appetizer.appetizer_total3
							+ Usa_Fragment_Appetizer.appetizer_total4
							+ Usa_Fragment_Appetizer.appetizer_total5
							+ Usa_Fragment_Appetizer.appetizer_total6;
					
					try {
						if (sideDish_arrayIndex[2] != -1)
							Korean_Activity.alist2.remove(sideDish_arrayIndex[2]);
					} catch (Exception e) {
					}
					sideDish_arrayIndex[2] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Appetizer.appetizer3_name,
							Usa_Fragment_Appetizer.appetizer_numInt3,
							Usa_Fragment_Appetizer.appetizer_total3));
					if (appetizer_count_value3 == 0) {
						sideDish_arrayIndex[2] = -1;
					}
				}
			}
		});

		appetizer_plus_button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				appetizer_count_value3++;
				appetizer_count_text3.setText(""+appetizer_count_value3);
				Usa_Fragment_Appetizer.appetizer_numInt3 = appetizer_count_value3;
				Usa_Fragment_Appetizer.appetizer_total3 = (18900 * Usa_Fragment_Appetizer.appetizer_numInt3);
				Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
						+ Usa_Fragment_Appetizer.appetizer_total2
						+ Usa_Fragment_Appetizer.appetizer_total3
						+ Usa_Fragment_Appetizer.appetizer_total4
						+ Usa_Fragment_Appetizer.appetizer_total5
						+ Usa_Fragment_Appetizer.appetizer_total6;
				
				if (appetizer_count_value3 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(sideDish_arrayIndex[2]);
					} catch (Exception e) {
					}
				sideDish_arrayIndex[2] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Appetizer.appetizer3_name,
						Usa_Fragment_Appetizer.appetizer_numInt3,
						Usa_Fragment_Appetizer.appetizer_total3));
			}
		});
		
		appetizer_minus_button4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(appetizer_count_value4 != 0)
				{
					appetizer_count_value4--;
					appetizer_count_text4.setText(""+appetizer_count_value4);
					Usa_Fragment_Appetizer.appetizer_numInt4 = appetizer_count_value4;
					Usa_Fragment_Appetizer.appetizer_total4 = (15900 * Usa_Fragment_Appetizer.appetizer_numInt4);
					Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
							+ Usa_Fragment_Appetizer.appetizer_total2
							+ Usa_Fragment_Appetizer.appetizer_total3
							+ Usa_Fragment_Appetizer.appetizer_total4
							+ Usa_Fragment_Appetizer.appetizer_total5
							+ Usa_Fragment_Appetizer.appetizer_total6;
			
					try {
						if (sideDish_arrayIndex[3] != -1)
							Korean_Activity.alist2.remove(sideDish_arrayIndex[3]);
					} catch (Exception e) {
					}
					sideDish_arrayIndex[3] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Appetizer.appetizer4_name,
							Usa_Fragment_Appetizer.appetizer_numInt4,
							Usa_Fragment_Appetizer.appetizer_total4));
					if (appetizer_count_value4 == 0) {
						sideDish_arrayIndex[3] = -1;
					}
				
				}
			}
		});

		appetizer_plus_button4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				appetizer_count_value4++;
				appetizer_count_text4.setText(""+appetizer_count_value4);
				Usa_Fragment_Appetizer.appetizer_numInt4 = appetizer_count_value4;
				Usa_Fragment_Appetizer.appetizer_total4 = (15900 * Usa_Fragment_Appetizer.appetizer_numInt4);
				Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
						+ Usa_Fragment_Appetizer.appetizer_total2
						+ Usa_Fragment_Appetizer.appetizer_total3
						+ Usa_Fragment_Appetizer.appetizer_total4
						+ Usa_Fragment_Appetizer.appetizer_total5
						+ Usa_Fragment_Appetizer.appetizer_total6;
				
				if (appetizer_count_value4 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(sideDish_arrayIndex[3]);
					} catch (Exception e) {
					}
				sideDish_arrayIndex[3] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Appetizer.appetizer4_name,
						Usa_Fragment_Appetizer.appetizer_numInt4,
						Usa_Fragment_Appetizer.appetizer_total4));
				
			}
		});

		appetizer_minus_button5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(appetizer_count_value5 != 0)
				{
					appetizer_count_value5--;
					appetizer_count_text5.setText(""+appetizer_count_value5);
					Usa_Fragment_Appetizer.appetizer_numInt5 = appetizer_count_value5;
					Usa_Fragment_Appetizer.appetizer_total5 = (15500 * Usa_Fragment_Appetizer.appetizer_numInt5);
					Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
							+ Usa_Fragment_Appetizer.appetizer_total2
							+ Usa_Fragment_Appetizer.appetizer_total3
							+ Usa_Fragment_Appetizer.appetizer_total4
							+ Usa_Fragment_Appetizer.appetizer_total5
							+ Usa_Fragment_Appetizer.appetizer_total6;
				
					try {
						if (sideDish_arrayIndex[4] != -1)
							Korean_Activity.alist2.remove(sideDish_arrayIndex[4]);
					} catch (Exception e) {
					}
					sideDish_arrayIndex[4] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Appetizer.appetizer5_name,
							Usa_Fragment_Appetizer.appetizer_numInt5,
							Usa_Fragment_Appetizer.appetizer_total5));
					if (appetizer_count_value5 == 0) {
						sideDish_arrayIndex[4] = -1;
					}

					
				}
			}
		});

		appetizer_plus_button5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				appetizer_count_value5++;
				appetizer_count_text5.setText(""+appetizer_count_value5);
				Usa_Fragment_Appetizer.appetizer_numInt5 = appetizer_count_value5;
				Usa_Fragment_Appetizer.appetizer_total5 = (15500 * Usa_Fragment_Appetizer.appetizer_numInt5);
				Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
						+ Usa_Fragment_Appetizer.appetizer_total2
						+ Usa_Fragment_Appetizer.appetizer_total3
						+ Usa_Fragment_Appetizer.appetizer_total4
						+ Usa_Fragment_Appetizer.appetizer_total5
						+ Usa_Fragment_Appetizer.appetizer_total6;
			
				if (appetizer_count_value5 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(sideDish_arrayIndex[4]);
					} catch (Exception e) {
					}
				sideDish_arrayIndex[4] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Appetizer.appetizer5_name,
						Usa_Fragment_Appetizer.appetizer_numInt5,
						Usa_Fragment_Appetizer.appetizer_total5));
			}
		});
		

		appetizer_minus_button6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(appetizer_count_value6 != 0)
				{
					appetizer_count_value6--;
					appetizer_count_text6.setText(""+appetizer_count_value6);
					Usa_Fragment_Appetizer.appetizer_numInt6 = appetizer_count_value6;
					Usa_Fragment_Appetizer.appetizer_total6 = (30900 * Usa_Fragment_Appetizer.appetizer_numInt6);
					Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
							+ Usa_Fragment_Appetizer.appetizer_total2
							+ Usa_Fragment_Appetizer.appetizer_total3
							+ Usa_Fragment_Appetizer.appetizer_total4
							+ Usa_Fragment_Appetizer.appetizer_total5
							+ Usa_Fragment_Appetizer.appetizer_total6;
				
					try {
						if (sideDish_arrayIndex[5] != -1)
							Korean_Activity.alist2.remove(sideDish_arrayIndex[5]);
					} catch (Exception e) {
					}
					sideDish_arrayIndex[5] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Appetizer.appetizer6_name,
							Usa_Fragment_Appetizer.appetizer_numInt6,
							Usa_Fragment_Appetizer.appetizer_total6));
					if (appetizer_count_value6 == 0) {
						sideDish_arrayIndex[5] = -1;
					}	
				}
			}
		});

		appetizer_plus_button6.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				appetizer_count_value6++;
				appetizer_count_text6.setText(""+appetizer_count_value6);
				Usa_Fragment_Appetizer.appetizer_numInt6 = appetizer_count_value6;
				Usa_Fragment_Appetizer.appetizer_total6 = (30900 * Usa_Fragment_Appetizer.appetizer_numInt6);
				Usa_Fragment_Appetizer.appetizer_final_total = Usa_Fragment_Appetizer.appetizer_total1
						+ Usa_Fragment_Appetizer.appetizer_total2
						+ Usa_Fragment_Appetizer.appetizer_total3
						+ Usa_Fragment_Appetizer.appetizer_total4
						+ Usa_Fragment_Appetizer.appetizer_total5
						+ Usa_Fragment_Appetizer.appetizer_total6;
			
				if (appetizer_count_value6 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(sideDish_arrayIndex[5]);
					} catch (Exception e) {
					}
				sideDish_arrayIndex[5] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Appetizer.appetizer6_name,
						Usa_Fragment_Appetizer.appetizer_numInt6,
						Usa_Fragment_Appetizer.appetizer_total6));
			}
		});
		
		
		
		
		appetizer_image1.setOnClickListener(new OnClickListener()
		   {
		         @Override
	             public void onClick(View v)
	             {
	            	//	  Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
	            	 AlertDialog ad = new AlertDialog.Builder(getActivity()).create();
	            	 ad.setTitle("상세정보"); //팝업창 타이틀바
	            	 ad.setView(layout);
	                // ad.setMessage("FinessShot");  //팝업창 내용
	                 ad.setButton(getActivity().getString(R.string.exit_name), new DialogInterface.OnClickListener() {
	                     public void onClick(DialogInterface dlg, int sumthin) {
	                         //닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
	                     	//dlg.dismiss();
	                    	 ((ViewGroup)layout.getParent()).removeView(layout);
	                     }
	                 });
	                 ad.show(); // 팝업창 보여줌
	             }
	   });
		
		appetizer_image2.setOnClickListener(new OnClickListener()
		   {
		         @Override
	             public void onClick(View v)
	             {
	            	//	  Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
	            	 AlertDialog ad = new AlertDialog.Builder(getActivity()).create();
	            	 ad.setTitle("상세정보"); //팝업창 타이틀바
	            	 ad.setView(layout2);
	                // ad.setMessage("FinessShot");  //팝업창 내용
	                 ad.setButton(getActivity().getString(R.string.exit_name), new DialogInterface.OnClickListener() {
	                     public void onClick(DialogInterface dlg, int sumthin) {
	                         //닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
	                     	//dlg.dismiss();
	                    	 ((ViewGroup)layout2.getParent()).removeView(layout2);
	                     }
	                 });
	                 ad.show(); // 팝업창 보여줌
	             }
	   });
		
		appetizer_image3.setOnClickListener(new OnClickListener()
		   {
		         @Override
	             public void onClick(View v)
	             {
	            	//	  Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
	            	 AlertDialog ad = new AlertDialog.Builder(getActivity()).create();
	            	 ad.setTitle("상세정보"); //팝업창 타이틀바
	            	 ad.setView(layout3);
	                // ad.setMessage("FinessShot");  //팝업창 내용
	                 ad.setButton(getActivity().getString(R.string.exit_name), new DialogInterface.OnClickListener() {
	                     public void onClick(DialogInterface dlg, int sumthin) {
	                         //닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
	                     	//dlg.dismiss();
	                    	 ((ViewGroup)layout3.getParent()).removeView(layout3);
	                     }
	                 });
	                 ad.show(); // 팝업창 보여줌
	             }
	   });
		
		appetizer_image4.setOnClickListener(new OnClickListener()
		   {
		         @Override
	             public void onClick(View v)
	             {
	            	//	  Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
	            	 AlertDialog ad = new AlertDialog.Builder(getActivity()).create();
	            	 ad.setTitle("상세정보"); //팝업창 타이틀바
	            	 ad.setView(layout4);
	                // ad.setMessage("FinessShot");  //팝업창 내용
	                 ad.setButton(getActivity().getString(R.string.exit_name), new DialogInterface.OnClickListener() {
	                     public void onClick(DialogInterface dlg, int sumthin) {
	                         //닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
	                     	//dlg.dismiss();
	                    	 ((ViewGroup)layout4.getParent()).removeView(layout4);
	                     }
	                 });
	                 ad.show(); // 팝업창 보여줌
	             }
	   });
		
		appetizer_image5.setOnClickListener(new OnClickListener()
		   {
		         @Override
	             public void onClick(View v)
	             {
	            	//	  Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
	            	 AlertDialog ad = new AlertDialog.Builder(getActivity()).create();
	            	 ad.setTitle("상세정보"); //팝업창 타이틀바
	            	 ad.setView(layout5);
	                // ad.setMessage("FinessShot");  //팝업창 내용
	                 ad.setButton(getActivity().getString(R.string.exit_name), new DialogInterface.OnClickListener() {
	                     public void onClick(DialogInterface dlg, int sumthin) {
	                         //닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
	                     	//dlg.dismiss();
	                    	 ((ViewGroup)layout5.getParent()).removeView(layout5);
	                     }
	                 });
	                 ad.show(); // 팝업창 보여줌
	             }
	   });
		
		appetizer_image6.setOnClickListener(new OnClickListener()
		   {
		         @Override
	             public void onClick(View v)
	             {
	            	//	  Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
	            	 AlertDialog ad = new AlertDialog.Builder(getActivity()).create();
	            	 ad.setTitle("상세정보"); //팝업창 타이틀바
	            	 ad.setView(layout6);
	                // ad.setMessage("FinessShot");  //팝업창 내용
	                 ad.setButton(getActivity().getString(R.string.exit_name), new DialogInterface.OnClickListener() {
	                     public void onClick(DialogInterface dlg, int sumthin) {
	                         //닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
	                     	//dlg.dismiss();
	                    	 ((ViewGroup)layout6.getParent()).removeView(layout6);
	                     }
	                 });
	                 ad.show(); // 팝업창 보여줌
	             }
	   });
		
	   return view;
   }

	/*
	@Override
	public void onItemSelected(adapter2View<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
		Spinner spinner = (Spinner) parent;

		if (spinner.getId() == R.id.appetizer_spinner1) {


			String str1 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Appetizer.appetizer_numInt1 = Integer.parseInt(str1);
			// selection1.setText(items[numInt1]);
			Korean_Fragment_Appetizer.appetizer_total1 = (16900 * Korean_Fragment_Appetizer.appetizer_numInt1);
			// selection1.setText("" + total1);
		}

		if (spinner.getId() == R.id.appetizer_spinner2) {


			String str2 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Appetizer.appetizer_numInt2 = Integer.parseInt(str2); // selection1.setText(items[numInt1]);
			Korean_Fragment_Appetizer.appetizer_total2 = (17900 * Korean_Fragment_Appetizer.appetizer_numInt2); // selection1.setText("" + total1);

		}

		if (spinner.getId() == R.id.appetizer_spinner3) {


			String str3 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Appetizer.appetizer_numInt3 = Integer.parseInt(str3); // selection1.setText(items[numInt1]);
			Korean_Fragment_Appetizer.appetizer_total3 = (18900 * Korean_Fragment_Appetizer.appetizer_numInt3); // selection1.setText("" + total1);

		}

		if (spinner.getId() == R.id.appetizer_spinner4) {


			String str4 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Appetizer.appetizer_numInt4 = Integer.parseInt(str4); // selection1.setText(items[numInt1]);
			Korean_Fragment_Appetizer.appetizer_total4 = (15900 * Korean_Fragment_Appetizer.appetizer_numInt4); // selection1.setText("" + total1);

		}
		
		if (spinner.getId() == R.id.appetizer_spinner5) {


			String str5 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Appetizer.appetizer_numInt5 = Integer.parseInt(str5); // selection1.setText(items[numInt1]);
			Korean_Fragment_Appetizer.appetizer_total5 = (15500 * Korean_Fragment_Appetizer.appetizer_numInt5); // selection1.setText("" + total1);

		}
		
		if (spinner.getId() == R.id.appetizer_spinner6) {


			String str6 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Appetizer.appetizer_numInt6 = Integer.parseInt(str6); // selection1.setText(items[numInt1]);
			Korean_Fragment_Appetizer.appetizer_total6 = (30900 * Korean_Fragment_Appetizer.appetizer_numInt6); // selection1.setText("" + total1);

		}

		Korean_Fragment_Appetizer.appetizer_final_total = Korean_Fragment_Appetizer.appetizer_total1
				+ Korean_Fragment_Appetizer.appetizer_total2
				+ Korean_Fragment_Appetizer.appetizer_total3
				+ Korean_Fragment_Appetizer.appetizer_total4
				+ Korean_Fragment_Appetizer.appetizer_total5
				+ Korean_Fragment_Appetizer.appetizer_total6;
	}


	@Override
	public void onNothingSelected(adapter2View<?> parent) {
		// TODO Auto-generated method stub
		
	}
	*/
}