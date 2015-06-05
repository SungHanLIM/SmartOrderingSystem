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

public class Korean_Fragment_Seafood extends Fragment  {

	static public int seafood_numInt1;
	static public int seafood_numInt2;
	static public int seafood_numInt3;
	static public int seafood_numInt4;
	static public int seafood_numInt5;
	static public int seafood_numInt6;

	static public int seafood_total1;
	static public int seafood_total2;
	static public int seafood_total3;
	static public int seafood_final_total;

	static public String seafood1_name = "치즈 랍스터 & 쉬림프 케익";
	static public String seafood2_name = "웨스턴 그릴드 씨푸드 플래터";
	static public String seafood3_name = "피시 & 칩스";
	
	Button seafood_minus_button1;
	Button seafood_plus_button1;
	TextView seafood_count_text1;
	
	Button seafood_minus_button2;
	Button seafood_plus_button2;
	TextView seafood_count_text2;
	
	Button seafood_minus_button3;
	Button seafood_plus_button3;
	TextView seafood_count_text3;

	int seafood_count_value1 = 0;
	int seafood_count_value2 = 0;
	int seafood_count_value3 = 0;


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.korean_fragment_seafood,
				container, false);

		// Button button = (Button) view.findViewById(R.id.popup_button1);

		ImageView seafood_image1 = (ImageView) view
				.findViewById(R.id.seafood_image1);
		ImageView seafood_image2 = (ImageView) view
				.findViewById(R.id.seafood_image2);
		ImageView seafood_image3 = (ImageView) view
				.findViewById(R.id.seafood_image3);

		ScrollView seafood_contents_popup1 = (ScrollView) view
				.findViewById(R.id.seafood_contents_popup1);
		ScrollView seafood_contents_popup2 = (ScrollView) view
				.findViewById(R.id.seafood_contents_popup2);
		ScrollView seafood_contents_popup3 = (ScrollView) view
				.findViewById(R.id.seafood_contents_popup3);

		final View layout = inflater.inflate(R.layout.seafood1_contents,
				(ViewGroup) seafood_contents_popup1);
		final View layout2 = inflater.inflate(R.layout.seafood2_contents,
				(ViewGroup) seafood_contents_popup2);
		final View layout3 = inflater.inflate(R.layout.seafood3_contents,
				(ViewGroup) seafood_contents_popup3);

		
		seafood_minus_button1 = (Button) view.findViewById(R.id.seafood_minus_button1);
		seafood_plus_button1 = (Button) view.findViewById(R.id.seafood_plus_button1);
		seafood_count_text1 =  (TextView) view.findViewById(R.id.seafood_count_text1);
		
		seafood_minus_button2 = (Button) view.findViewById(R.id.seafood_minus_button2);
		seafood_plus_button2 = (Button) view.findViewById(R.id.seafood_plus_button2);
		seafood_count_text2 =  (TextView) view.findViewById(R.id.seafood_count_text2);
		
		seafood_minus_button3 = (Button) view.findViewById(R.id.seafood_minus_button3);
		seafood_plus_button3 = (Button) view.findViewById(R.id.seafood_plus_button3);
		seafood_count_text3 =  (TextView) view.findViewById(R.id.seafood_count_text3);
		
		seafood_count_text1.setText(""+seafood_count_value1);
		seafood_count_text2.setText(""+seafood_count_value2);
		seafood_count_text3.setText(""+seafood_count_value3);

		
		seafood_minus_button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(seafood_count_value1 != 0)
				{
					seafood_count_value1--;
					seafood_count_text1.setText(""+seafood_count_value1);
					Korean_Fragment_Seafood.seafood_numInt1 = seafood_count_value1;
					Korean_Fragment_Seafood.seafood_total1 = (32500 * Korean_Fragment_Seafood.seafood_numInt1);
					Korean_Fragment_Seafood.seafood_final_total = Korean_Fragment_Seafood.seafood_total1
							+ Korean_Fragment_Seafood.seafood_total2
							+ Korean_Fragment_Seafood.seafood_total3;
					
					try {
						if (Korean_Fragment_Appetizer.sideDish_arrayIndex[10] != -1)
							Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[10]);
					} catch (Exception e) {
					}
					Korean_Fragment_Appetizer.sideDish_arrayIndex[10] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Korean_Fragment_Seafood.seafood1_name,
							Korean_Fragment_Seafood.seafood_numInt1,
							Korean_Fragment_Seafood.seafood_total1));
					if (seafood_count_value1 == 0) {
						Korean_Fragment_Appetizer.sideDish_arrayIndex[10] = -1;
					}
				}
			}
		});

		seafood_plus_button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				seafood_count_value1++;
				seafood_count_text1.setText(""+seafood_count_value1);
				Korean_Fragment_Seafood.seafood_numInt1 = seafood_count_value1;
				Korean_Fragment_Seafood.seafood_total1 = (32500 * Korean_Fragment_Seafood.seafood_numInt1);
				Korean_Fragment_Seafood.seafood_final_total = Korean_Fragment_Seafood.seafood_total1
						+ Korean_Fragment_Seafood.seafood_total2
						+ Korean_Fragment_Seafood.seafood_total3;
				
				if (seafood_count_value1 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[10]);
					} catch (Exception e) {
					}
				Korean_Fragment_Appetizer.sideDish_arrayIndex[10] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Korean_Fragment_Seafood.seafood1_name,
						Korean_Fragment_Seafood.seafood_numInt1,
						Korean_Fragment_Seafood.seafood_total1));
			}
		});
		
		
		seafood_minus_button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(seafood_count_value2 != 0)
				{
					seafood_count_value2--;
					seafood_count_text2.setText(""+seafood_count_value2);
					Korean_Fragment_Seafood.seafood_numInt2 = seafood_count_value2;
					Korean_Fragment_Seafood.seafood_total2 = (47900 * Korean_Fragment_Seafood.seafood_numInt2);
					Korean_Fragment_Seafood.seafood_final_total = Korean_Fragment_Seafood.seafood_total1
							+ Korean_Fragment_Seafood.seafood_total2
							+ Korean_Fragment_Seafood.seafood_total3;
					
					try {
						if (Korean_Fragment_Appetizer.sideDish_arrayIndex[11] != -1)
							Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[11]);
					} catch (Exception e) {
					}
					Korean_Fragment_Appetizer.sideDish_arrayIndex[11] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Korean_Fragment_Seafood.seafood2_name,
							Korean_Fragment_Seafood.seafood_numInt2,
							Korean_Fragment_Seafood.seafood_total2));
					if (seafood_count_value2 == 0) {
						Korean_Fragment_Appetizer.sideDish_arrayIndex[11] = -1;
					}
					
				}
			}
		});

		seafood_plus_button2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				seafood_count_value2++;
				seafood_count_text2.setText(""+seafood_count_value2);
				Korean_Fragment_Seafood.seafood_numInt2 = seafood_count_value2;
				Korean_Fragment_Seafood.seafood_total2 = (47900 * Korean_Fragment_Seafood.seafood_numInt2);
				Korean_Fragment_Seafood.seafood_final_total = Korean_Fragment_Seafood.seafood_total1
						+ Korean_Fragment_Seafood.seafood_total2
						+ Korean_Fragment_Seafood.seafood_total3;
				
				if (seafood_count_value2 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[11]);
					} catch (Exception e) {
					}
				Korean_Fragment_Appetizer.sideDish_arrayIndex[11] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Korean_Fragment_Seafood.seafood2_name,
						Korean_Fragment_Seafood.seafood_numInt2,
						Korean_Fragment_Seafood.seafood_total2));
			}
		});
		

		seafood_minus_button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				if(seafood_count_value3 != 0)
				{
					seafood_count_value3--;
					seafood_count_text3.setText(""+seafood_count_value3);
					Korean_Fragment_Seafood.seafood_numInt3 = seafood_count_value3;
					Korean_Fragment_Seafood.seafood_total3 = (18500 * Korean_Fragment_Seafood.seafood_numInt3);
					Korean_Fragment_Seafood.seafood_final_total = Korean_Fragment_Seafood.seafood_total1
							+ Korean_Fragment_Seafood.seafood_total2
							+ Korean_Fragment_Seafood.seafood_total3;
					
					try {
						if (Korean_Fragment_Appetizer.sideDish_arrayIndex[12] != -1)
							Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[12]);
					} catch (Exception e) {
					}
					Korean_Fragment_Appetizer.sideDish_arrayIndex[12] = Korean_Activity.alist2.size();
					Korean_Activity.adapter2.add(new CData4(
							Korean_Activity.context,
							Korean_Fragment_Seafood.seafood3_name,
							Korean_Fragment_Seafood.seafood_numInt3,
							Korean_Fragment_Seafood.seafood_total3));
					if (seafood_count_value3 == 0) {
						Korean_Fragment_Appetizer.sideDish_arrayIndex[12] = -1;
					}
					
				}
			}
		});

		seafood_plus_button3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0, 0, 1f);
				seafood_count_value3++;
				seafood_count_text3.setText(""+seafood_count_value3);
				Korean_Fragment_Seafood.seafood_numInt3 = seafood_count_value3;
				Korean_Fragment_Seafood.seafood_total3 = (18500 * Korean_Fragment_Seafood.seafood_numInt3);
				Korean_Fragment_Seafood.seafood_final_total = Korean_Fragment_Seafood.seafood_total1
						+ Korean_Fragment_Seafood.seafood_total2
						+ Korean_Fragment_Seafood.seafood_total3;
				
				if (seafood_count_value3 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist2.remove(Korean_Fragment_Appetizer.sideDish_arrayIndex[12]);
					} catch (Exception e) {
					}
				Korean_Fragment_Appetizer.sideDish_arrayIndex[12] = Korean_Activity.alist2.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter2.add(new CData4(Korean_Activity.context,
						Korean_Fragment_Seafood.seafood3_name,
						Korean_Fragment_Seafood.seafood_numInt3,
						Korean_Fragment_Seafood.seafood_total3));
			}
		});
		

		seafood_image1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
				AlertDialog ad = new AlertDialog.Builder(getActivity())
						.create();
				ad.setTitle("상세정보"); // 팝업창 타이틀바
				ad.setView(layout);
				// ad.setMessage("FinessShot"); //팝업창 내용
				ad.setButton(getActivity().getString(R.string.exit_name),
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dlg, int sumthin) {
								// 닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
								// dlg.dismiss();
								((ViewGroup) layout.getParent())
										.removeView(layout);
							}
						});
				ad.show(); // 팝업창 보여줌
			}
		});

		seafood_image2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
				AlertDialog ad = new AlertDialog.Builder(getActivity())
						.create();
				ad.setTitle("상세정보"); // 팝업창 타이틀바
				ad.setView(layout2);
				// ad.setMessage("FinessShot"); //팝업창 내용
				ad.setButton(getActivity().getString(R.string.exit_name),
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dlg, int sumthin) {
								// 닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
								// dlg.dismiss();
								((ViewGroup) layout2.getParent())
										.removeView(layout2);
							}
						});
				ad.show(); // 팝업창 보여줌
			}
		});

		seafood_image3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
				AlertDialog ad = new AlertDialog.Builder(getActivity())
						.create();
				ad.setTitle("상세정보"); // 팝업창 타이틀바
				ad.setView(layout3);
				// ad.setMessage("FinessShot"); //팝업창 내용
				ad.setButton(getActivity().getString(R.string.exit_name),
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dlg, int sumthin) {
								// 닫기 버튼을 누르면 아무것도 안하고 닫기 때문에 그냥 비움
								// dlg.dismiss();
								((ViewGroup) layout3.getParent())
										.removeView(layout3);
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

		if (spinner.getId() == R.id.seafood_spinner1) {

			String str1 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Seafood.seafood_numInt1 = Integer.parseInt(str1);
			Korean_Fragment_Seafood.seafood_total1 = (32500 * Korean_Fragment_Seafood.seafood_numInt1);
		}

		if (spinner.getId() == R.id.seafood_spinner2) {

			String str2 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Seafood.seafood_numInt2 = Integer.parseInt(str2);
			Korean_Fragment_Seafood.seafood_total2 = (47900 * Korean_Fragment_Seafood.seafood_numInt2);
		}

		if (spinner.getId() == R.id.seafood_spinner3) {

			String str3 = (String) parent.getItemAtPosition(position);
			Korean_Fragment_Seafood.seafood_numInt3 = Integer.parseInt(str3);
			Korean_Fragment_Seafood.seafood_total3 = (18500 * Korean_Fragment_Seafood.seafood_numInt3);
		}

		Korean_Fragment_Seafood.seafood_final_total = Korean_Fragment_Seafood.seafood_total1
				+ Korean_Fragment_Seafood.seafood_total2
				+ Korean_Fragment_Seafood.seafood_total3;
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub

	}
	*/
}
