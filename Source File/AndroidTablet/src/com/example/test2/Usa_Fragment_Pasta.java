package com.example.test2;


import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

public class Usa_Fragment_Pasta extends Fragment {

	static public int pasta_numInt1;
	static public int pasta_numInt2;
	static public int pasta_numInt3;
	static public int pasta_numInt4;
	static public int pasta_numInt5;
	
	static public int pasta_total1;
	static public int pasta_total2;
	static public int pasta_total3;
	static public int pasta_total4;
	static public int pasta_total5;
	static public int pasta_final_total;
	
	static public String pasta1_name="스파이시 치킨 & 쉬림프 스파게티";
	static public String pasta2_name="투움바 파스타";
	static public String pasta3_name="바질 페스토 올리브 파스타";
	static public String pasta4_name="씨푸드 뽀모도로";
	static public String pasta5_name="치킨 까르보나라";
	
	Button pasta_minus_button1;
	Button pasta_plus_button1;
	TextView pasta_count_text1;
	
	Button pasta_minus_button2;
	Button pasta_plus_button2;
	TextView pasta_count_text2;
	
	Button pasta_minus_button3;
	Button pasta_plus_button3;
	TextView pasta_count_text3;
	
	Button pasta_minus_button4;
	Button pasta_plus_button4;
	TextView pasta_count_text4;
	
	Button pasta_minus_button5;
	Button pasta_plus_button5;
	TextView pasta_count_text5;
	
	int pasta_count_value1 = 0;
	int pasta_count_value2 = 0;
	int pasta_count_value3 = 0;
	int pasta_count_value4 = 0;
	int pasta_count_value5 = 0;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.usa_fragment_pasta,container, false);
		
		   //Button button = (Button) view.findViewById(R.id.popup_button1);
		   
		ImageView pasta_image1 = (ImageView) view.findViewById(R.id.pasta_image1);
		ImageView pasta_image2 = (ImageView) view.findViewById(R.id.pasta_image2);
		ImageView pasta_image3 = (ImageView) view.findViewById(R.id.pasta_image3);
		ImageView pasta_image4 = (ImageView) view.findViewById(R.id.pasta_image4);
		ImageView pasta_image5 = (ImageView) view.findViewById(R.id.pasta_image5);
		
		ScrollView pasta_contents_popup1 = (ScrollView) view.findViewById(R.id.pasta_contents_popup1);
		ScrollView pasta_contents_popup2 = (ScrollView) view.findViewById(R.id.pasta_contents_popup2);
		ScrollView pasta_contents_popup3 = (ScrollView) view.findViewById(R.id.pasta_contents_popup3);
		ScrollView pasta_contents_popup4 = (ScrollView) view.findViewById(R.id.pasta_contents_popup4);
		ScrollView pasta_contents_popup5 = (ScrollView) view.findViewById(R.id.pasta_contents_popup5);
		
		final View layout = inflater.inflate(R.layout.pasta1_contents,(ViewGroup) pasta_contents_popup1);
		final View layout2 = inflater.inflate(R.layout.pasta2_contents,(ViewGroup) pasta_contents_popup2);
		final View layout3 = inflater.inflate(R.layout.pasta3_contents,(ViewGroup) pasta_contents_popup3);
		final View layout4 = inflater.inflate(R.layout.pasta4_contents,(ViewGroup) pasta_contents_popup4);
		final View layout5 = inflater.inflate(R.layout.pasta5_contents,(ViewGroup) pasta_contents_popup5);
		

		pasta_minus_button1 = (Button) view.findViewById(R.id.pasta_minus_button1);
		pasta_plus_button1 = (Button) view.findViewById(R.id.pasta_plus_button1);
		pasta_count_text1 =  (TextView) view.findViewById(R.id.pasta_count_text1);
	
		pasta_minus_button2 = (Button) view.findViewById(R.id.pasta_minus_button2);
		pasta_plus_button2 = (Button) view.findViewById(R.id.pasta_plus_button2);
		pasta_count_text2 =  (TextView) view.findViewById(R.id.pasta_count_text2);
		
		pasta_minus_button3 = (Button) view.findViewById(R.id.pasta_minus_button3);
		pasta_plus_button3 = (Button) view.findViewById(R.id.pasta_plus_button3);
		pasta_count_text3 =  (TextView) view.findViewById(R.id.pasta_count_text3);
		
		pasta_minus_button4 = (Button) view.findViewById(R.id.pasta_minus_button4);
		pasta_plus_button4 = (Button) view.findViewById(R.id.pasta_plus_button4);
		pasta_count_text4 =  (TextView) view.findViewById(R.id.pasta_count_text4);
	
		pasta_minus_button5 = (Button) view.findViewById(R.id.pasta_minus_button5);
		pasta_plus_button5 = (Button) view.findViewById(R.id.pasta_plus_button5);
		pasta_count_text5 =  (TextView) view.findViewById(R.id.pasta_count_text5);
	
		pasta_count_text1.setText(""+pasta_count_value1);
		pasta_count_text2.setText(""+pasta_count_value2);
		pasta_count_text3.setText(""+pasta_count_value3);
		pasta_count_text4.setText(""+pasta_count_value4);
		pasta_count_text5.setText(""+pasta_count_value5);
		
		pasta_minus_button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(pasta_count_value1 != 0)
				{
					pasta_count_value1--;
					pasta_count_text1.setText(""+pasta_count_value1);
					Usa_Fragment_Pasta.pasta_numInt1 = pasta_count_value1;
					Usa_Fragment_Pasta.pasta_total1 = (20500 * Usa_Fragment_Pasta.pasta_numInt1);
					Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
							+ Usa_Fragment_Pasta.pasta_total2
							+ Usa_Fragment_Pasta.pasta_total3
							+ Usa_Fragment_Pasta.pasta_total4
							+ Usa_Fragment_Pasta.pasta_total5;
	
					try {
						if (Korean_Fragment_Steak.mainDish_arrayIndex[4] != -1)
							Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[4]);
					} catch (Exception e) {
					}
					Korean_Fragment_Steak.mainDish_arrayIndex[4] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Usa_Fragment_Pasta.pasta1_name,
							Usa_Fragment_Pasta.pasta_numInt1,
							Usa_Fragment_Pasta.pasta_total1));
					if (pasta_count_value1 == 0) {
						Korean_Fragment_Steak.mainDish_arrayIndex[4] = -1;
					}
					
				}
			}
		});

		pasta_plus_button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				pasta_count_value1++;
				pasta_count_text1.setText(""+pasta_count_value1);
				Usa_Fragment_Pasta.pasta_numInt1 = pasta_count_value1;
				Usa_Fragment_Pasta.pasta_total1 = (20500 * Usa_Fragment_Pasta.pasta_numInt1);
				Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
						+ Usa_Fragment_Pasta.pasta_total2
						+ Usa_Fragment_Pasta.pasta_total3
						+ Usa_Fragment_Pasta.pasta_total4
						+ Usa_Fragment_Pasta.pasta_total5;
			
				if (pasta_count_value1 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[4]);
					} catch (Exception e) {
					}
				Korean_Fragment_Steak.mainDish_arrayIndex[4] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Usa_Fragment_Pasta.pasta1_name,
						Usa_Fragment_Pasta.pasta_numInt1,
						Usa_Fragment_Pasta.pasta_total1));
			}
		});
		
		
		pasta_minus_button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(pasta_count_value2 != 0)
				{
					pasta_count_value2--;
					pasta_count_text2.setText(""+pasta_count_value2);
					Usa_Fragment_Pasta.pasta_numInt2 = pasta_count_value2;
					Usa_Fragment_Pasta.pasta_total2 = (19900 * Usa_Fragment_Pasta.pasta_numInt2);
					Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
							+ Usa_Fragment_Pasta.pasta_total2
							+ Usa_Fragment_Pasta.pasta_total3
							+ Usa_Fragment_Pasta.pasta_total4
							+ Usa_Fragment_Pasta.pasta_total5;
				
					try {
						if (Korean_Fragment_Steak.mainDish_arrayIndex[5] != -1)
							Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[5]);
					} catch (Exception e) {
					}
					Korean_Fragment_Steak.mainDish_arrayIndex[5] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Usa_Fragment_Pasta.pasta2_name,
							Usa_Fragment_Pasta.pasta_numInt2,
							Usa_Fragment_Pasta.pasta_total2));
					if (pasta_count_value2 == 0) {
						Korean_Fragment_Steak.mainDish_arrayIndex[5] = -1;
					}
				
				}
			}
		});

		pasta_plus_button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				pasta_count_value2++;
				pasta_count_text2.setText(""+pasta_count_value2);
				Usa_Fragment_Pasta.pasta_numInt2 = pasta_count_value2;
				Usa_Fragment_Pasta.pasta_total2 = (19900 * Usa_Fragment_Pasta.pasta_numInt2);
				Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
						+ Usa_Fragment_Pasta.pasta_total2
						+ Usa_Fragment_Pasta.pasta_total3
						+ Usa_Fragment_Pasta.pasta_total4
						+ Usa_Fragment_Pasta.pasta_total5;
				
				if (pasta_count_value2 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[5]);
					} catch (Exception e) {
					}
				Korean_Fragment_Steak.mainDish_arrayIndex[5] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Usa_Fragment_Pasta.pasta2_name,
						Usa_Fragment_Pasta.pasta_numInt2,
						Usa_Fragment_Pasta.pasta_total2));
			}
		});
		

		pasta_minus_button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(pasta_count_value3 != 0)
				{
					pasta_count_value3--;
					pasta_count_text3.setText(""+pasta_count_value3);
					Usa_Fragment_Pasta.pasta_numInt3 = pasta_count_value3;
					Usa_Fragment_Pasta.pasta_total3 = (19900 * Usa_Fragment_Pasta.pasta_numInt3);
					Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
							+ Usa_Fragment_Pasta.pasta_total2
							+ Usa_Fragment_Pasta.pasta_total3
							+ Usa_Fragment_Pasta.pasta_total4
							+ Usa_Fragment_Pasta.pasta_total5;
				
					try {
						if (Korean_Fragment_Steak.mainDish_arrayIndex[6] != -1)
							Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[6]);
					} catch (Exception e) {
					}
					Korean_Fragment_Steak.mainDish_arrayIndex[6] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Usa_Fragment_Pasta.pasta3_name,
							Usa_Fragment_Pasta.pasta_numInt3,
							Usa_Fragment_Pasta.pasta_total3));
					if (pasta_count_value3 == 0) {
						Korean_Fragment_Steak.mainDish_arrayIndex[6] = -1;
					}
				}
			}
		});

		pasta_plus_button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				pasta_count_value3++;
				pasta_count_text3.setText(""+pasta_count_value3);
				Usa_Fragment_Pasta.pasta_numInt3 = pasta_count_value3;
				Usa_Fragment_Pasta.pasta_total3 = (19900 * Usa_Fragment_Pasta.pasta_numInt3);
				Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
						+ Usa_Fragment_Pasta.pasta_total2
						+ Usa_Fragment_Pasta.pasta_total3
						+ Usa_Fragment_Pasta.pasta_total4
						+ Usa_Fragment_Pasta.pasta_total5;
			
				
				if (pasta_count_value3 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[6]);
					} catch (Exception e) {
					}
				Korean_Fragment_Steak.mainDish_arrayIndex[6] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Usa_Fragment_Pasta.pasta3_name,
						Usa_Fragment_Pasta.pasta_numInt3,
						Usa_Fragment_Pasta.pasta_total3));
			}
		});
		
		pasta_minus_button4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(pasta_count_value4 != 0)
				{
					pasta_count_value4--;
					pasta_count_text4.setText(""+pasta_count_value4);
					Usa_Fragment_Pasta.pasta_numInt4 = pasta_count_value4;
					Usa_Fragment_Pasta.pasta_total4 = (19500 * Usa_Fragment_Pasta.pasta_numInt4);
					Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
							+ Usa_Fragment_Pasta.pasta_total2
							+ Usa_Fragment_Pasta.pasta_total3
							+ Usa_Fragment_Pasta.pasta_total4
							+ Usa_Fragment_Pasta.pasta_total5;
					
					try {
						if (Korean_Fragment_Steak.mainDish_arrayIndex[7] != -1)
							Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[7]);
					} catch (Exception e) {
					}
					Korean_Fragment_Steak.mainDish_arrayIndex[7] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Usa_Fragment_Pasta.pasta4_name,
							Usa_Fragment_Pasta.pasta_numInt4,
							Usa_Fragment_Pasta.pasta_total4));
					if (pasta_count_value4 == 0) {
						Korean_Fragment_Steak.mainDish_arrayIndex[7] = -1;
					}
					
				}
			}
		});

		pasta_plus_button4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				pasta_count_value4++;
				pasta_count_text4.setText(""+pasta_count_value4);
				Usa_Fragment_Pasta.pasta_numInt4 = pasta_count_value4;
				Usa_Fragment_Pasta.pasta_total4 = (19500 * Usa_Fragment_Pasta.pasta_numInt4);
				Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
						+ Usa_Fragment_Pasta.pasta_total2
						+ Usa_Fragment_Pasta.pasta_total3
						+ Usa_Fragment_Pasta.pasta_total4
						+ Usa_Fragment_Pasta.pasta_total5;
			
				if (pasta_count_value4 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[7]);
					} catch (Exception e) {
					}
				Korean_Fragment_Steak.mainDish_arrayIndex[7] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Usa_Fragment_Pasta.pasta4_name,
						Usa_Fragment_Pasta.pasta_numInt4,
						Usa_Fragment_Pasta.pasta_total4));
			
			}
		});

		pasta_minus_button5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(pasta_count_value5 != 0)
				{
					pasta_count_value5--;
					pasta_count_text5.setText(""+pasta_count_value5);
					Usa_Fragment_Pasta.pasta_numInt5 = pasta_count_value5;
					Usa_Fragment_Pasta.pasta_total5 = (20500 * Usa_Fragment_Pasta.pasta_numInt5);
					Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
							+ Usa_Fragment_Pasta.pasta_total2
							+ Usa_Fragment_Pasta.pasta_total3
							+ Usa_Fragment_Pasta.pasta_total4
							+ Usa_Fragment_Pasta.pasta_total5;
					
					try {
						if (Korean_Fragment_Steak.mainDish_arrayIndex[8] != -1)
							Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[8]);
					} catch (Exception e) {
					}
					Korean_Fragment_Steak.mainDish_arrayIndex[8] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Usa_Fragment_Pasta.pasta5_name,
							Usa_Fragment_Pasta.pasta_numInt5,
							Usa_Fragment_Pasta.pasta_total5));
					if (pasta_count_value5 == 0) {
						Korean_Fragment_Steak.mainDish_arrayIndex[8] = -1;
					}
				}
			}
		});

		pasta_plus_button5.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				pasta_count_value5++;
				pasta_count_text5.setText(""+pasta_count_value5);
				Usa_Fragment_Pasta.pasta_numInt5 = pasta_count_value5;
				Usa_Fragment_Pasta.pasta_total5 = (20500 * Usa_Fragment_Pasta.pasta_numInt5);
				Usa_Fragment_Pasta.pasta_final_total = Usa_Fragment_Pasta.pasta_total1
						+ Usa_Fragment_Pasta.pasta_total2
						+ Usa_Fragment_Pasta.pasta_total3
						+ Usa_Fragment_Pasta.pasta_total4
						+ Usa_Fragment_Pasta.pasta_total5;
				
				if (pasta_count_value5 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(Korean_Fragment_Steak.mainDish_arrayIndex[8]);
					} catch (Exception e) {
					}
				Korean_Fragment_Steak.mainDish_arrayIndex[8] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Usa_Fragment_Pasta.pasta5_name,
						Usa_Fragment_Pasta.pasta_numInt5,
						Usa_Fragment_Pasta.pasta_total5));
			}
		});
		
		pasta_image1.setOnClickListener(new OnClickListener()
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
		
		pasta_image2.setOnClickListener(new OnClickListener()
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
		
		pasta_image3.setOnClickListener(new OnClickListener()
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
		
		pasta_image4.setOnClickListener(new OnClickListener()
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
		
		
		pasta_image5.setOnClickListener(new OnClickListener()
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
		
	   return view;
   }

	/*
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
		Spinner spinner = (Spinner) parent;

		if (spinner.getId() == R.id.pasta_spinner1) {


			String str1 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Pasta.pasta_numInt1 = Integer.parseInt(str1);
			// selection1.setText(items[numInt1]);
			Korean_Fragment_Pasta.pasta_total1 = (20500 * Korean_Fragment_Pasta.pasta_numInt1);
			// selection1.setText("" + total1);
		}

		if (spinner.getId() == R.id.pasta_spinner2) {


			String str2 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Pasta.pasta_numInt2 = Integer.parseInt(str2); // selection1.setText(items[numInt1]);
			Korean_Fragment_Pasta.pasta_total2 = (19900 * Korean_Fragment_Pasta.pasta_numInt2); // selection1.setText("" + total1);

		}

		if (spinner.getId() == R.id.pasta_spinner3) {


			String str3 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Pasta.pasta_numInt3 = Integer.parseInt(str3); // selection1.setText(items[numInt1]);
			Korean_Fragment_Pasta.pasta_total3 = (19900 * Korean_Fragment_Pasta.pasta_numInt3); // selection1.setText("" + total1);

		}

		if (spinner.getId() == R.id.pasta_spinner4) {


			String str4 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Pasta.pasta_numInt4 = Integer.parseInt(str4); // selection1.setText(items[numInt1]);
			Korean_Fragment_Pasta.pasta_total4 = (19500 * Korean_Fragment_Pasta.pasta_numInt4); // selection1.setText("" + total1);

		}
		
		if (spinner.getId() == R.id.pasta_spinner5) {


			String str5 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Pasta.pasta_numInt5 = Integer.parseInt(str5); // selection1.setText(items[numInt1]);
			Korean_Fragment_Pasta.pasta_total5 = (20500 * Korean_Fragment_Pasta.pasta_numInt5); // selection1.setText("" + total1);

		}

		Korean_Fragment_Pasta.pasta_final_total = Korean_Fragment_Pasta.pasta_total1
				+ Korean_Fragment_Pasta.pasta_total2
				+ Korean_Fragment_Pasta.pasta_total3
				+ Korean_Fragment_Pasta.pasta_total4
				+ Korean_Fragment_Pasta.pasta_total5;
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	*/
}



