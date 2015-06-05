package com.example.test2;


import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class Usa_Fragment_Salad extends Fragment {
	
	static public int salad_numInt1;
	static public int salad_numInt2;
	static public int salad_numInt3;
	static public int salad_numInt4;
	
	static public int salad_total1;
	static public int salad_total2;
	static public int salad_total3;
	static public int salad_total4;	
	static public int salad_final_total;
	
	static public String salad1_name = "레몬 시저 샐러드";
	static public String salad2_name = "캘리포니아 스테이크 샐러드";
	static public String salad3_name = "치킨 텐더 샐러드";
	static public String salad4_name = "그릴드 씨푸드 로메인 샐러드";
	
	Button salad_minus_button1;
	Button salad_plus_button1;
	TextView salad_count_text1;
	
	Button salad_minus_button2;
	Button salad_plus_button2;
	TextView salad_count_text2;
	
	Button salad_minus_button3;
	Button salad_plus_button3;
	TextView salad_count_text3;
	
	Button salad_minus_button4;
	Button salad_plus_button4;
	TextView salad_count_text4;
	
	int salad_count_value1 = 0;
	int salad_count_value2 = 0;
	int salad_count_value3 = 0;
	int salad_count_value4 = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.usa_fragment_salad,container, false);
		
		   //Button button = (Button) view.findViewById(R.id.popup_button1);
		   
		ImageView salad_image1 = (ImageView) view.findViewById(R.id.salad_image1);
		ImageView salad_image2 = (ImageView) view.findViewById(R.id.salad_image2);
		ImageView salad_image3 = (ImageView) view.findViewById(R.id.salad_image3);
		ImageView salad_image4 = (ImageView) view.findViewById(R.id.salad_image4);
		
		ScrollView salad_contents_popup1 = (ScrollView) view.findViewById(R.id.salad_contents_popup1);
		ScrollView salad_contents_popup2 = (ScrollView) view.findViewById(R.id.salad_contents_popup2);
		ScrollView salad_contents_popup3 = (ScrollView) view.findViewById(R.id.salad_contents_popup3);
		ScrollView salad_contents_popup4 = (ScrollView) view.findViewById(R.id.salad_contents_popup4);
		
		final View layout = inflater.inflate(R.layout.salad1_contents,(ViewGroup) salad_contents_popup1);
		final View layout2 = inflater.inflate(R.layout.salad2_contents,(ViewGroup) salad_contents_popup2);
		final View layout3 = inflater.inflate(R.layout.salad3_contents,(ViewGroup) salad_contents_popup3);
		final View layout4 = inflater.inflate(R.layout.salad4_contents,(ViewGroup) salad_contents_popup4);
		
		
		salad_minus_button1 = (Button) view.findViewById(R.id.salad_minus_button1);
		salad_plus_button1 = (Button) view.findViewById(R.id.salad_plus_button1);
		salad_count_text1 =  (TextView) view.findViewById(R.id.salad_count_text1);
		
		salad_minus_button2 = (Button) view.findViewById(R.id.salad_minus_button2);
		salad_plus_button2 = (Button) view.findViewById(R.id.salad_plus_button2);
		salad_count_text2 =  (TextView) view.findViewById(R.id.salad_count_text2);
		
		salad_minus_button3 = (Button) view.findViewById(R.id.salad_minus_button3);
		salad_plus_button3 = (Button) view.findViewById(R.id.salad_plus_button3);
		salad_count_text3 =  (TextView) view.findViewById(R.id.salad_count_text3);

		salad_minus_button4 = (Button) view.findViewById(R.id.salad_minus_button4);
		salad_plus_button4 = (Button) view.findViewById(R.id.salad_plus_button4);
		salad_count_text4 =  (TextView) view.findViewById(R.id.salad_count_text4);
		
		salad_count_text1.setText(""+salad_count_value1);
		salad_count_text2.setText(""+salad_count_value2);
		salad_count_text3.setText(""+salad_count_value3);
		salad_count_text4.setText(""+salad_count_value4);
		
		salad_minus_button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(salad_count_value1 != 0)
				{
					salad_count_value1--;
					salad_count_text1.setText(""+salad_count_value1);
					Usa_Fragment_Salad.salad_numInt1 = salad_count_value1;
					Usa_Fragment_Salad.salad_total1 = (20500 * Usa_Fragment_Salad.salad_numInt1);
					Usa_Fragment_Salad.salad_final_total = Usa_Fragment_Salad.salad_total1
							+ Usa_Fragment_Salad.salad_total2
							+ Usa_Fragment_Salad.salad_total3
							+ Usa_Fragment_Salad.salad_total4;
					
					try {
						if (Korean_Fragment_Appetizer.sideDish_arrayIndex[6] != -1)
							Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[6]);
					} catch (Exception e) {
					}
					Korean_Fragment_Appetizer.sideDish_arrayIndex[6] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Salad.salad1_name,
							Usa_Fragment_Salad.salad_numInt1,
							Usa_Fragment_Salad.salad_total1));
					if (salad_count_value1 == 0) {
						Korean_Fragment_Appetizer.sideDish_arrayIndex[6] = -1;
					}
				}
			}
		});

		salad_plus_button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				salad_count_value1++;
				salad_count_text1.setText(""+salad_count_value1);
				Usa_Fragment_Salad.salad_numInt1 = salad_count_value1;
				Usa_Fragment_Salad.salad_total1 = (20500 * Usa_Fragment_Salad.salad_numInt1);
				Usa_Fragment_Salad.salad_final_total = Usa_Fragment_Salad.salad_total1
						+ Usa_Fragment_Salad.salad_total2
						+ Usa_Fragment_Salad.salad_total3
						+ Usa_Fragment_Salad.salad_total4;
				
				if (salad_count_value1 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[6]);
					} catch (Exception e) {
					}
				Korean_Fragment_Appetizer.sideDish_arrayIndex[6] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Salad.salad1_name,
						Usa_Fragment_Salad.salad_numInt1,
						Usa_Fragment_Salad.salad_total1));
			}
		});
		
		
		salad_minus_button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(salad_count_value2 != 0)
				{
					salad_count_value2--;
					salad_count_text2.setText(""+salad_count_value2);
					Usa_Fragment_Salad.salad_numInt2 = salad_count_value2;
					Usa_Fragment_Salad.salad_total2 = (20900 * Usa_Fragment_Salad.salad_numInt2);
					Usa_Fragment_Salad.salad_final_total = Usa_Fragment_Salad.salad_total1
							+ Usa_Fragment_Salad.salad_total2
							+ Usa_Fragment_Salad.salad_total3
							+ Usa_Fragment_Salad.salad_total4;
					
					try {
						if (Korean_Fragment_Appetizer.sideDish_arrayIndex[7] != -1)
							Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[7]);
					} catch (Exception e) {
					}
					Korean_Fragment_Appetizer.sideDish_arrayIndex[7] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Salad.salad2_name,
							Usa_Fragment_Salad.salad_numInt2,
							Usa_Fragment_Salad.salad_total2));
					if (salad_count_value2 == 0) {
						Korean_Fragment_Appetizer.sideDish_arrayIndex[7] = -1;
					}
					
				}
			}
		});

		salad_plus_button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				salad_count_value2++;
				salad_count_text2.setText(""+salad_count_value2);
				Usa_Fragment_Salad.salad_numInt2 = salad_count_value2;
				Usa_Fragment_Salad.salad_total2 = (20900 * Usa_Fragment_Salad.salad_numInt2);
				Usa_Fragment_Salad.salad_final_total = Usa_Fragment_Salad.salad_total1
						+ Usa_Fragment_Salad.salad_total2
						+ Usa_Fragment_Salad.salad_total3
						+ Usa_Fragment_Salad.salad_total4;
				
				if (salad_count_value2 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[7]);
					} catch (Exception e) {
					}
				Korean_Fragment_Appetizer.sideDish_arrayIndex[7] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Salad.salad2_name,
						Usa_Fragment_Salad.salad_numInt2,
						Usa_Fragment_Salad.salad_total2));
				
			}
		});
		

		salad_minus_button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(salad_count_value3 != 0)
				{
					salad_count_value3--;
					salad_count_text3.setText(""+salad_count_value3);
					Usa_Fragment_Salad.salad_numInt3 = salad_count_value3;
					Usa_Fragment_Salad.salad_total3 = (19900 * Usa_Fragment_Salad.salad_numInt3);
					Usa_Fragment_Salad.salad_final_total = Usa_Fragment_Salad.salad_total1
							+ Usa_Fragment_Salad.salad_total2
							+ Usa_Fragment_Salad.salad_total3
							+ Usa_Fragment_Salad.salad_total4;
					
					try {
						if (Korean_Fragment_Appetizer.sideDish_arrayIndex[8] != -1)
							Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[8]);
					} catch (Exception e) {
					}
					Korean_Fragment_Appetizer.sideDish_arrayIndex[8] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Salad.salad3_name,
							Usa_Fragment_Salad.salad_numInt3,
							Usa_Fragment_Salad.salad_total3));
					if (salad_count_value3 == 0) {
						Korean_Fragment_Appetizer.sideDish_arrayIndex[8] = -1;
					}
					
				}
			}
		});

		salad_plus_button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				salad_count_value3++;
				salad_count_text3.setText(""+salad_count_value3);
				Usa_Fragment_Salad.salad_numInt3 = salad_count_value3;
				Usa_Fragment_Salad.salad_total3 = (19900 * Usa_Fragment_Salad.salad_numInt3);
				Usa_Fragment_Salad.salad_final_total = Usa_Fragment_Salad.salad_total1
						+ Usa_Fragment_Salad.salad_total2
						+ Usa_Fragment_Salad.salad_total3
						+ Usa_Fragment_Salad.salad_total4;
				
				if (salad_count_value3 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[8]);
					} catch (Exception e) {
					}
				Korean_Fragment_Appetizer.sideDish_arrayIndex[8] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Salad.salad3_name,
						Usa_Fragment_Salad.salad_numInt3,
						Usa_Fragment_Salad.salad_total3));
				
			}
		});
		
		salad_minus_button4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(salad_count_value4 != 0)
				{
					salad_count_value4--;
					salad_count_text4.setText(""+salad_count_value4);
					Usa_Fragment_Salad.salad_numInt4 = salad_count_value4;
					Usa_Fragment_Salad.salad_total4 = (20900 * Usa_Fragment_Salad.salad_numInt4);
					Usa_Fragment_Salad.salad_final_total = Usa_Fragment_Salad.salad_total1
							+ Usa_Fragment_Salad.salad_total2
							+ Usa_Fragment_Salad.salad_total3
							+ Usa_Fragment_Salad.salad_total4;
					
					try {
						if (Korean_Fragment_Appetizer.sideDish_arrayIndex[9] != -1)
							Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[9]);
					} catch (Exception e) {
					}
					Korean_Fragment_Appetizer.sideDish_arrayIndex[9] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Usa_Fragment_Salad.salad4_name,
							Usa_Fragment_Salad.salad_numInt4,
							Usa_Fragment_Salad.salad_total4));
					if (salad_count_value4 == 0) {
						Korean_Fragment_Appetizer.sideDish_arrayIndex[9] = -1;
					}
					
					
				}
			}
		});

		salad_plus_button4.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				salad_count_value4++;
				salad_count_text4.setText(""+salad_count_value4);
				Usa_Fragment_Salad.salad_numInt4 = salad_count_value4;
				Usa_Fragment_Salad.salad_total4 = (20900 * Usa_Fragment_Salad.salad_numInt4);
				Usa_Fragment_Salad.salad_final_total = Usa_Fragment_Salad.salad_total1
						+ Usa_Fragment_Salad.salad_total2
						+ Usa_Fragment_Salad.salad_total3
						+ Usa_Fragment_Salad.salad_total4;
				
				if (salad_count_value4 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[9]);
					} catch (Exception e) {
					}
				Korean_Fragment_Appetizer.sideDish_arrayIndex[9] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Usa_Fragment_Salad.salad4_name,
						Usa_Fragment_Salad.salad_numInt4,
						Usa_Fragment_Salad.salad_total4));
			}
		});

		
		salad_image1.setOnClickListener(new OnClickListener()
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
		
		salad_image2.setOnClickListener(new OnClickListener()
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
		
		salad_image3.setOnClickListener(new OnClickListener()
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
		
		salad_image4.setOnClickListener(new OnClickListener()
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
		
	   return view;
   }
	
	/*

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Spinner spinner = (Spinner) parent;

		if (spinner.getId() == R.id.salad_spinner1) {

			String str1 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Salad.salad_numInt1 = Integer.parseInt(str1);
			// selection1.setText(items[numInt1]);
			Korean_Fragment_Salad.salad_total1 = (20500 * Korean_Fragment_Salad.salad_numInt1);
			// selection1.setText("" + total1);
		}

		if (spinner.getId() == R.id.salad_spinner2) {

			String str2 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Salad.salad_numInt2 = Integer.parseInt(str2); 
			Korean_Fragment_Salad.salad_total2 = (20900 * Korean_Fragment_Salad.salad_numInt2); 
		}

		if (spinner.getId() == R.id.salad_spinner3) {

			String str3 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Salad.salad_numInt3 = Integer.parseInt(str3); 
			Korean_Fragment_Salad.salad_total3 = (19900 * Korean_Fragment_Salad.salad_numInt3); 
		}

		if (spinner.getId() == R.id.salad_spinner4) {

			String str4 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Salad.salad_numInt4 = Integer.parseInt(str4); 
			Korean_Fragment_Salad.salad_total4 = (20900 * Korean_Fragment_Salad.salad_numInt4);
		}

		Korean_Fragment_Salad.salad_final_total = Korean_Fragment_Salad.salad_total1
				+ Korean_Fragment_Salad.salad_total2
				+ Korean_Fragment_Salad.salad_total3
				+ Korean_Fragment_Salad.salad_total4;
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	*/
}
