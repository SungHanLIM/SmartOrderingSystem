package com.example.test2;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;

public class Korean_Fragment_Steak extends Fragment {

	public View order_button;
	public final static String TAG = "LOG";

	static public int steak_numInt1 = 0;
	static public int steak_numInt2 = 0;
	static public int steak_numInt3 = 0;
	static public int steak_numInt4 = 0;

	static public int steak_total1;
	static public int steak_total2;
	static public int steak_total3;
	static public int steak_total4;
	static public int steak_final_total;

	static public String steak1_name = "�ӽ��� ������ ������ũ �� ��";
	static public String steak2_name = "���� ������";
	static public String steak3_name = "�ٷ� ����ī ��Ÿ��";
	static public String steak4_name = "��� ȭ�̾� �׸� ������ũ �� ����";

	static public Button steak_minus_button1;
	static public Button steak_plus_button1;
	static public TextView steak_count_text1;

	Button steak_minus_button2;
	Button steak_plus_button2;
	TextView steak_count_text2;

	Button steak_minus_button3;
	Button steak_plus_button3;
	TextView steak_count_text3;

	Button steak_minus_button4;
	Button steak_plus_button4;
	TextView steak_count_text4;

	static int steak_count_value1 = 0;
	static int steak_count_value2 = 0;
	static int steak_count_value3 = 0;
	static int steak_count_value4 = 0;

	static public int index1 = 0;
	static public int index2 = 1;
	static public int index3 = 2;
	static public int index4 = 3;

	static public int mainDish_arrayIndex[] = new int[20];
	LinearLayout my_layout;
	Context ctx;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		//ctx = getActivity();
	
//	my_layout = new LinearLayout(ctx); // fill fill 
//	LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,ViewGroup.LayoutParams.FILL_PARENT);
//	my_layout.setOrientation(LinearLayout.VERTICAL); // vertical
//	 
//	TextView mytext1 = new TextView(ctx); // wrap wrap
//	LinearLayout.LayoutParams lptext = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);				
//	lptext.gravity = Gravity.CENTER; // gravity center
//	mytext1.setCompoundDrawablePadding(5);
//
//	Drawable drawableTop1 = getResources().getDrawable(R.drawable.steak1);
//	
//	mytext1.setCompoundDrawables(null, drawableTop1, null, null); //(left, top, right, bottom);
//	mytext1.setText(" krName : �ӽ��� ������ ������ũ �� �� \n\n enName : Mushroom Sirloin Steak for You \n\n price: 29000 \n\n compose: �Ұ��, ž������, ȣ�ֻ�, 250g \n\n detail: �ӽ��� �׷��̺� �ҽ��� ������ ������ ������ũ \n\n cookTime: 20�� \n\n");
//	mytext1.setTextColor(getResources().getColor(R.color.blue08));
//	mytext1.setTextSize(15);
//	mytext1.setTypeface(null, Typeface.BOLD);

	
	/*
	TextView mytext2 = new TextView(ctx); // wrap wrap
	LinearLayout.LayoutParams lptext2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);				
	lptext2.gravity = Gravity.CENTER; // gravity center
	mytext1.setCompoundDrawablePadding(5);
	
	Drawable drawableTop2 = getResources().getDrawable(R.drawable.suldo);
	
	mytext2.setCompoundDrawables(null, drawableTop2, null, null); //(left, top, right, bottom);
	mytext2.setText(" ���� , SIRLOIN \n\n �ƿ��� ������ ������ ä�� ����� ������ �㸮�κп��� �и��Ǵ� \n\n Top Sirloin(�Ǵ� Sirloun butt, �ѱ��� ������or����)�̶�� �����̸� \n\n �ٸ� ������ ���� ������ ���� �������� �ε巯���� ������ũ�� \n\n ����ϱ⿡ ǳ�̰� �����ϴ�. &apos;�ƿ��� ������&apos;�� �ƿ����� ��ǥ�ϴ� \n\n ��ǥ �޴��̱⵵ �մϴ�. \n\n KIDS LOVE AUSTRALIAN BEEF \n\n ���彺Ʈ�� ������ũ ������ ȣ�� û����� ȣ�ֿ����� ���� û���� \n\n ���忡�� �¾�� �������� �ƿ��鿡 ������ �������� �����ϰ� \n\n ���� �ް� �����ϰ� ���޵Ǵ� �����Դϴ�.");
	mytext2.setTextColor(getResources().getColor(R.color.green08));
	mytext2.setTextSize(15);
	mytext2.setTypeface(null, Typeface.BOLD);
	
	RatingBar myrating = new RatingBar(ctx);
	LinearLayout.LayoutParams lptext3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);				
	lptext3.gravity = Gravity.CENTER; // gravity center
	lptext3.setMargins(0, 30, 0, 0);
	myrating.setIsIndicator(true);
	
	Drawable drawableTop3 = getResources().getDrawable(R.layout.ratingbar_gold);
	
	myrating.setProgressDrawable(drawableTop3);
	myrating.setRating(4);
	myrating.setStepSize(1);
	*/

//	my_layout.addView(mytext2);
//	my_layout.addView(myrating);

	View view = inflater.inflate(R.layout.korean_fragment_steak, container,
				false);


	
	
		ImageView steak_image1 = (ImageView) view
				.findViewById(R.id.steak_image1);
		ImageView steak_image2 = (ImageView) view
				.findViewById(R.id.steak_image2);
		ImageView steak_image3 = (ImageView) view
				.findViewById(R.id.steak_image3);
		ImageView steak_image4 = (ImageView) view
				.findViewById(R.id.steak_image4);

		ScrollView steak_contents_popup1 = (ScrollView) view
				.findViewById(R.id.steak_contents_popup1);
		ScrollView steak_contents_popup2 = (ScrollView) view
				.findViewById(R.id.steak_contents_popup2);
		ScrollView steak_contents_popup3 = (ScrollView) view
				.findViewById(R.id.steak_contents_popup3);
		ScrollView steak_contents_popup4 = (ScrollView) view
				.findViewById(R.id.steak_contents_popup4);

		final View layout = inflater.inflate(R.layout.steak1_contents,
				(ViewGroup) steak_contents_popup1);
		final View layout2 = inflater.inflate(R.layout.steak2_contents,
				(ViewGroup) steak_contents_popup2);
		final View layout3 = inflater.inflate(R.layout.steak3_contents,
				(ViewGroup) steak_contents_popup3);
		final View layout4 = inflater.inflate(R.layout.steak4_contents,
				(ViewGroup) steak_contents_popup4);

		steak_minus_button1 = (Button) view
				.findViewById(R.id.steak_minus_button1);
		steak_plus_button1 = (Button) view
				.findViewById(R.id.steak_plus_button1);
		steak_count_text1 = (TextView) view
				.findViewById(R.id.steak_count_text1);

		steak_minus_button2 = (Button) view
				.findViewById(R.id.steak_minus_button2);
		steak_plus_button2 = (Button) view
				.findViewById(R.id.steak_plus_button2);
		steak_count_text2 = (TextView) view
				.findViewById(R.id.steak_count_text2);

		steak_minus_button3 = (Button) view
				.findViewById(R.id.steak_minus_button3);
		steak_plus_button3 = (Button) view
				.findViewById(R.id.steak_plus_button3);
		steak_count_text3 = (TextView) view
				.findViewById(R.id.steak_count_text3);

		steak_plus_button4 = (Button) view
				.findViewById(R.id.steak_plus_button4);
		steak_minus_button4 = (Button) view
				.findViewById(R.id.steak_minus_button4);

		// steak_plus_button4 = (Button)
		// view.findViewById(R.id.steak_plus_button4);
		steak_count_text4 = (TextView) view
				.findViewById(R.id.steak_count_text4);

		steak_count_text1.setText("" + steak_count_value1);
		steak_count_text2.setText("" + steak_count_value2);
		steak_count_text3.setText("" + steak_count_value3);
		steak_count_text4.setText("" + steak_count_value4);

		for (int num1 = 0; num1 < 20; num1++) {
			mainDish_arrayIndex[num1] = -1;
		}

		// ������ũ ���̳ʽ� ��ư1

		steak_minus_button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0,
						0, 1f);

				if (steak_count_value1 != 0) {
					steak_count_value1--;
					steak_count_text1.setText("" + steak_count_value1);
					Korean_Fragment_Steak.steak_numInt1 = steak_count_value1;
					Korean_Fragment_Steak.steak_total1 = (29000 * Korean_Fragment_Steak.steak_numInt1);
					Korean_Fragment_Steak.steak_final_total = Korean_Fragment_Steak.steak_total1
							+ Korean_Fragment_Steak.steak_total2
							+ Korean_Fragment_Steak.steak_total3
							+ Korean_Fragment_Steak.steak_total4;

					try {
						if (mainDish_arrayIndex[0] != -1)
							Korean_Activity.alist.remove(mainDish_arrayIndex[0]);
					} catch (Exception e) {
					}
					mainDish_arrayIndex[0] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Korean_Fragment_Steak.steak1_name,
							Korean_Fragment_Steak.steak_numInt1,
							Korean_Fragment_Steak.steak_total1));
					if (steak_count_value1 == 0) {
						mainDish_arrayIndex[0] = -1;
					}
				}
			}
		});

		// ������ũ �÷��� ��ư1

		steak_plus_button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0,
						0, 1f);

				steak_count_value1++;
				steak_count_text1.setText("" + steak_count_value1);
				Korean_Fragment_Steak.steak_numInt1 = steak_count_value1;
				Korean_Fragment_Steak.steak_total1 = (29000 * Korean_Fragment_Steak.steak_numInt1);
				Korean_Fragment_Steak.steak_final_total = Korean_Fragment_Steak.steak_total1
						+ Korean_Fragment_Steak.steak_total2
						+ Korean_Fragment_Steak.steak_total3
						+ Korean_Fragment_Steak.steak_total4;

				if (steak_count_value1 >= 2)
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(mainDish_arrayIndex[0]);
					} catch (Exception e) {
					}
				mainDish_arrayIndex[0] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Korean_Fragment_Steak.steak1_name,
						Korean_Fragment_Steak.steak_numInt1,
						Korean_Fragment_Steak.steak_total1));
			}
		});

		steak_minus_button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0,
						0, 1f);

				if (steak_count_value2 != 0) {
					steak_count_value2--;
					steak_count_text2.setText("" + steak_count_value2);
					Korean_Fragment_Steak.steak_numInt2 = steak_count_value2;
					Korean_Fragment_Steak.steak_total2 = (34500 * Korean_Fragment_Steak.steak_numInt2);
					Korean_Fragment_Steak.steak_final_total = Korean_Fragment_Steak.steak_total1
							+ Korean_Fragment_Steak.steak_total2
							+ Korean_Fragment_Steak.steak_total3
							+ Korean_Fragment_Steak.steak_total4;

					try {
						if (mainDish_arrayIndex[1] != -1)
							Korean_Activity.alist.remove(mainDish_arrayIndex[1]);
					} catch (Exception e) {
					}
					mainDish_arrayIndex[1] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Korean_Fragment_Steak.steak2_name,
							Korean_Fragment_Steak.steak_numInt2,
							Korean_Fragment_Steak.steak_total2));
					if (steak_count_value2 == 0) {
						mainDish_arrayIndex[1] = -1;
					}
				}
			}
		});

		steak_plus_button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0,
						0, 1f);

				steak_count_value2++;
				steak_count_text2.setText("" + steak_count_value2);
				Korean_Fragment_Steak.steak_numInt2 = steak_count_value2;
				Korean_Fragment_Steak.steak_total2 = (34500 * Korean_Fragment_Steak.steak_numInt2);
				Korean_Fragment_Steak.steak_final_total = Korean_Fragment_Steak.steak_total1
						+ Korean_Fragment_Steak.steak_total2
						+ Korean_Fragment_Steak.steak_total3
						+ Korean_Fragment_Steak.steak_total4;

				if (steak_count_value2 >= 2)
				
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(mainDish_arrayIndex[1]);
					} catch (Exception e) {
					}
				mainDish_arrayIndex[1] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Korean_Fragment_Steak.steak2_name,
						Korean_Fragment_Steak.steak_numInt2,
						Korean_Fragment_Steak.steak_total2));
				
			}
		});

		steak_minus_button3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0,
						0, 1f);

				if (steak_count_value3 != 0) {
					steak_count_value3--;
					steak_count_text3.setText("" + steak_count_value3);
					Korean_Fragment_Steak.steak_numInt3 = steak_count_value3;
					Korean_Fragment_Steak.steak_total3 = (38000 * Korean_Fragment_Steak.steak_numInt3);
					Korean_Fragment_Steak.steak_final_total = Korean_Fragment_Steak.steak_total1
							+ Korean_Fragment_Steak.steak_total2
							+ Korean_Fragment_Steak.steak_total3
							+ Korean_Fragment_Steak.steak_total4;

					try {
						if (mainDish_arrayIndex[2] != -1)
							Korean_Activity.alist.remove(mainDish_arrayIndex[2]);
					} catch (Exception e) {
					}
					mainDish_arrayIndex[2] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Korean_Fragment_Steak.steak3_name,
							Korean_Fragment_Steak.steak_numInt3,
							Korean_Fragment_Steak.steak_total3));
					if (steak_count_value3 == 0) {
						mainDish_arrayIndex[2] = -1;
					}
				}
			}
		});

		steak_plus_button3.setOnClickListener(new OnClickListener() {


			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0,
						0, 1f);
				steak_count_value3++;
				steak_count_text3.setText("" + steak_count_value3);
				Korean_Fragment_Steak.steak_numInt3 = steak_count_value3;
				Korean_Fragment_Steak.steak_total3 = (38000 * Korean_Fragment_Steak.steak_numInt3);
				Korean_Fragment_Steak.steak_final_total = Korean_Fragment_Steak.steak_total1
						+ Korean_Fragment_Steak.steak_total2
						+ Korean_Fragment_Steak.steak_total3
						+ Korean_Fragment_Steak.steak_total4;

				if (steak_count_value3 >= 2)
				
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(mainDish_arrayIndex[2]);
					} catch (Exception e) {
					}
				mainDish_arrayIndex[2] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Korean_Fragment_Steak.steak3_name,
						Korean_Fragment_Steak.steak_numInt3,
						Korean_Fragment_Steak.steak_total3));
				
			}
		});

		steak_minus_button4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0,
						0, 1f);
				if (steak_count_value4 != 0) {
					steak_count_value4--;
					steak_count_text4.setText("" + steak_count_value4);
					Korean_Fragment_Steak.steak_numInt4 = steak_count_value4;
					Korean_Fragment_Steak.steak_total4 = (36500 * Korean_Fragment_Steak.steak_numInt4);
					Korean_Fragment_Steak.steak_final_total = Korean_Fragment_Steak.steak_total1
							+ Korean_Fragment_Steak.steak_total2
							+ Korean_Fragment_Steak.steak_total3
							+ Korean_Fragment_Steak.steak_total4;

					try {
						if (mainDish_arrayIndex[3] != -1)
							Korean_Activity.alist.remove(mainDish_arrayIndex[3]);
					} catch (Exception e) {
					}
					mainDish_arrayIndex[3] = Korean_Activity.alist.size();
					Korean_Activity.adapter.add(new CData3(
							Korean_Activity.context,
							Korean_Fragment_Steak.steak4_name,
							Korean_Fragment_Steak.steak_numInt4,
							Korean_Fragment_Steak.steak_total4));
					if (steak_count_value4 == 0) {
						mainDish_arrayIndex[3] = -1;
					}

				}
			}
		});

		steak_plus_button4.setOnClickListener(new OnClickListener() {

			int count1 = 3;

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Korean_Activity.sound.play(Korean_Activity.soundId2, 1f, 1f, 0,
						0, 1f);
				steak_count_value4++;
				steak_count_text4.setText("" + steak_count_value4);
				Korean_Fragment_Steak.steak_numInt4 = steak_count_value4;
				Korean_Fragment_Steak.steak_total4 = (36500 * Korean_Fragment_Steak.steak_numInt4);
				Korean_Fragment_Steak.steak_final_total = Korean_Fragment_Steak.steak_total1
						+ Korean_Fragment_Steak.steak_total2
						+ Korean_Fragment_Steak.steak_total3
						+ Korean_Fragment_Steak.steak_total4;

				if (steak_count_value4 >= 2)
				
					try {
						// if(arrayIndex[1] != -1)
						Korean_Activity.alist.remove(mainDish_arrayIndex[3]);
					} catch (Exception e) {
				
					}
				
				mainDish_arrayIndex[3] = Korean_Activity.alist.size();
				// Log.e(TAG,""+arrayIndex[1]);
				Korean_Activity.adapter.add(new CData3(Korean_Activity.context,
						Korean_Fragment_Steak.steak4_name,
						Korean_Fragment_Steak.steak_numInt4,
						Korean_Fragment_Steak.steak_total4));
				
			}
		});

		steak_image1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				/*
				my_layout = new LinearLayout(ctx); // fill fill 
				LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,ViewGroup.LayoutParams.FILL_PARENT);
				my_layout.setOrientation(LinearLayout.VERTICAL); // vertical
				 
				TextView mytext1 = new TextView(ctx); // wrap wrap
				LinearLayout.LayoutParams lptext = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);				
				lptext.gravity = Gravity.CENTER; // gravity center
				mytext1.setCompoundDrawablePadding(5);

				Drawable drawableTop1 = getResources().getDrawable(R.drawable.steak1);
				
				mytext1.setCompoundDrawables(null, drawableTop1, null, null); //(left, top, right, bottom);
				mytext1.setText(" krName : �ӽ��� ������ ������ũ �� �� \n\n enName : Mushroom Sirloin Steak for You \n\n price: 29000 \n\n compose: �Ұ��, ž������, ȣ�ֻ�, 250g \n\n detail: �ӽ��� �׷��̺� �ҽ��� ������ ������ ������ũ \n\n cookTime: 20�� \n\n");
				mytext1.setTextColor(getResources().getColor(R.color.blue08));
				mytext1.setTextSize(15);
				mytext1.setTypeface(null, Typeface.BOLD);
				*/
				
				// Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
				AlertDialog ad = new AlertDialog.Builder(getActivity())
						.create();
				ad.setTitle("������"); // �˾�â Ÿ��Ʋ��
				ad.setView(layout);
				//ad.setView(layout);
				// ad.setMessage("FinessShot"); //�˾�â ����
				ad.setButton(getActivity().getString(R.string.exit_name),
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dlg, int sumthin) {
								// �ݱ� ��ư�� ������ �ƹ��͵� ���ϰ� �ݱ� ������ �׳� ���
								// dlg.dismiss();
								((ViewGroup) layout.getParent())
										.removeView(layout);
							}
						});
				ad.show(); // �˾�â ������
			}
		});

				
			/*	
			my_layout = new LinearLayout(ctx); // fill fill 
			LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,ViewGroup.LayoutParams.FILL_PARENT);
			my_layout.setOrientation(LinearLayout.VERTICAL); // vertical
			 
			TextView mytext1 = new TextView(ctx); // wrap wrap
			LinearLayout.LayoutParams lptext = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);				
			lptext.gravity = Gravity.CENTER; // gravity center
			mytext1.setCompoundDrawablePadding(5);

			Drawable drawableTop1 = getResources().getDrawable(R.drawable.steak1);
			
			mytext1.setCompoundDrawables(null, drawableTop1, null, null); //(left, top, right, bottom);
			mytext1.setText(" krName : �ӽ��� ������ ������ũ �� �� \n\n enName : Mushroom Sirloin Steak for You \n\n price: 29000 \n\n compose: �Ұ��, ž������, ȣ�ֻ�, 250g \n\n detail: �ӽ��� �׷��̺� �ҽ��� ������ ������ ������ũ \n\n cookTime: 20�� \n\n");
			mytext1.setTextColor(getResources().getColor(R.color.blue08));
			mytext1.setTextSize(15);
			mytext1.setTypeface(null, Typeface.BOLD);
			 */
			///////////////////////////
			/*
			TextView mytext2 = new TextView(ctx); // wrap wrap
			LinearLayout.LayoutParams lptext2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);				
			lptext2.gravity = Gravity.CENTER; // gravity center
			mytext1.setCompoundDrawablePadding(5);
			
			Drawable drawableTop2 = getResources().getDrawable(R.drawable.suldo);
			
			mytext2.setCompoundDrawables(null, drawableTop2, null, null); //(left, top, right, bottom);
			mytext2.setText(" ���� , SIRLOIN \n\n �ƿ��� ������ ������ ä�� ����� ������ �㸮�κп��� �и��Ǵ� \n\n Top Sirloin(�Ǵ� Sirloun butt, �ѱ��� ������or����)�̶�� �����̸� \n\n �ٸ� ������ ���� ������ ���� �������� �ε巯���� ������ũ�� \n\n ����ϱ⿡ ǳ�̰� �����ϴ�. &apos;�ƿ��� ������&apos;�� �ƿ����� ��ǥ�ϴ� \n\n ��ǥ �޴��̱⵵ �մϴ�. \n\n KIDS LOVE AUSTRALIAN BEEF \n\n ���彺Ʈ�� ������ũ ������ ȣ�� û����� ȣ�ֿ����� ���� û���� \n\n ���忡�� �¾�� �������� �ƿ��鿡 ������ �������� �����ϰ� \n\n ���� �ް� �����ϰ� ���޵Ǵ� �����Դϴ�.");
			mytext2.setTextColor(getResources().getColor(R.color.green08));
			mytext2.setTextSize(15);
			mytext2.setTypeface(null, Typeface.BOLD);
			
			RatingBar myrating = new RatingBar(ctx);
			LinearLayout.LayoutParams lptext3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);				
			lptext3.gravity = Gravity.CENTER; // gravity center
			lptext3.setMargins(0, 30, 0, 0);
			myrating.setIsIndicator(true);
			
			Drawable drawableTop3 = getResources().getDrawable(R.layout.ratingbar_gold);
			
			myrating.setProgressDrawable(drawableTop3);
			myrating.setRating(4);
			myrating.setStepSize(1);
			*/
			//my_layout.addView(mytext1);
			
			/*
			my_layout.addView(mytext2);
			my_layout.addView(myrating);
			*/
			

		steak_image2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
				AlertDialog ad = new AlertDialog.Builder(getActivity())
						.create();
				ad.setTitle("������"); // �˾�â Ÿ��Ʋ��
				ad.setView(layout2);
				// ad.setMessage("FinessShot"); //�˾�â ����
				ad.setButton(getActivity().getString(R.string.exit_name),
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dlg, int sumthin) {
								// �ݱ� ��ư�� ������ �ƹ��͵� ���ϰ� �ݱ� ������ �׳� ���
								// dlg.dismiss();
								((ViewGroup) layout2.getParent())
										.removeView(layout2);
							}
						});
				ad.show(); // �˾�â ������
			}
		});

		steak_image3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
				AlertDialog ad = new AlertDialog.Builder(getActivity())
						.create();
				ad.setTitle("������"); // �˾�â Ÿ��Ʋ��
				ad.setView(layout3);
				// ad.setMessage("FinessShot"); //�˾�â ����
				ad.setButton(getActivity().getString(R.string.exit_name),
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dlg, int sumthin) {
								// �ݱ� ��ư�� ������ �ƹ��͵� ���ϰ� �ݱ� ������ �׳� ���
								// dlg.dismiss();
								((ViewGroup) layout3.getParent())
										.removeView(layout3);
							}
						});
				ad.show(); // �˾�â ������
			}
		});

		steak_image4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
				AlertDialog ad = new AlertDialog.Builder(getActivity())
						.create();
				ad.setTitle("������"); // �˾�â Ÿ��Ʋ��
				ad.setView(layout4);
				// ad.setMessage("FinessShot"); //�˾�â ����
				ad.setButton(getActivity().getString(R.string.exit_name),
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dlg, int sumthin) {
								// �ݱ� ��ư�� ������ �ƹ��͵� ���ϰ� �ݱ� ������ �׳� ���
								// dlg.dismiss();
								((ViewGroup) layout4.getParent())
										.removeView(layout4);
							}
						});
				ad.show(); // �˾�â ������
			}
		});

		return view;
	}
}
