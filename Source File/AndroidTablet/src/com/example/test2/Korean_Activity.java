package com.example.test2;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Korean_Activity extends Activity {

	public final static String TAG = "LOG";
	private static final int DIALOG_YES_NO_MESSAGE = 1;

	ListView list_spec;
	ListView list_spec2;
	
	static public DataAdapter adapter;
	static public DataAdapter2 adapter2;
	static public ArrayList<CData3> alist;
	static public ArrayList<CData4> alist2;
	static public Context context;
	static public String title10;
	static public String title11;
	
	public View exit_button;
	public View home_button;

	public View steak_button;
	public View appetizer_button;
	public View pasta_button;
	public View salad_button;
	public View seafood_button;
	public View order_button;

	public TextView steak_text1;
	public TextView steak_text2;
	public TextView steak_text3;
	public TextView steak_text4;

	public ImageView st_Im1;
	public ImageView st_Im2;
	public ImageView st_Im3;
	public ImageView st_Im4;

	public ImageView ap_Im1;
	public ImageView ap_Im2;
	public ImageView ap_Im3;
	public ImageView ap_Im4;
	public ImageView ap_Im5;
	public ImageView ap_Im6;

	public ImageView pa_Im1;
	public ImageView pa_Im2;
	public ImageView pa_Im3;
	public ImageView pa_Im4;
	public ImageView pa_Im5;

	public ImageView sa_Im1;
	public ImageView sa_Im2;
	public ImageView sa_Im3;
	public ImageView sa_Im4;

	public ImageView se_Im1;
	public ImageView se_Im2;
	public ImageView se_Im3;

	public ImageView fa_Im1;
	public ImageView fa_Im2;
	public ImageView fa_Im3;
	public ImageView fa_Im4;
	public ImageView fa_Im5;
	public ImageView fa_Im6;
	
	public ImageView specification_button;
	public ImageView call_button;
	
	public TextView appetizer_text1;
	public TextView appetizer_text2;
	public TextView appetizer_text3;
	public TextView appetizer_text4;
	public TextView appetizer_text5;
	public TextView appetizer_text6;

	public TextView pasta_text1;
	public TextView pasta_text2;
	public TextView pasta_text3;
	public TextView pasta_text4;
	public TextView pasta_text5;

	public TextView salad_text1;
	public TextView salad_text2;
	public TextView salad_text3;
	public TextView salad_text4;

	public TextView seafood_text1;
	public TextView seafood_text2;
	public TextView seafood_text3;
	
	public TextView favorite_text1;
	public TextView favorite_text2;
	public TextView favorite_text3;
	public TextView favorite_text4;
	public TextView favorite_text5;
	public TextView favorite_text6;
	
	static public TextView steak_specTitle1;
	static public TextView steak_specCount1;
	static public TextView steak_specValue1;
	
	static public TextView steak_specTitle2;
	static public TextView steak_specCount2;
	static public TextView steak_specValue2;

	static public TextView steak_specTitle3;
	static public TextView steak_specCount3;
	static public TextView steak_specValue3;
	
	static public TextView steak_specTitle4;
	static public TextView steak_specCount4;
	static public TextView steak_specValue4;
	
	static public String Steak_StarAvgValue1;
	static public String Steak_StarAvgValue2;
	static public String Steak_StarAvgValue3;
	static public String Steak_StarAvgValue4;
	
	int list1_num;
	int list2_num;
	int list3_num;
	int list4_num;
	int list5_num;

	int receivedInt1;
	int receivedInt2;
	int receivedInt3;
	int receivedInt4;
	int receivedInt5;

	TextView text_test1;
	TextView text_test2;
	TextView text_test3;

	Fragment fr = null;
	Fragment fr1 = null;
	Fragment fr2 = null;
	Fragment fr3 = null;
	Fragment fr4 = null;
	Fragment fr5 = null;
	Fragment fr6 = null;
	Fragment fr7 = null;

	boolean chkDownbmp_st;
	boolean chkDownbmp_ap;

	static public SoundPool sound;
	int soundId;
	static public int soundId2;
	int soundId3;
	int soundId4;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.korean_activity);

		Logo.at.add(this);

		sound = new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		soundId = sound.load(this, R.raw.button_touch1, 1);
		soundId2 = sound.load(this, R.raw.coin,0);
		soundId3 = sound.load(this, R.raw.menu, 1);
		soundId4 = sound.load(this, R.raw.dingdong,0);
		
		st_Im1 = (ImageView) findViewById(R.id.steak_image1);
		// st_Im1.setOnClickListener((OnClickListener) this);
		// st_Im1.setOnClickListener(this); // 이미지뷰를 버튼으로 어떻게 쓰냐
		st_Im2 = (ImageView) findViewById(R.id.steak_image2);
		st_Im3 = (ImageView) findViewById(R.id.steak_image3);
		st_Im4 = (ImageView) findViewById(R.id.steak_image4);

		ap_Im1 = (ImageView) findViewById(R.id.appetizer_image1);
		ap_Im2 = (ImageView) findViewById(R.id.appetizer_image2);
		ap_Im3 = (ImageView) findViewById(R.id.appetizer_image3);
		ap_Im4 = (ImageView) findViewById(R.id.appetizer_image4);
		ap_Im5 = (ImageView) findViewById(R.id.appetizer_image5);
		ap_Im6 = (ImageView) findViewById(R.id.appetizer_image6);

		pa_Im1 = (ImageView) findViewById(R.id.pasta_image1);
		pa_Im2 = (ImageView) findViewById(R.id.pasta_image2);
		pa_Im3 = (ImageView) findViewById(R.id.pasta_image3);
		pa_Im4 = (ImageView) findViewById(R.id.pasta_image4);
		pa_Im5 = (ImageView) findViewById(R.id.pasta_image5);

		sa_Im1 = (ImageView) findViewById(R.id.salad_image1);
		sa_Im2 = (ImageView) findViewById(R.id.salad_image2);
		sa_Im3 = (ImageView) findViewById(R.id.salad_image3);
		sa_Im4 = (ImageView) findViewById(R.id.salad_image4);

		se_Im1 = (ImageView) findViewById(R.id.seafood_image1);
		se_Im2 = (ImageView) findViewById(R.id.seafood_image2);
		se_Im3 = (ImageView) findViewById(R.id.seafood_image3);
		
		specification_button = (ImageView) findViewById(R.id.specification_button);
		call_button = (ImageView) findViewById(R.id.call_button);
		
		fr1 = new Korean_Fragment_Favorite();
		fr2 = new Korean_Fragment_Steak();
		fr3 = new Korean_Fragment_Appetizer();
		fr4 = new Korean_Fragment_Pasta();
		fr5 = new Korean_Fragment_Salad();
		fr6 = new Korean_Fragment_Seafood();
		fr7 = new Korean_Fragment_Blank();

		steak_text1 = (TextView) findViewById(R.id.steak_text1);
		steak_text2 = (TextView) findViewById(R.id.steak_text2);
		steak_text3 = (TextView) findViewById(R.id.steak_text3);
		steak_text4 = (TextView) findViewById(R.id.steak_text4);

		appetizer_text1 = (TextView) findViewById(R.id.appetizer_text1);
		appetizer_text2 = (TextView) findViewById(R.id.appetizer_text2);
		appetizer_text3 = (TextView) findViewById(R.id.appetizer_text3);
		appetizer_text4 = (TextView) findViewById(R.id.appetizer_text4);
		appetizer_text5 = (TextView) findViewById(R.id.appetizer_text5);
		appetizer_text6 = (TextView) findViewById(R.id.appetizer_text6);

		pasta_text1 = (TextView) findViewById(R.id.pasta_text1);
		pasta_text2 = (TextView) findViewById(R.id.pasta_text2);
		pasta_text3 = (TextView) findViewById(R.id.pasta_text3);
		pasta_text4 = (TextView) findViewById(R.id.pasta_text4);
		pasta_text5 = (TextView) findViewById(R.id.pasta_text5);

		salad_text1 = (TextView) findViewById(R.id.salad_text1);
		salad_text2 = (TextView) findViewById(R.id.salad_text2);
		salad_text3 = (TextView) findViewById(R.id.salad_text3);
		salad_text4 = (TextView) findViewById(R.id.salad_text4);

		seafood_text1 = (TextView) findViewById(R.id.seafood_text1);
		seafood_text2 = (TextView) findViewById(R.id.seafood_text2);
		seafood_text3 = (TextView) findViewById(R.id.seafood_text3);
		
		favorite_text1 = (TextView) findViewById(R.id.favorite_text1);
		favorite_text2 = (TextView) findViewById(R.id.favorite_text2);
		favorite_text3 = (TextView) findViewById(R.id.favorite_text3);
		favorite_text4 = (TextView) findViewById(R.id.favorite_text4);
		favorite_text5 = (TextView) findViewById(R.id.favorite_text5);
		favorite_text6 = (TextView) findViewById(R.id.favorite_text6);

		chkDownbmp_st = false;
		chkDownbmp_ap = false;

		list_spec = (ListView) findViewById(R.id.list_spec);
		list_spec2 = (ListView) findViewById(R.id.list_spec2);
		
		
		
		//steak_specText1.setText(Korean_Fragment_Steak.steak1_name);
		
		
		exit_button = findViewById(R.id.exit_button);
		exit_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				sound.play(soundId, 1f, 1f, 0, 0, 1f);
				showDialog(DIALOG_YES_NO_MESSAGE);
			}
		});

		home_button = findViewById(R.id.home_button);
		home_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				sound.play(soundId, 1f, 1f, 0, 0, 1f);
				Intent intent = new Intent(Korean_Activity.this, Intro.class);
				startActivity(intent);
				finish();
			}
		});


		order_button = findViewById(R.id.order_button);
/*
		order_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				Intent intent = getIntent(); // A가 전달할 Intent를 getIntent()는 함수로
												// 참조하게 된다.

			}
		});
//*/
		
		call_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				// TODO Auto-generated method stub
				sound.play(soundId4, 1f, 1f, 0, 0, 1f);
				/*
				final AlertDialog alert = new builder.create();

				//AlertDialog.Builder alert = new AlertDialog.Builder(Korean_Activity.this);
				alert.setOnShowListener(new DialogInterface.OnShowListener() {
				    @Override
				    public void onShow(DialogInterface dialog) {
				        Button btnPositive = alert.getButton(Dialog.BUTTON_POSITIVE);
				        btnPositive.setTextSize(15);

				        Button btnNegative = alert.getButton(Dialog.BUTTON_NEGATIVE);
				        btnNegative.setTextSize(15);
				    }
				    
					return alert;
				});
*/
	        	
				AlertDialog.Builder alert = new AlertDialog.Builder(Korean_Activity.this);
	        	 alert.setPositiveButton("종업원 콜.", new DialogInterface.OnClickListener() {
	        	     @Override
	        	     public void onClick(DialogInterface dialog, int which) {
	        	     dialog.dismiss();     //닫기
	        	     }
	        	 });
	        	 
	        	 try{

						sendJsonToServer_call_order call_order;
						call_order = new sendJsonToServer_call_order();
						call_order.execute("http://117.16.231.212:8010/callEmployee");
						
	        	 }catch(Exception e){
	        		e.printStackTrace();
	        	 }
	        	 alert.show();

			}
		});
		
		specification_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
	          {
				sound.play(soundId3, 1f, 1f, 0, 0, 1f);
		        	 AlertDialog.Builder alert = new AlertDialog.Builder(Korean_Activity.this);
		        	 alert.setPositiveButton("주문 내역 확인", new DialogInterface.OnClickListener() {
		        	     @Override
		        	     public void onClick(DialogInterface dialog, int which) {
		        	     dialog.dismiss();     //닫기
		        	     }
		        	 });
		        	 
		        	 int total_spec = Korean_Fragment_Steak.steak_final_total +Korean_Fragment_Appetizer.appetizer_final_total
		        			 +Korean_Fragment_Pasta.pasta_final_total +Korean_Fragment_Salad.salad_final_total +Korean_Fragment_Seafood.seafood_final_total;
		        	 
		        	 alert.setMessage("스테이크 총 가격 : "+Korean_Fragment_Steak.steak_final_total +"\n\n"
		        			 +"애피타이저 총 가격 : "+Korean_Fragment_Appetizer.appetizer_final_total +"\n\n"
		        			 +"파스타 총 가격 : "+Korean_Fragment_Pasta.pasta_final_total +"\n\n"
		        			 +"샐러드 총 가격 : "+Korean_Fragment_Salad.salad_final_total +"\n\n"
		        			 +"씨푸드 총 가격 : "+Korean_Fragment_Seafood.seafood_final_total +"\n\n\n"
		        			 +"--------------------------------------------------------\n\n"
		        			 +"총 가격 : " +total_spec +"\n\n"
		        			 );
		        	 
		        	 	 alert.show();
		}
		});
			
		
		if (findViewById(R.id.fragment_container) != null) {

			if (savedInstanceState != null) {
				return;
			}
			/*
			 * Korean_Fragment_Steak firstFragment = new
			 * Korean_Fragment_Steak();
			 * firstFragment.setArguments(getIntent().getExtras());
			 * getFragmentManager().beginTransaction()
			 * .add(R.id.fragment_container, firstFragment).commit(); //
			 */
			Korean_Fragment_Blank firstFragment = new Korean_Fragment_Blank();
			firstFragment.setArguments(getIntent().getExtras());
			getFragmentManager().beginTransaction()
					.add(R.id.fragment_container, firstFragment).commit();

		}
		
		
		alist = new ArrayList<CData3>();
		alist2 = new ArrayList<CData4>();
		
		adapter = new DataAdapter(this,alist);
		adapter2 = new DataAdapter2(this,alist2);
		
		list_spec.setAdapter(adapter);
		list_spec2.setAdapter(adapter2);
		
		list_spec.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {	
				CData3 data = (CData3)arg0.getAdapter().getItem(arg2);
				title10 = data.getTitle();
				Toast.makeText(arg0.getContext(), title10, Toast.LENGTH_SHORT).show();
			}
		});	
		
		context = this;
		
		list_spec2.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {	
				CData4 data = (CData4)arg0.getAdapter().getItem(arg2);
				title11 = data.getTitle();
				Toast.makeText(arg0.getContext(), title11, Toast.LENGTH_SHORT).show();
			}
		});	
		
		context = this;
	
		/*
		adapter.add(new CData(this,Korean_Fragment_Steak.steak2_name, Korean_Fragment_Steak.steak_numInt2, Korean_Fragment_Steak.steak_total2));
		adapter.add(new CData(this,Korean_Fragment_Steak.steak3_name, Korean_Fragment_Steak.steak_numInt3, Korean_Fragment_Steak.steak_total3));
		adapter.add(new CData(this,Korean_Fragment_Steak.steak4_name, Korean_Fragment_Steak.steak_numInt4, Korean_Fragment_Steak.steak_total4));
		*/
		
		
	}
	
	/*
	 */

	
public void order_OnClick(View v){
	

	switch( v.getId()){
	
	case R.id.order_button:
		
		
		sound.play(soundId, 1f, 1f, 0, 0, 1f);
		//final Intent intent = new Intent(this,Korean_Table_Status.class);
		
		final Intent intent = new Intent(this,Korean_OrderDetail.class);
		
		
		AlertDialog.Builder alert_confirm = new AlertDialog.Builder(Korean_Activity.this);
		alert_confirm.setMessage("주문내역을 확인하셨나요? ^ㅇ^ \n\n\n\n ---------------------------------------------------------------------------\n\n\n\n 다음단계로 이동하시겠습니까? (^_^)").setCancelable(false).setPositiveButton("확인",
		new DialogInterface.OnClickListener() {
		    @Override
		    public void onClick(DialogInterface dialog, int which) {
		        // 'YES'
		    	
		    	try{
					intent.putExtra("steak_name1", Korean_Fragment_Steak.steak1_name);
					intent.putExtra("steak_name2", Korean_Fragment_Steak.steak2_name);
					intent.putExtra("steak_name3", Korean_Fragment_Steak.steak3_name);
					intent.putExtra("steak_name4", Korean_Fragment_Steak.steak4_name);
					
					intent.putExtra("steak_num1", Korean_Fragment_Steak.steak_numInt1);
					intent.putExtra("steak_num2", Korean_Fragment_Steak.steak_numInt2);
					intent.putExtra("steak_num3", Korean_Fragment_Steak.steak_numInt3);
					intent.putExtra("steak_num4", Korean_Fragment_Steak.steak_numInt4);
					
					intent.putExtra("steak_tval1",Korean_Fragment_Steak.steak_total1);
					intent.putExtra("steak_tval2",Korean_Fragment_Steak.steak_total2);
					intent.putExtra("steak_tval3",Korean_Fragment_Steak.steak_total3);
					intent.putExtra("steak_tval4",Korean_Fragment_Steak.steak_total4);
					intent.putExtra("steak_tval5",Korean_Fragment_Steak.steak_final_total);
					
					intent.putExtra("appetizer_name1", Korean_Fragment_Appetizer.appetizer1_name);
					intent.putExtra("appetizer_name2", Korean_Fragment_Appetizer.appetizer2_name);
					intent.putExtra("appetizer_name3", Korean_Fragment_Appetizer.appetizer3_name);
					intent.putExtra("appetizer_name4", Korean_Fragment_Appetizer.appetizer4_name);
					intent.putExtra("appetizer_name5", Korean_Fragment_Appetizer.appetizer5_name);
					intent.putExtra("appetizer_name6", Korean_Fragment_Appetizer.appetizer6_name);
						
					intent.putExtra("appetizer_num1", Korean_Fragment_Appetizer.appetizer_numInt1);
					intent.putExtra("appetizer_num2", Korean_Fragment_Appetizer.appetizer_numInt2);
					intent.putExtra("appetizer_num3", Korean_Fragment_Appetizer.appetizer_numInt3);
					intent.putExtra("appetizer_num4", Korean_Fragment_Appetizer.appetizer_numInt4);
					intent.putExtra("appetizer_num5", Korean_Fragment_Appetizer.appetizer_numInt5);
					intent.putExtra("appetizer_num6", Korean_Fragment_Appetizer.appetizer_numInt6);
					
					intent.putExtra("appetizer_tval1",Korean_Fragment_Appetizer.appetizer_total1);
					intent.putExtra("appetizer_tval2",Korean_Fragment_Appetizer.appetizer_total2);
					intent.putExtra("appetizer_tval3",Korean_Fragment_Appetizer.appetizer_total3);
					intent.putExtra("appetizer_tval4",Korean_Fragment_Appetizer.appetizer_total4);
					intent.putExtra("appetizer_tval5",Korean_Fragment_Appetizer.appetizer_total5);
					intent.putExtra("appetizer_tval6",Korean_Fragment_Appetizer.appetizer_total6);
					intent.putExtra("appetizer_tval7",Korean_Fragment_Appetizer.appetizer_final_total);
				
					intent.putExtra("pasta_name1",Korean_Fragment_Pasta.pasta1_name);
					intent.putExtra("pasta_name2",Korean_Fragment_Pasta.pasta2_name);
					intent.putExtra("pasta_name3",Korean_Fragment_Pasta.pasta3_name);
					intent.putExtra("pasta_name4",Korean_Fragment_Pasta.pasta4_name);
					intent.putExtra("pasta_name5",Korean_Fragment_Pasta.pasta5_name);
					
					intent.putExtra("pasta_num1",Korean_Fragment_Pasta.pasta_numInt1);
					intent.putExtra("pasta_num2",Korean_Fragment_Pasta.pasta_numInt2);
					intent.putExtra("pasta_num3",Korean_Fragment_Pasta.pasta_numInt3);
					intent.putExtra("pasta_num4",Korean_Fragment_Pasta.pasta_numInt4);
					intent.putExtra("pasta_num5",Korean_Fragment_Pasta.pasta_numInt5);
					
					intent.putExtra("pasta_tval1",Korean_Fragment_Pasta.pasta_total1);
					intent.putExtra("pasta_tval2",Korean_Fragment_Pasta.pasta_total2);
					intent.putExtra("pasta_tval3",Korean_Fragment_Pasta.pasta_total3);
					intent.putExtra("pasta_tval4",Korean_Fragment_Pasta.pasta_total4);
					intent.putExtra("pasta_tval5",Korean_Fragment_Pasta.pasta_total5);
					intent.putExtra("pasta_tval6",Korean_Fragment_Pasta.pasta_final_total);
					
					intent.putExtra("salad_name1",Korean_Fragment_Salad.salad1_name);
					intent.putExtra("salad_name2",Korean_Fragment_Salad.salad2_name);
					intent.putExtra("salad_name3",Korean_Fragment_Salad.salad3_name);
					intent.putExtra("salad_name4",Korean_Fragment_Salad.salad4_name);
					
					intent.putExtra("salad_num1",Korean_Fragment_Salad.salad_numInt1);
					intent.putExtra("salad_num2",Korean_Fragment_Salad.salad_numInt2);
					intent.putExtra("salad_num3",Korean_Fragment_Salad.salad_numInt3);
					intent.putExtra("salad_num4",Korean_Fragment_Salad.salad_numInt4);
					
					intent.putExtra("salad_tval1",Korean_Fragment_Salad.salad_total1);
					intent.putExtra("salad_tval2",Korean_Fragment_Salad.salad_total2);
					intent.putExtra("salad_tval3",Korean_Fragment_Salad.salad_total3);
					intent.putExtra("salad_tval4",Korean_Fragment_Salad.salad_total4);
					intent.putExtra("salad_tval5",Korean_Fragment_Salad.salad_final_total);
					
					
					intent.putExtra("seafood_name1",Korean_Fragment_Seafood.seafood1_name);
					intent.putExtra("seafood_name2",Korean_Fragment_Seafood.seafood2_name);
					intent.putExtra("seafood_name3",Korean_Fragment_Seafood.seafood3_name);
					
					intent.putExtra("seafood_num1",Korean_Fragment_Seafood.seafood_numInt1);
					intent.putExtra("seafood_num2",Korean_Fragment_Seafood.seafood_numInt2);
					intent.putExtra("seafood_num3",Korean_Fragment_Seafood.seafood_numInt3);
					
					intent.putExtra("seafood_tval1",Korean_Fragment_Seafood.seafood_total1);
					intent.putExtra("seafood_tval2",Korean_Fragment_Seafood.seafood_total2);
					intent.putExtra("seafood_tval3",Korean_Fragment_Seafood.seafood_total3);
					intent.putExtra("seafood_tval4",Korean_Fragment_Seafood.seafood_final_total);
					
				}
				catch(Exception e){
					
				}
				
		    	startActivity(intent);
		    }
		}).setNegativeButton("취소",
		new DialogInterface.OnClickListener() {
		    @Override
		    public void onClick(DialogInterface dialog, int which) {
		        // 'No'
		    return;
		    }
		});
		AlertDialog alert = alert_confirm.create();
		alert.show();
	}
	}
		
	

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DIALOG_YES_NO_MESSAGE:
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("종료 대화상자")
					.setMessage("SMART ORDER 어플리케이션을 종료하시겠습니까?")
					.setCancelable(false)
					.setPositiveButton("YES",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {
									Korean_Activity.this.finish();

									for (int i = 0; i < Logo.at.size(); i++) {
										   Logo.at.get(i).finish();  //List가 Static 이므로, Class명.변수명.get으로 접근
										  }
									Korean_Fragment_Steak.steak_numInt1=0;
									Korean_Fragment_Steak.steak_numInt2=0;
									Korean_Fragment_Steak.steak_numInt3=0;
									Korean_Fragment_Steak.steak_numInt4=0;
								}
							})
					.setNegativeButton("NO",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int whichButton) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			return alert;
		}
		return null;
	}
	

	public void selectFragment(View view) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction fragmentTransaction = fm.beginTransaction();
		// fragmentTransaction.replace(R.id.fragment_container, fr);

		switch (view.getId()) {

		case R.id.favorite_button:
			// fr = new Korean_Fragment_Favorite();
			sound.play(soundId, 1f, 1f, 0, 0, 1f);
			
			DownloadImageTask favorite_image_down;
			ReadJSONFeed6 favorite_text_parsing;
			
			favorite_text_parsing = new ReadJSONFeed6();
			
			favorite_text_parsing
			.execute("http://117.16.231.212:8010/getBestMenus");

			
			fr = fr1;
			fragmentTransaction.replace(R.id.fragment_container, fr1, "fr");
			break;

		case R.id.steak_button:

			sound.play(soundId, 1f, 1f, 0, 0, 1f);
			
			ReadJSONFeed st_rr;
			DownloadImageTask st_dd;
			// if (chkDownbmp_st == false) {

			st_rr = new ReadJSONFeed();
			st_rr.execute("http://117.16.231.212:8010/menuFinder?category=%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%81%AC");

			fr = fr2;
			fragmentTransaction.replace(R.id.fragment_container, fr2, "fr");

			break;

		case R.id.appetizer_button:

			sound.play(soundId, 1f, 1f, 0, 0, 1f);
			
			DownloadImageTask dd;
			ReadJSONFeed2 rr;

			rr = new ReadJSONFeed2();
			rr.execute("http://117.16.231.212:8010/menuFinder?category=%EC%98%A4%EC%A7%80%ED%83%80%EC%9D%B4%EC%A0%80");

			fr = fr3;
			fragmentTransaction.replace(R.id.fragment_container, fr3, "fr");
			break;

		case R.id.pasta_button:

			sound.play(soundId, 1f, 1f, 0, 0, 1f);
			
			DownloadImageTask pasta_image_down;
			ReadJSONFeed3 pasta_text_parsing;

			pasta_text_parsing = new ReadJSONFeed3();
			pasta_text_parsing
					.execute("http://117.16.231.212:8010/menuFinder?category=%ED%8C%8C%EC%8A%A4%ED%83%80");

			/*
			 * pasta_image_down = new DownloadImageTask(pa_Im1);
			 * pasta_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/pasta/grid_20140919025312.png"
			 * );
			 * 
			 * pasta_image_down = new DownloadImageTask(pa_Im2);
			 * pasta_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/pasta/grid_20130523141209.png"
			 * );
			 * 
			 * pasta_image_down = new DownloadImageTask(pa_Im3);
			 * pasta_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/pasta/grid_20130523141225.png"
			 * );
			 * 
			 * pasta_image_down = new DownloadImageTask(pa_Im4);
			 * pasta_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/pasta/grid_20140919024959.png"
			 * );
			 * 
			 * pasta_image_down = new DownloadImageTask(pa_Im5);
			 * pasta_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/pasta/grid_20140919025200.png"
			 * ); //
			 */

			fr = fr4;
			fragmentTransaction.replace(R.id.fragment_container, fr4, "fr");
			break;

		case R.id.salad_button:
			
			sound.play(soundId, 1f, 1f, 0, 0, 1f);

			DownloadImageTask salad_image_down;
			ReadJSONFeed4 salad_text_parsing;

			salad_text_parsing = new ReadJSONFeed4();
			salad_text_parsing
					.execute("http://117.16.231.212:8010/menuFinder?category=%EC%83%90%EB%9F%AC%EB%93%9C");

			/*
			 * salad_image_down = new DownloadImageTask(sa_Im1);
			 * salad_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/salad/grid_20130426005111.png"
			 * );
			 * 
			 * salad_image_down = new DownloadImageTask(sa_Im2);
			 * salad_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/salad/grid_20130508133640.png"
			 * );
			 * 
			 * salad_image_down = new DownloadImageTask(sa_Im3);
			 * salad_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/salad/grid_20130426004516.png"
			 * );
			 * 
			 * salad_image_down = new DownloadImageTask(sa_Im4);
			 * salad_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/salad/grid_20130430165953.png"
			 * ); //
			 */
			fr = fr5;
			fragmentTransaction.replace(R.id.fragment_container, fr5, "fr");
			break;

		case R.id.seafood_button:

			sound.play(soundId, 1f, 1f, 0, 0, 1f);
			
			DownloadImageTask seafood_image_down;
			ReadJSONFeed5 seafood_text_parsing;

			seafood_text_parsing = new ReadJSONFeed5();
			seafood_text_parsing
					.execute("http://117.16.231.212:8010/menuFinder?category=%EC%94%A8%ED%91%B8%EB%93%9C");

			/*
			 * seafood_image_down = new DownloadImageTask(se_Im1);
			 * seafood_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/seafood/grid_20140707165521.png"
			 * );
			 * 
			 * seafood_image_down = new DownloadImageTask(se_Im2);
			 * seafood_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/seafood/grid_20130522183050.png"
			 * );
			 * 
			 * seafood_image_down = new DownloadImageTask(se_Im3);
			 * seafood_image_down.execute(
			 * "http://117.16.231.212:8010/images/menu/seafood/grid_20140919021831.png"
			 * ); //
			 */

			fr = fr6;
			fragmentTransaction.replace(R.id.fragment_container, fr6, "fr");
			break;
			

			
		}

		// FragmentManager fm = getFragmentManager(); FragmentTransaction
		// fragmentTransaction = fm.beginTransaction();
		fragmentTransaction.replace(R.id.fragment_container, fr);

		fragmentTransaction.addToBackStack(null);
		fragmentTransaction.commit();
	}

	private class ReadJSONFeed extends AsyncTask<String, String, String> {
		// 3 step will be executed. onPreExecute, doInBackground ,onPostExecute

		protected void onPreExecute() { // not use
		}

		@Override
		protected String doInBackground(String... urls) { // background work

			HttpClient httpclient = new DefaultHttpClient();
			StringBuilder builder = new StringBuilder();

			HttpGet httpget = new HttpGet(urls[0]);

			try {
				HttpResponse response = httpclient.execute(httpget);
				StatusLine statusLine = response.getStatusLine();
				int statusCode = statusLine.getStatusCode();

				if (statusCode == 200) {

					HttpEntity entity = response.getEntity();

					InputStream content = entity.getContent();

					BufferedReader reader = new BufferedReader(
							new InputStreamReader(content));

					String line;

					while ((line = reader.readLine()) != null) {
						builder.append(line);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return builder.toString();
		}

		protected void onPostExecute(String data) {

			steak_text1 = (TextView) findViewById(R.id.steak_text1);
			steak_text2 = (TextView) findViewById(R.id.steak_text2);
			steak_text3 = (TextView) findViewById(R.id.steak_text3);
			steak_text4 = (TextView) findViewById(R.id.steak_text4);

			String MenuInfo = "";
			String Steak_StarAvg1 ="";
			String Steak_StarAvg2 ="";
			String Steak_StarAvg3 ="";
			String Steak_StarAvg4 ="";

			try {

				JSONObject obj = new JSONObject(data);
				JSONArray jArr = obj.getJSONArray("data");

				for (int i = 0; i <= jArr.length(); i++) {
					JSONObject jObject0 = jArr.getJSONObject(i);

					MenuInfo += jObject0.getString("krName");
					MenuInfo += ("\n");
					MenuInfo += ("가격: ");
					MenuInfo += jObject0.getString("price");
					MenuInfo += ("\n");
					MenuInfo += ("재료: ");
					MenuInfo += jObject0.getString("compose");
					
					
					
					
					
					
					if (i == 0) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						MenuInfo += ("소고기, 탑서로인, 호주산");
						steak_text1.setText(MenuInfo);
						MenuInfo = "";

						Steak_StarAvg1 += jObject0.getString("starAvg");
						Log.e(TAG,"스테이크1 별점 : "+Steak_StarAvg1);
						Steak_StarAvgValue1 = Steak_StarAvg1;
					}

					if (i == 1) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						MenuInfo += ("소고기, 꽃등심, 호주산");
						steak_text2.setText(MenuInfo);
						MenuInfo = "";
						
						Steak_StarAvg2 += jObject0.getString("starAvg");
						Log.e(TAG,"스테이크2 별점 : "+Steak_StarAvg2);
						Steak_StarAvgValue2 = Steak_StarAvg2;
					}

					if (i == 2) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						MenuInfo += ("소고기, 안심, 호주산");
						steak_text3.setText(MenuInfo);
						MenuInfo = "";
						
						Steak_StarAvg3 += jObject0.getString("starAvg");
						Log.e(TAG,"스테이크3별점 : "+Steak_StarAvg3);
						Steak_StarAvgValue3 = Steak_StarAvg3;
					}

					if (i == 3) {
						MenuInfo = "";
						MenuInfo += ("우드 화이어 그릴 스테이크");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						MenuInfo += ("소고기, 채끝등심, 호주산");
						steak_text4.setText(MenuInfo);
						MenuInfo = "";
						
						Steak_StarAvg4 += jObject0.getString("starAvg");
						Log.e(TAG,"스테이크4 별점 : "+Steak_StarAvg4);
						Steak_StarAvgValue4 = Steak_StarAvg4;
					}

				}

			} catch (JSONException e) {
				e.printStackTrace();
			}

			if (MenuInfo.trim().length() > 0) {
			} else {
			}

			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// //////////////////////////

	private class ReadJSONFeed2 extends AsyncTask<String, String, String> {

		// 3 step will be executed. onPreExecute, doInBackground ,onPostExecute

		protected void onPreExecute() { // not use
		}

		@Override
		protected String doInBackground(String... urls) { // background work

			HttpClient httpclient = new DefaultHttpClient();
			StringBuilder builder = new StringBuilder();

			HttpGet httpget = new HttpGet(urls[0]);

			try {
				HttpResponse response = httpclient.execute(httpget);
				StatusLine statusLine = response.getStatusLine();
				int statusCode = statusLine.getStatusCode();

				if (statusCode == 200) {

					HttpEntity entity = response.getEntity();

					InputStream content = entity.getContent();

					BufferedReader reader = new BufferedReader(
							new InputStreamReader(content));

					String line;

					while ((line = reader.readLine()) != null) {
						builder.append(line);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return builder.toString();
		}

		protected void onPostExecute(String data) {

			appetizer_text1 = (TextView) findViewById(R.id.appetizer_text1);
			appetizer_text2 = (TextView) findViewById(R.id.appetizer_text2);
			appetizer_text3 = (TextView) findViewById(R.id.appetizer_text3);
			appetizer_text4 = (TextView) findViewById(R.id.appetizer_text4);
			appetizer_text5 = (TextView) findViewById(R.id.appetizer_text5);
			appetizer_text6 = (TextView) findViewById(R.id.appetizer_text6);

			String MenuInfo = "";

			try {

				JSONObject obj = new JSONObject(data);
				JSONArray jArr = obj.getJSONArray("data");

				for (int i = 0; i <= jArr.length(); i++) {
					JSONObject jObject0 = jArr.getJSONObject(i);

					MenuInfo += jObject0.getString("krName");
					MenuInfo += ("\n");
					MenuInfo += ("가격: ");
					MenuInfo += jObject0.getString("price");
					MenuInfo += ("\n");
					MenuInfo += ("재료: ");
					MenuInfo += jObject0.getString("compose");

					if (i == 0) {
						appetizer_text1.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 1) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						appetizer_text2.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 2) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						appetizer_text3.setText(MenuInfo);
						MenuInfo = "";
					}
					if (i == 3) {
						appetizer_text4.setText(MenuInfo);
						MenuInfo = "";
					}
					if (i == 4) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						MenuInfo += ("재료 : 돼지갈비, 프랑스산");
						appetizer_text5.setText(MenuInfo);
						MenuInfo = "";
					}
					if (i == 5) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						MenuInfo += ("재료 : 닭고기, 국내산");
						appetizer_text6.setText(MenuInfo);
						MenuInfo = "";
					}


				}

			} catch (JSONException e) {
				e.printStackTrace();
			}

			if (MenuInfo.trim().length() > 0) {
			} else {
			}
		}
	}

	// //////////////////

	private class ReadJSONFeed3 extends AsyncTask<String, String, String> {
		// 3 step will be executed. onPreExecute, doInBackground ,onPostExecute

		protected void onPreExecute() { // not use
		}

		@Override
		protected String doInBackground(String... urls) { // background work

			HttpClient httpclient = new DefaultHttpClient();
			StringBuilder builder = new StringBuilder();

			HttpGet httpget = new HttpGet(urls[0]);

			try {
				HttpResponse response = httpclient.execute(httpget);
				StatusLine statusLine = response.getStatusLine();
				int statusCode = statusLine.getStatusCode();

				if (statusCode == 200) {

					HttpEntity entity = response.getEntity();

					InputStream content = entity.getContent();

					BufferedReader reader = new BufferedReader(
							new InputStreamReader(content));

					String line;

					while ((line = reader.readLine()) != null) {
						builder.append(line);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return builder.toString();
		}

		protected void onPostExecute(String data) {

			pasta_text1 = (TextView) findViewById(R.id.pasta_text1);
			pasta_text2 = (TextView) findViewById(R.id.pasta_text2);
			pasta_text3 = (TextView) findViewById(R.id.pasta_text3);
			pasta_text4 = (TextView) findViewById(R.id.pasta_text4);
			pasta_text5 = (TextView) findViewById(R.id.pasta_text5);

			String MenuInfo = "";

			try {

				JSONObject obj = new JSONObject(data);
				JSONArray jArr = obj.getJSONArray("data");

				for (int i = 0; i <= jArr.length(); i++) {
					JSONObject jObject0 = jArr.getJSONObject(i);

					MenuInfo += jObject0.getString("krName");
					MenuInfo += ("\n");
					MenuInfo += ("가격: ");
					MenuInfo += jObject0.getString("price");
					MenuInfo += ("\n");
					MenuInfo += ("재료: ");
					MenuInfo += jObject0.getString("compose");

					if (i == 0) {
						pasta_text1.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 1) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						pasta_text2.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 2) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						pasta_text3.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 3) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						pasta_text4.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 4) {
						MenuInfo = "";
						MenuInfo += jObject0.getString("krName");
						MenuInfo += ("\n");
						MenuInfo += ("가격: ");
						MenuInfo += jObject0.getString("price");
						MenuInfo += ("\n");
						pasta_text5.setText(MenuInfo);
						MenuInfo = "";
					}
				}

			} catch (JSONException e) {
				e.printStackTrace();
			}

			if (MenuInfo.trim().length() > 0) {
			} else {
			}

			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private class ReadJSONFeed4 extends AsyncTask<String, String, String> {
		// 3 step will be executed. onPreExecute, doInBackground ,onPostExecute

		protected void onPreExecute() { // not use
		}

		@Override
		protected String doInBackground(String... urls) { // background work

			HttpClient httpclient = new DefaultHttpClient();
			StringBuilder builder = new StringBuilder();

			HttpGet httpget = new HttpGet(urls[0]);

			try {
				HttpResponse response = httpclient.execute(httpget);
				StatusLine statusLine = response.getStatusLine();
				int statusCode = statusLine.getStatusCode();

				if (statusCode == 200) {

					HttpEntity entity = response.getEntity();

					InputStream content = entity.getContent();

					BufferedReader reader = new BufferedReader(
							new InputStreamReader(content));

					String line;

					while ((line = reader.readLine()) != null) {
						builder.append(line);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return builder.toString();
		}

		protected void onPostExecute(String data) {

			salad_text1 = (TextView) findViewById(R.id.salad_text1);
			salad_text2 = (TextView) findViewById(R.id.salad_text2);
			salad_text3 = (TextView) findViewById(R.id.salad_text3);
			salad_text4 = (TextView) findViewById(R.id.salad_text4);

			String MenuInfo = "";

			try {

				JSONObject obj = new JSONObject(data);
				JSONArray jArr = obj.getJSONArray("data");

				for (int i = 0; i <= jArr.length(); i++) {
					JSONObject jObject0 = jArr.getJSONObject(i);

					MenuInfo += jObject0.getString("krName");
					MenuInfo += ("\n");
					MenuInfo += ("가격: ");
					MenuInfo += jObject0.getString("price");
					MenuInfo += ("\n");
					MenuInfo += ("재료: ");
					MenuInfo += jObject0.getString("compose");

					if (i == 0) {
						salad_text1.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 1) {
						salad_text2.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 2) {
						salad_text3.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 3) {
						salad_text4.setText(MenuInfo);
						MenuInfo = "";
					}

				}

			} catch (JSONException e) {
				e.printStackTrace();
			}

			if (MenuInfo.trim().length() > 0) {
			} else {
			}

			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private class ReadJSONFeed5 extends AsyncTask<String, String, String> {
		// 3 step will be executed. onPreExecute, doInBackground ,onPostExecute

		protected void onPreExecute() { // not use
		}

		@Override
		protected String doInBackground(String... urls) { // background work

			HttpClient httpclient = new DefaultHttpClient();
			StringBuilder builder = new StringBuilder();

			HttpGet httpget = new HttpGet(urls[0]);

			try {
				HttpResponse response = httpclient.execute(httpget);
				StatusLine statusLine = response.getStatusLine();
				int statusCode = statusLine.getStatusCode();

				if (statusCode == 200) {

					HttpEntity entity = response.getEntity();

					InputStream content = entity.getContent();

					BufferedReader reader = new BufferedReader(
							new InputStreamReader(content));

					String line;

					while ((line = reader.readLine()) != null) {
						builder.append(line);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return builder.toString();
		}

		protected void onPostExecute(String data) {

			seafood_text1 = (TextView) findViewById(R.id.seafood_text1);
			seafood_text2 = (TextView) findViewById(R.id.seafood_text2);
			seafood_text3 = (TextView) findViewById(R.id.seafood_text3);

			String MenuInfo = "";

			try {

				JSONObject obj = new JSONObject(data);
				JSONArray jArr = obj.getJSONArray("data");

				for (int i = 0; i <= jArr.length(); i++) {
					JSONObject jObject0 = jArr.getJSONObject(i);

					MenuInfo += jObject0.getString("krName");
					MenuInfo += ("\n");
					MenuInfo += ("가격: ");
					MenuInfo += jObject0.getString("price");
					MenuInfo += ("\n");
					MenuInfo += ("재료: ");
					MenuInfo += jObject0.getString("compose");

					if (i == 0) {
						seafood_text1.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 1) {
						seafood_text2.setText(MenuInfo);
						MenuInfo = "";
					}

					if (i == 2) {
						seafood_text3.setText(MenuInfo);
						MenuInfo = "";
					}

				}

			} catch (JSONException e) {
				e.printStackTrace();
			}

			if (MenuInfo.trim().length() > 0) {
			} else {
			}

			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	private class ReadJSONFeed6 extends AsyncTask<String, String, String> {
		// 3 step will be executed. onPreExecute, doInBackground ,onPostExecute

		protected void onPreExecute() { // not use
		}

		@Override
		protected String doInBackground(String... urls) { // background work

			HttpClient httpclient = new DefaultHttpClient();
			StringBuilder builder = new StringBuilder();

			HttpGet httpget = new HttpGet(urls[0]);

			try {
				HttpResponse response = httpclient.execute(httpget);
				StatusLine statusLine = response.getStatusLine();
				int statusCode = statusLine.getStatusCode();

				if (statusCode == 200) {

					HttpEntity entity = response.getEntity();

					InputStream content = entity.getContent();

					BufferedReader reader = new BufferedReader(
							new InputStreamReader(content));

					String line;

					while ((line = reader.readLine()) != null) {
						builder.append(line);
					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return builder.toString();
		}

		protected void onPostExecute(String data) {

			
			favorite_text1 = (TextView) findViewById(R.id.favorite_text1);
			favorite_text2 = (TextView) findViewById(R.id.favorite_text2);
			favorite_text3 = (TextView) findViewById(R.id.favorite_text3);
			favorite_text4 = (TextView) findViewById(R.id.favorite_text4);
			favorite_text5 = (TextView) findViewById(R.id.favorite_text5);
			favorite_text6 = (TextView) findViewById(R.id.favorite_text6);

			String MenuInfo = "";

			Typeface typeface = Typeface.createFromAsset(getAssets(), "HMKMMAG.TTF");
			
			favorite_text1.setTypeface(typeface);
			favorite_text2.setTypeface(typeface);
			favorite_text3.setTypeface(typeface);
			favorite_text4.setTypeface(typeface);
			favorite_text5.setTypeface(typeface);

			
			try {

				JSONObject obj = new JSONObject(data);
				JSONArray jArr = obj.getJSONArray("data");

				for (int i = 0; i <= jArr.length(); i++) {
					JSONObject jObject0 = jArr.getJSONObject(i);

					MenuInfo += jObject0.getString("name");
					MenuInfo += ("\n");
					/*
					MenuInfo += ("판매량: ");
					MenuInfo += jObject0.getString("sales");
					MenuInfo += ("\n");
					*/
					
					

					if (i == 0) {
						favorite_text1.setText("1위  :  " +MenuInfo);
						MenuInfo = "";
					}

					if (i == 1) {
						favorite_text2.setText("2위  :  " +MenuInfo);
						MenuInfo = "";
					}

					if (i == 2) {
						favorite_text3.setText("3위  :  " +MenuInfo);
						MenuInfo = "";
					}
					
					if (i == 3) {
						favorite_text4.setText("4위  :  " +MenuInfo);
						MenuInfo = "";
					}
					
					if (i == 4) {
						favorite_text5.setText("5위  :  " +MenuInfo);
						MenuInfo = "";
					}
					
					if (i == 5) {
						favorite_text6.setText("6위  :  " +MenuInfo);
						MenuInfo = "";
					}

				}

			} catch (JSONException e) {
				e.printStackTrace();
			}

			if (MenuInfo.trim().length() > 0) {
			} else {
			}

			try {
				this.finalize();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
		ImageView bmImage;

		public DownloadImageTask(ImageView bmImage) {
			st_Im1 = (ImageView) findViewById(R.id.steak_image1);
			st_Im2 = (ImageView) findViewById(R.id.steak_image2);
			st_Im3 = (ImageView) findViewById(R.id.steak_image3);
			st_Im4 = (ImageView) findViewById(R.id.steak_image4);

			ap_Im1 = (ImageView) findViewById(R.id.appetizer_image1);
			ap_Im2 = (ImageView) findViewById(R.id.appetizer_image2);
			ap_Im3 = (ImageView) findViewById(R.id.appetizer_image3);
			ap_Im4 = (ImageView) findViewById(R.id.appetizer_image4);
			ap_Im5 = (ImageView) findViewById(R.id.appetizer_image5);
			ap_Im6 = (ImageView) findViewById(R.id.appetizer_image6);

			pa_Im1 = (ImageView) findViewById(R.id.pasta_image1);
			pa_Im2 = (ImageView) findViewById(R.id.pasta_image2);
			pa_Im3 = (ImageView) findViewById(R.id.pasta_image3);
			pa_Im4 = (ImageView) findViewById(R.id.pasta_image4);
			pa_Im5 = (ImageView) findViewById(R.id.pasta_image5);

			sa_Im1 = (ImageView) findViewById(R.id.salad_image1);
			sa_Im2 = (ImageView) findViewById(R.id.salad_image2);
			sa_Im3 = (ImageView) findViewById(R.id.salad_image3);
			sa_Im4 = (ImageView) findViewById(R.id.salad_image4);

			se_Im1 = (ImageView) findViewById(R.id.seafood_image1);
			se_Im2 = (ImageView) findViewById(R.id.seafood_image2);
			se_Im3 = (ImageView) findViewById(R.id.seafood_image3);
			

			this.bmImage = bmImage;
		}

		protected Bitmap doInBackground(String... urls) {
			String urldisplay = urls[0];
			Bitmap mIcon11 = null;
			try {
				InputStream in = new java.net.URL(urldisplay).openStream();
				mIcon11 = BitmapFactory.decodeStream(in);
			} catch (Exception e) {
				Log.e("Error", e.getMessage());
				e.printStackTrace();
			}
			return mIcon11;
		}

		protected void onPostExecute(Bitmap result) {
			try {
				bmImage.setImageBitmap(result);
			} catch (Exception e) {

			}
		}
	}
	
public static String JsonPost_call_order(){
		
		String call_order ="";
		JSONStringer jsonStringer = new JSONStringer();
			
		try{
				  jsonStringer.object();
				  jsonStringer.key("tableNum").value(1);
				  jsonStringer.endObject();
				  
				  call_order = jsonStringer.toString();
				  Log.e(TAG,""+ call_order);
		}
		
		catch(JSONException e){
		e.printStackTrace();
		}
		
		return call_order;
		//return new String[] {steak_order1};
	}
	
	private class sendJsonToServer_call_order extends AsyncTask<String, String, String> {
	    // Do the long-running work in hereg
		
	    protected String doInBackground(String... urls) {
	    	
			OutputStream os = null;
			InputStream is = null;
			ByteArrayOutputStream baos = null;
			HttpURLConnection conn = null;
			String response="";
			
			try {
				URL url = new URL(urls[0]);
				conn = (HttpURLConnection)url.openConnection();
				conn.setConnectTimeout(5*1000);;
				conn.setReadTimeout(5*1000);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Cache-Control", "no-cache");
				conn.setRequestProperty("Content-Type", "application/json");
				conn.setRequestProperty("Accept", "application/json");
				conn.setDoOutput(true);
				conn.setDoInput(true);
				
				os = conn.getOutputStream();
				os.write(JsonPost_call_order().getBytes());
				
				
				os.flush();
				int responseCode = conn.getResponseCode();
				
				if(responseCode == HttpURLConnection.HTTP_OK){
					
					is = conn.getInputStream();
					baos = new ByteArrayOutputStream();
					byte[] byteBuffer = new byte[1024];
					byte[] byteData = null;
					int nLength = 0;
					
					while((nLength = is.read(byteBuffer, 0, byteBuffer.length)) != -1){
						baos.write(byteBuffer, 0, nLength);
					}
					byteData = baos.toByteArray();
					response = new String(byteData);
					
					Log.i(TAG, "DATA response =" + response);
				}
			} catch(MalformedURLException e){
				e.printStackTrace();
				return null;
			} catch (IOException e){
				e.printStackTrace();
				return null;
			} catch(Exception e){
				Log.e("kkk","Exception="+e);
						return null;
			}
			return response;
		}
	    
	    // This is called when doInBackground() is finished
	    protected void onPostExecute(Long result) {
	    }
	}

}
