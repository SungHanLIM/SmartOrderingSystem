package com.example.test2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.AsyncTask;
import android.os.Bundle;
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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Korean_OrderDetail extends Activity {


	private static final String TAG = null;
	private static final String TAG2 = null;
	static public ArrayList<CData_SecParse_Mdish> alist3;
	static public ArrayList<CData_SecParse_Sdish> alist4;
	static DataAdapter3 adapter3;
	DataAdapter4 adapter4;
	
	private Context context;
	private TextView title;
	private TextView number;
	private TextView price;
	private ImageView img;
	private Button parse_pbutton;
	private Button parse_mbutton;
	
	
	private Context context2;
	private TextView title2;
	private TextView number2;
	private TextView price2;
	private ImageView img2;
	
	public View final_order_button;
	
	static String steak_name_data1;
	static String steak_name_data2;
	static String steak_name_data3;
	static String steak_name_data4;
	
	static int steak_num_data1;
	static int steak_num_data2;
	static int steak_num_data3;
	static int steak_num_data4;
	
	static int steak_tval_data1;
	static int steak_tval_data2;
	static int steak_tval_data3;
	static int steak_tval_data4;
	static int steak_tval_data5;

	static String appetizer_name_data1;
	static String appetizer_name_data2;
	static String appetizer_name_data3;
	static String appetizer_name_data4;
	static String appetizer_name_data5;
	static String appetizer_name_data6;
	
	static int appetizer_num_data1;
	static int appetizer_num_data2;
	static int appetizer_num_data3;
	static int appetizer_num_data4;
	static int appetizer_num_data5;
	static int appetizer_num_data6;
	
	static int appetizer_tval_data1;
	static int appetizer_tval_data2;
	static int appetizer_tval_data3;
	static int appetizer_tval_data4;
	static int appetizer_tval_data5;
	static int appetizer_tval_data6;
	static int appetizer_tval_data7;

	static String pasta_name_data1;
	static String pasta_name_data2;
	static String pasta_name_data3;
	static String pasta_name_data4;
	static String pasta_name_data5;
	static String pasta_name_data6;
	
	static int pasta_num_data1;
	static int pasta_num_data2;
	static int pasta_num_data3;
	static int pasta_num_data4;
	static int pasta_num_data5;
	static int pasta_num_data6;
	
	static int pasta_tval_data1;
	static int pasta_tval_data2;
	static int pasta_tval_data3;
	static int pasta_tval_data4;
	static int pasta_tval_data5;
	static int pasta_tval_data6;
	static int pasta_tval_data7;

	static String salad_name_data1;
	static String salad_name_data2;
	static String salad_name_data3;
	static String salad_name_data4;
	
	static int salad_num_data1;
	static int salad_num_data2;
	static int salad_num_data3;
	static int salad_num_data4;
	
	static int salad_tval_data1;
	static int salad_tval_data2;
	static int salad_tval_data3;
	static int salad_tval_data4;
	static int salad_tval_data5;

	static String seafood_name_data1;
	static String seafood_name_data2;
	static String seafood_name_data3;
	
	static int seafood_num_data1;
	static int seafood_num_data2;
	static int seafood_num_data3;
	
	static int seafood_tval_data1;
	static int seafood_tval_data2;
	static int seafood_tval_data3;
	static int seafood_tval_data4;

	int steak_ndata1;
	int steak_ndata2;
	int steak_ndata3;
	int steak_ndata4;
	
	int appetizer_ndata1;
	int appetizer_ndata2;
	int appetizer_ndata3;
	int appetizer_ndata4;
	int appetizer_ndata5;
	int appetizer_ndata6;
	
	int pasta_ndata1;
	int pasta_ndata2;
	int pasta_ndata3;
	int pasta_ndata4;
	int pasta_ndata5;
	
	int salad_ndata1;
	int salad_ndata2;
	int salad_ndata3;
	int salad_ndata4;
	
	int seafood_ndata1;
	int seafood_ndata2;
	int seafood_ndata3;
	
	int steak_data1;
	int steak_data2;
	int steak_data3;
	int steak_data4;
	int steak_data5;

	int appetizer_data1;
	int appetizer_data2;
	int appetizer_data3;
	int appetizer_data4;
	int appetizer_data5;
	int appetizer_data6;
	int appetizer_data7;

	int pasta_data1;
	int pasta_data2;
	int pasta_data3;
	int pasta_data4;
	int pasta_data5;
	int pasta_data6;
	int pasta_data7;

	int salad_data1;
	int salad_data2;
	int salad_data3;
	int salad_data4;
	int salad_data5;

	int seafood_data1;
	int seafood_data2;
	int seafood_data3;
	int seafood_data4;
	
	int tableA;
	int tableB;
	
	public static String string_steak_num_data1;
	String string_steak_num_data2;
	String string_steak_num_data3;
	String string_steak_num_data4;
	
	public static String string_steak_tval_data1;
	String string_steak_tval_data2;
	String string_steak_tval_data3;
	String string_steak_tval_data4;
	String string_steak_tval_data5;
	
	String string_appetizer_num_data1;
	String string_appetizer_num_data2;
	String string_appetizer_num_data3;
	String string_appetizer_num_data4;
	String string_appetizer_num_data5;
	String string_appetizer_num_data6;
	
	String string_appetizer_tval_data1;
	String string_appetizer_tval_data2;
	String string_appetizer_tval_data3;
	String string_appetizer_tval_data4;
	String string_appetizer_tval_data5;
	String string_appetizer_tval_data6;
	String string_appetizer_tval_data7;
	
	String string_pasta_num_data1;
	String string_pasta_num_data2;
	String string_pasta_num_data3;
	String string_pasta_num_data4;
	String string_pasta_num_data5;

	String string_pasta_tval_data1;
	String string_pasta_tval_data2;
	String string_pasta_tval_data3;
	String string_pasta_tval_data4;
	String string_pasta_tval_data5;
	String string_pasta_tval_data6;
	
	String string_salad_num_data1;
	String string_salad_num_data2;
	String string_salad_num_data3;
	String string_salad_num_data4;
	
	String string_salad_tval_data1;
	String string_salad_tval_data2;
	String string_salad_tval_data3;
	String string_salad_tval_data4;
	String string_salad_tval_data5;
	
	String string_seafood_num_data1;
	String string_seafood_num_data2;
	String string_seafood_num_data3;
	
	String string_seafood_tval_data1;
	String string_seafood_tval_data2;
	String string_seafood_tval_data3;
	String string_seafood_tval_data4;
	
	static ListView mainmenu_mListView1;
	static ListView sidemenu_mListView2;
	
	ArrayAdapter<Integer> mAdapter1;
	ArrayAdapter<Integer> mAdapter2;
	ArrayAdapter<Integer> mAdapter3;
	ArrayAdapter<Integer> mAdapter4;
	ArrayAdapter<Integer> mAdapter5;
	ArrayAdapter<Integer> mAdapter6;
	
	static TextView steak_save_price;
	static TextView appetizer_save_price;
	static TextView pasta_save_price;
	static TextView salad_save_price;
	static TextView seafood_save_price;
	static public TextView final_total_save_price;
	
	ImageView maindish_picture;
	ImageView sidedish_picture;
	
	//static public int Table_NumberSave_A;
	//static public int Table_NumberSave_B;
	
	static int final_tval_data;
	
	SoundPool sound;
	int soundId1;
	int soundId2;
	
	Button secondParse_minus_button;
	Button secondParse_plus_button;
	
	static public String index_count1="0";
	static public String index_count2="0";
	
	
	static public String test_index_count1="0";
	static public String test_index_count2="1";
	static public String test_index_count3="2";
	static public String test_index_count4="3";
	static public String test_index_count5="4";
	static public String test_index_count6="5";
	static public String test_index_count7="6";
	static public String test_index_count8="7";
	static public String test_index_count9="8";
	
	int save_index = -1;
	int save_index2 = -1;
	
	
	int my_index_count1;
	int my_index_count2;
	int my_index_count3;
	int my_index_count4;
	int my_index_count5;
	int my_index_count6;
	int my_index_count7;
	int my_index_count8;
	int my_index_count9;
	
	static public Hashtable<String, Integer> ht;
	static public Hashtable<String, Integer> ht2;
	
	static public int Table_NumberSave_A = 1;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.korean_orderdetail);
		Intent intent = getIntent();
		
		sound = new SoundPool(5,AudioManager.STREAM_MUSIC,0);
		soundId1 = sound.load(this, R.raw.main_dishes_sound, 1);
		soundId2 = sound.load(this, R.raw.side_dishes_sound,1);
/*
		if(android.os.Build.VERSION.SDK_INT > 9) {

		    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

		        StrictMode.setThreadPolicy(policy);

		}
*/
		
		
		
		maindish_picture = (ImageView)findViewById(R.id.maindish_picture);
		sidedish_picture = (ImageView)findViewById(R.id.sidedish_picture);
		
		steak_name_data1 = intent.getStringExtra("steak_name1"); // 스테이크 이름
		steak_name_data2 = intent.getStringExtra("steak_name2");
		steak_name_data3 = intent.getStringExtra("steak_name3");
		steak_name_data4 = intent.getStringExtra("steak_name4");
		
		steak_num_data1 = intent.getIntExtra("steak_num1",steak_ndata1); // 스테이크 갯수
		steak_num_data2 = intent.getIntExtra("steak_num2",steak_ndata2);
		steak_num_data3 = intent.getIntExtra("steak_num3",steak_ndata3);
		steak_num_data4 = intent.getIntExtra("steak_num4",steak_ndata4);

		
		steak_tval_data1 = intent.getIntExtra("steak_tval1", steak_data1); // 스테이크 가격
		steak_tval_data2 = intent.getIntExtra("steak_tval2", steak_data2);
		steak_tval_data3 = intent.getIntExtra("steak_tval3", steak_data3);
		steak_tval_data4 = intent.getIntExtra("steak_tval4", steak_data4);
		steak_tval_data5 = intent.getIntExtra("steak_tval5", steak_data5); 

		appetizer_name_data1 = intent.getStringExtra("appetizer_name1"); // 애피타이저 이름
		appetizer_name_data2 = intent.getStringExtra("appetizer_name2");
		appetizer_name_data3 = intent.getStringExtra("appetizer_name3");
		appetizer_name_data4 = intent.getStringExtra("appetizer_name4");
		appetizer_name_data5 = intent.getStringExtra("appetizer_name5");
		appetizer_name_data6 = intent.getStringExtra("appetizer_name6");
		
		appetizer_num_data1 = intent.getIntExtra("appetizer_num1", appetizer_ndata1); // 애피타이저 갯수
		appetizer_num_data2 = intent.getIntExtra("appetizer_num2", appetizer_ndata2);
		appetizer_num_data3 = intent.getIntExtra("appetizer_num3", appetizer_ndata3);
		appetizer_num_data4 = intent.getIntExtra("appetizer_num4", appetizer_ndata4);
		appetizer_num_data5 = intent.getIntExtra("appetizer_num5", appetizer_ndata5);
		appetizer_num_data6 = intent.getIntExtra("appetizer_num6", appetizer_ndata6);
		
		appetizer_tval_data1 = intent.getIntExtra("appetizer_tval1",appetizer_data1); // 애피타이저 가격
		appetizer_tval_data2 = intent.getIntExtra("appetizer_tval2",appetizer_data2);
		appetizer_tval_data3 = intent.getIntExtra("appetizer_tval3",appetizer_data3);
		appetizer_tval_data4 = intent.getIntExtra("appetizer_tval4",appetizer_data4);
		appetizer_tval_data5 = intent.getIntExtra("appetizer_tval5",appetizer_data5);
		appetizer_tval_data6 = intent.getIntExtra("appetizer_tval6",appetizer_data6);
		appetizer_tval_data7 = intent.getIntExtra("appetizer_tval7",appetizer_data7);

		pasta_name_data1 = intent.getStringExtra("pasta_name1"); // 파스타 이름
		pasta_name_data2 = intent.getStringExtra("pasta_name2");
		pasta_name_data3 = intent.getStringExtra("pasta_name3");
		pasta_name_data4 = intent.getStringExtra("pasta_name4");
		pasta_name_data5 = intent.getStringExtra("pasta_name5");
		
		pasta_num_data1 = intent.getIntExtra("pasta_num1", pasta_ndata1); // 파스타 갯수
		pasta_num_data2 = intent.getIntExtra("pasta_num2", pasta_ndata2);
		pasta_num_data3 = intent.getIntExtra("pasta_num3", pasta_ndata3);
		pasta_num_data4 = intent.getIntExtra("pasta_num4", pasta_ndata4);
		pasta_num_data5 = intent.getIntExtra("pasta_num5", pasta_ndata5);
		
		pasta_tval_data1 = intent.getIntExtra("pasta_tval1", pasta_data1);  // 파스타 가격
		pasta_tval_data2 = intent.getIntExtra("pasta_tval2", pasta_data2); 
		pasta_tval_data3 = intent.getIntExtra("pasta_tval3", pasta_data3);
		pasta_tval_data4 = intent.getIntExtra("pasta_tval4", pasta_data4);
		pasta_tval_data5 = intent.getIntExtra("pasta_tval5", pasta_data5);
		pasta_tval_data6 = intent.getIntExtra("pasta_tval6", pasta_data6);

		salad_name_data1 = intent.getStringExtra("salad_name1"); // 샐러드 이름
		salad_name_data2 = intent.getStringExtra("salad_name2");
		salad_name_data3 = intent.getStringExtra("salad_name3");
		salad_name_data4 = intent.getStringExtra("salad_name4");
		
		salad_num_data1 = intent.getIntExtra("salad_num1", salad_ndata1); // 샐러드 갯수
		salad_num_data2 = intent.getIntExtra("salad_num2", salad_ndata2);
		salad_num_data3 = intent.getIntExtra("salad_num3", salad_ndata3);
		salad_num_data4 = intent.getIntExtra("salad_num4", salad_ndata4);
		
		salad_tval_data1 = intent.getIntExtra("salad_tval1", salad_data1); // 샐러드 가격
		salad_tval_data2 = intent.getIntExtra("salad_tval2", salad_data2);
		salad_tval_data3 = intent.getIntExtra("salad_tval3", salad_data3);
		salad_tval_data4 = intent.getIntExtra("salad_tval4", salad_data4);
		salad_tval_data5 = intent.getIntExtra("salad_tval5", salad_data5);

		seafood_name_data1 = intent.getStringExtra("seafood_name1"); // 씨푸드 이름
		seafood_name_data2 = intent.getStringExtra("seafood_name2");
		seafood_name_data3 = intent.getStringExtra("seafood_name3");
		
		seafood_num_data1 = intent.getIntExtra("seafood_num1", seafood_ndata1); // 씨푸드 갯수
		seafood_num_data2 = intent.getIntExtra("seafood_num2", seafood_ndata2);
		seafood_num_data3 = intent.getIntExtra("seafood_num3", seafood_ndata3);
		
		seafood_tval_data1 = intent.getIntExtra("seafood_tval1", seafood_data1); // 씨푸드 가격
		seafood_tval_data2 = intent.getIntExtra("seafood_tval2", seafood_data2);
		seafood_tval_data3 = intent.getIntExtra("seafood_tval3", seafood_data3);
		seafood_tval_data4 = intent.getIntExtra("seafood_tval4", seafood_data4);
		
		//Table_NumberSave_A = intent.getIntExtra("Table_NumberSave_A", tableA);
		//Table_NumberSave_B = intent.getIntExtra("Table_NumberSave_B", tableB);
		
		string_steak_num_data1 = Integer.toString(steak_num_data1); // 스테이크 string 변환
		string_steak_num_data2 = Integer.toString(steak_num_data2);
		string_steak_num_data3 = Integer.toString(steak_num_data3);
		string_steak_num_data4 = Integer.toString(steak_num_data4);
		
		string_steak_tval_data1 = Integer.toString(steak_tval_data1);
		string_steak_tval_data2 = Integer.toString(steak_tval_data2);
		string_steak_tval_data3 = Integer.toString(steak_tval_data3);
		string_steak_tval_data4 = Integer.toString(steak_tval_data4);
		string_steak_tval_data5 = Integer.toString(steak_tval_data5);
		
		string_appetizer_num_data1 = Integer.toString(appetizer_num_data1); // 애피타이저 string 변환
		string_appetizer_num_data2 = Integer.toString(appetizer_num_data2);
		string_appetizer_num_data3 = Integer.toString(appetizer_num_data3);
		string_appetizer_num_data4 = Integer.toString(appetizer_num_data4);
		string_appetizer_num_data5 = Integer.toString(appetizer_num_data5);
		string_appetizer_num_data6 = Integer.toString(appetizer_num_data6);
		
		string_appetizer_tval_data1 = Integer.toString(appetizer_tval_data1);
		string_appetizer_tval_data2 = Integer.toString(appetizer_tval_data2);
		string_appetizer_tval_data3 = Integer.toString(appetizer_tval_data3);
		string_appetizer_tval_data4 = Integer.toString(appetizer_tval_data4);
		string_appetizer_tval_data5 = Integer.toString(appetizer_tval_data5);
		string_appetizer_tval_data6 = Integer.toString(appetizer_tval_data6);
		string_appetizer_tval_data7 = Integer.toString(appetizer_tval_data7);
		
		string_pasta_num_data1 = Integer.toString(pasta_num_data1);
		string_pasta_num_data2 = Integer.toString(pasta_num_data2);
		string_pasta_num_data3 = Integer.toString(pasta_num_data3);
		string_pasta_num_data4 = Integer.toString(pasta_num_data4);
		string_pasta_num_data5 = Integer.toString(pasta_num_data5);
		
		string_pasta_tval_data1 = Integer.toString(pasta_tval_data1);
		string_pasta_tval_data2 = Integer.toString(pasta_tval_data2);
		string_pasta_tval_data3 = Integer.toString(pasta_tval_data3);
		string_pasta_tval_data4 = Integer.toString(pasta_tval_data4);
		string_pasta_tval_data5 = Integer.toString(pasta_tval_data5);
		string_pasta_tval_data6 = Integer.toString(pasta_tval_data6);
		
		string_salad_num_data1 = Integer.toString(salad_num_data1);
		string_salad_num_data2 = Integer.toString(salad_num_data2);
		string_salad_num_data3 = Integer.toString(salad_num_data3);
		string_salad_num_data4 = Integer.toString(salad_num_data4);
		
		string_salad_tval_data1 = Integer.toString(salad_tval_data1);
		string_salad_tval_data2 = Integer.toString(salad_tval_data2);
		string_salad_tval_data3 = Integer.toString(salad_tval_data3);
		string_salad_tval_data4 = Integer.toString(salad_tval_data4);
		string_salad_tval_data5 = Integer.toString(salad_tval_data5);
		
		string_seafood_num_data1 = Integer.toString(seafood_num_data1);
		string_seafood_num_data2 = Integer.toString(seafood_num_data2);
		string_seafood_num_data3 = Integer.toString(seafood_num_data3);
		
		string_seafood_tval_data1 = Integer.toString(seafood_tval_data1);
		string_seafood_tval_data2 = Integer.toString(seafood_tval_data2);
		string_seafood_tval_data3 = Integer.toString(seafood_tval_data3);
		string_seafood_tval_data4 = Integer.toString(seafood_tval_data4);
		
		final_order_button = (ImageView) findViewById(R.id.final_order_button);
		
		mainmenu_mListView1 = (ListView) findViewById(R.id.MainMenu_listview1);
		sidemenu_mListView2 = (ListView) findViewById(R.id.SubMenu_listview1);

		mainmenu_mListView1.setFocusable(false);
		mainmenu_mListView1.setItemsCanFocus(false);
		
		final_tval_data = (steak_tval_data5 + appetizer_tval_data7 + pasta_tval_data6 + salad_tval_data5 + seafood_tval_data4);

		steak_save_price = (TextView)findViewById(R.id.steak_save_price);
		appetizer_save_price = (TextView)findViewById(R.id.appetizer_save_price);
		pasta_save_price = (TextView)findViewById(R.id.pasta_save_price);
		salad_save_price = (TextView)findViewById(R.id.salad_save_price);
		seafood_save_price = (TextView)findViewById(R.id.seafood_save_price);
		final_total_save_price = (TextView)findViewById(R.id.final_total_save_price);
		
		Log.e("A",steak_name_data1);
		Log.e("B",steak_name_data2);
		Log.e("C",steak_name_data3);
		Log.e("D",steak_name_data4);
		
		Log.e("E","E"+steak_num_data1);
		Log.e("F","F"+steak_num_data2);
		Log.e("G","G"+steak_num_data3);
		Log.e("H","H"+steak_num_data4);
		
		//steak_num_data3

		Log.e("I","I"+steak_tval_data1);
		Log.e("J","J"+steak_tval_data2);
		Log.e("K","K"+steak_tval_data3);
		Log.e("L","L"+steak_tval_data4);
		Log.e("M","M"+steak_tval_data5);
		
		steak_save_price.setText(""+steak_tval_data5); // int 형 스테이크 총가격
		appetizer_save_price.setText(""+appetizer_tval_data7); // int 형 애피타이저 총가격
		pasta_save_price.setText(""+pasta_tval_data6); // int 형 파스타 총가격
		salad_save_price.setText(""+salad_tval_data5);	// int 형 샐러드 총가격
		seafood_save_price.setText(""+seafood_tval_data4); // int 형 씨푸드 총가격
		final_total_save_price.setText(""+ final_tval_data); // int 형 총 가격
		
		alist3 = new ArrayList<CData_SecParse_Mdish>();
		alist4 = new ArrayList<CData_SecParse_Sdish>();
		
		adapter3 = new DataAdapter3(this,alist3);
		adapter4 = new DataAdapter4(this,alist4);
		
		mainmenu_mListView1.setAdapter(adapter3);
		sidemenu_mListView2.setAdapter(adapter4);
		
		context = this;
		
		
		ht = new Hashtable<String, Integer>();
		ht2 = new Hashtable<String, Integer>();
		save_index = Integer.parseInt(index_count1);
		save_index2 = Integer.parseInt(index_count2);
		
		
		my_index_count1 =   Integer.parseInt(test_index_count1);
		my_index_count2 =   Integer.parseInt(test_index_count2);
		my_index_count3 =   Integer.parseInt(test_index_count3);
		my_index_count4 =   Integer.parseInt(test_index_count4);
		my_index_count5 =   Integer.parseInt(test_index_count5);
		my_index_count6 =   Integer.parseInt(test_index_count6);
		my_index_count7 =   Integer.parseInt(test_index_count7);
		my_index_count8 =   Integer.parseInt(test_index_count8);
		my_index_count9 =   Integer.parseInt(test_index_count9);
		
		if(steak_num_data1 != 0){ // 아이템 갯수가 0개가 아닐때 리스트에 add하고
			
			if(save_index < 0){
				save_index++;
			}
			adapter3.add(new CData_SecParse_Mdish(this,steak_name_data1,string_steak_num_data1, string_steak_tval_data1, R.drawable.steak1, index_count1));	
			
			ht.put("steak_save_index1", save_index); // 해쉬테이블에 save_index 초기값 0을 넣어준다.
			save_index++; //  추가될때마다 save_index값을 증가시키며
		}
		
		if(steak_num_data2 != 0){
			adapter3.add(new CData_SecParse_Mdish(this,steak_name_data2,string_steak_num_data2, string_steak_tval_data2, R.drawable.steak2,index_count1));
			
			if(save_index < 0){
				save_index++;
			}
			
			ht.put("steak_save_index2", save_index);
			save_index++;
		}
		if(steak_num_data3 != 0){
			adapter3.add(new CData_SecParse_Mdish(this,steak_name_data3,string_steak_num_data3, string_steak_tval_data3, R.drawable.steak3,index_count1));
			
			if(save_index < 0){
				save_index++;
			}
			
			ht.put("steak_save_index3", save_index);
			save_index++;
		}
		if(steak_num_data4 != 0){
			adapter3.add(new CData_SecParse_Mdish(this,steak_name_data4,string_steak_num_data4, string_steak_tval_data4, R.drawable.steak4,index_count1));	
			
			if(save_index < 0){
				save_index++;
			}
			
			ht.put("steak_save_index4", save_index);
			save_index++;
		}
		
		if(pasta_num_data1 !=0){
			adapter3.add(new CData_SecParse_Mdish(this,pasta_name_data1,string_pasta_num_data1, string_pasta_tval_data1, R.drawable.pasta1,index_count1));	
			
			if(save_index < 0){
				save_index++;
			}
			
			ht.put("pasta_save_index1", save_index);
			save_index++;
		}
		if(pasta_num_data2 !=0){
			adapter3.add(new CData_SecParse_Mdish(this,pasta_name_data2,string_pasta_num_data2, string_pasta_tval_data2, R.drawable.pasta2,index_count1));
			
			if(save_index < 0){
				save_index++;
			}
			
			ht.put("pasta_save_index2", save_index);
			save_index++;
		}
		if(pasta_num_data3 !=0){
			adapter3.add(new CData_SecParse_Mdish(this,pasta_name_data3,string_pasta_num_data3, string_pasta_tval_data3, R.drawable.pasta3,index_count1));
			
			if(save_index < 0){
				save_index++;
			}
			
			ht.put("pasta_save_index3", save_index);
			save_index++;
		}
		if(pasta_num_data4 !=0){
			adapter3.add(new CData_SecParse_Mdish(this,pasta_name_data4,string_pasta_num_data4, string_pasta_tval_data4, R.drawable.pasta4,index_count1));	
			
			if(save_index < 0){
				save_index++;
			}
			
			ht.put("pasta_save_index4", save_index);
			save_index++;
		}
		if(pasta_num_data5 !=0){
			adapter3.add(new CData_SecParse_Mdish(this,pasta_name_data5,string_pasta_num_data5, string_pasta_tval_data5, R.drawable.pasta5,index_count1));	
			
			if(save_index < 0){
				save_index++;
			}
			
			ht.put("pasta_save_index5", save_index);
			save_index++;
		}
		
		
		if(appetizer_num_data1 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,appetizer_name_data1,string_appetizer_num_data1, string_appetizer_tval_data1, R.drawable.appetizer1));	
		
			ht2.put("appetizer_save_index1", save_index2); 
			save_index2++;
		}
		if(appetizer_num_data2 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,appetizer_name_data2,string_appetizer_num_data2, string_appetizer_tval_data2, R.drawable.appetizer2));	
			
			ht2.put("appetizer_save_index2", save_index2); 
			save_index2++;
		}
		if(appetizer_num_data3 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,appetizer_name_data3,string_appetizer_num_data3, string_appetizer_tval_data3, R.drawable.appetizer3));	

			ht2.put("appetizer_save_index3", save_index2); 
			save_index2++;
		}
		if(appetizer_num_data4 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,appetizer_name_data4,string_appetizer_num_data4, string_appetizer_tval_data4, R.drawable.appetizer4));	
			
			ht2.put("appetizer_save_index4", save_index2); 
			save_index2++;
		}
		if(appetizer_num_data5 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,appetizer_name_data5,string_appetizer_num_data5, string_appetizer_tval_data5, R.drawable.appetizer5));	

			ht2.put("appetizer_save_index5", save_index2); 
			save_index2++;
		}
		if(appetizer_num_data6 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,appetizer_name_data6,string_appetizer_num_data6, string_appetizer_tval_data6, R.drawable.appetizer6));	

			ht2.put("appetizer_save_index6", save_index2); 
			save_index2++;	
		}
		
		if(salad_num_data1 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,salad_name_data1,string_salad_num_data1, string_salad_tval_data1, R.drawable.salad1));	

			ht2.put("salad_save_index1", save_index2); 
			save_index2++;
		}
		if(salad_num_data2 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,salad_name_data2,string_salad_num_data2, string_salad_tval_data2, R.drawable.salad2));	
			
			ht2.put("salad_save_index2", save_index2); 
			save_index2++;
		}
		if(salad_num_data3 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,salad_name_data3,string_salad_num_data3, string_salad_tval_data3, R.drawable.salad3));	
			
			ht2.put("salad_save_index3", save_index2); 
			save_index2++;
		}
		if(salad_num_data4 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,salad_name_data4,string_salad_num_data4, string_salad_tval_data4, R.drawable.salad4));	
			
			ht2.put("salad_save_index4", save_index2); 
			save_index2++;
		}
		
		if(seafood_num_data1 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,seafood_name_data1,string_seafood_num_data1, string_seafood_tval_data1, R.drawable.seafood1));	
			
			ht2.put("seafood_save_index1", save_index2); 
			save_index2++;
		}
		if(seafood_num_data2 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,seafood_name_data2,string_seafood_num_data2, string_seafood_tval_data2, R.drawable.seafood2));

			ht2.put("seafood_save_index2", save_index2); 
			save_index2++;
		}
		if(seafood_num_data3 !=0){
			adapter4.add(new CData_SecParse_Sdish(this,seafood_name_data3,string_seafood_num_data3, string_seafood_tval_data3, R.drawable.seafood3));
			
			ht2.put("seafood_save_index3", save_index2); 
			save_index2++;
		}
		
		maindish_picture.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sound.play(soundId1, 1f, 1f, 0, 0, 1f);
				maindish_picture.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						sound.play(soundId1, 1f, 1f, 0, 0, 1f);
						 int result[] = explore();
						 //System.out.println(result[0] + result[1] + result[2] + result[3]  );
						 Toast.makeText(getApplicationContext(),result[0]+"  "+result[1]+"  "+result[2]+"  "+result[3],Toast.LENGTH_SHORT).show();
					}
				});
			}
		});
		
		sidedish_picture.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sound.play(soundId2, 1f, 1f, 0, 0, 1f);
			}
		});
		
		final_order_button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				AlertDialog.Builder alert_confirm = new AlertDialog.Builder(Korean_OrderDetail.this);
				alert_confirm.setMessage("주문이 들어가면 조리가 바로 시작됩니다. \n\n\n\n 최종 주문을 하시겠습니까? \n\n\n\n").setCancelable(false).setPositiveButton("확인",
				
				
				new DialogInterface.OnClickListener() {
				    @Override
				    public void onClick(DialogInterface dialog, int which) {
				        // 'YES'
				    	
				    	try{

						sendJsonToServer_last_order last_order;
						last_order = new sendJsonToServer_last_order();
						last_order.execute("http://117.16.231.212:8010/insertOrder");

						/*
						sendJsonToServer_last_order last_order2;
						last_order2 = new sendJsonToServer_last_order();
						last_order2.execute("http://117.16.231.212:8010/insertOrder");
						*/
						
						}
						catch(Exception e){
							Toast.makeText(getApplicationContext(),"에러1",Toast.LENGTH_SHORT).show();
						}
						Intent intent = new Intent(Korean_OrderDetail.this,Korean_OrderComplete.class);
						startActivity(intent);
						finish();
				    	
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

				
			//	new sendJsonDataToServer().execute();
			
					/*
				sendJsonDataToServer(JsonPost_steak1(), "http://117.16.231.212:8010/insertOrder");
	
				/*
					try{
				sendJsonToServer_steak1 json_steak1;
				json_steak1 = new sendJsonToServer_steak1();
				
				json_steak1.execute("http://117.16.231.212:8010/insertOrder");
				*/

			}
		});
		
		// 여기서 메인메뉴 사이드 리스트뷰로 나타난 아이템목록을 터치시 
		// 터치한 아이템 이름이 토스트되어 나타납니다.
		
		mainmenu_mListView1.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {	
				CData_SecParse_Mdish data = (CData_SecParse_Mdish)arg0.getAdapter().getItem(arg2);
				String title = data.getTitle();
				
				Toast.makeText(arg0.getContext(), title, Toast.LENGTH_SHORT).show();
			}
		});
	}
	

	
	//

	public static int[] explore(){
		
		int Store_NotZero[] = new int[22];
		
		int Steak_NumSave1 = 0;
		int Steak_NumSave2;
		int Steak_NumSave3;
		int Steak_NumSave4;
		
		String explore_string ="";
		try{		
			
			if(steak_num_data1 != 0){
				Steak_NumSave1 = steak_num_data1; 
			}	
			
			if(steak_num_data2 != 0){
				Steak_NumSave2 = steak_num_data2; 
			}	
			
			if(steak_num_data3 != 0){
				Steak_NumSave3 = steak_num_data3; 
			}	
			
			if(steak_num_data4 != 0){
				Steak_NumSave4 = steak_num_data4; 
			}	
			
			if(appetizer_num_data1 != 0){
				Store_NotZero[4] = appetizer_num_data1; 
			}	
			
			if(appetizer_num_data2 != 0){
				Store_NotZero[5] = appetizer_num_data2; 
			}
			
			if(appetizer_num_data3 != 0){
				Store_NotZero[6] = appetizer_num_data3; 
			}
			
			if(appetizer_num_data4 != 0){
				Store_NotZero[7] = appetizer_num_data4; 
			}
			
			if(appetizer_num_data5 != 0){
				Store_NotZero[8] = appetizer_num_data5; 
			}
			
			if(appetizer_num_data6 != 0){
				Store_NotZero[9] = appetizer_num_data6; 
			}
			
			if(pasta_num_data1 != 0){
				Store_NotZero[10] = pasta_num_data1; 
			}
			
			if(pasta_num_data2 != 0){
				Store_NotZero[11] = pasta_num_data2; 
			}
			
			if(pasta_num_data3 != 0){
				Store_NotZero[12] = pasta_num_data3; 
			}
			
			if(pasta_num_data4 != 0){
				Store_NotZero[13] = pasta_num_data4; 
			}
			
			if(pasta_num_data5 != 0){
				Store_NotZero[14] = pasta_num_data5; 
			}
			
			if(salad_num_data1 != 0){
				Store_NotZero[15] = salad_num_data1; 
			}
			
			if(salad_num_data2 != 0){
				Store_NotZero[16] = salad_num_data2; 
			}
			if(salad_num_data3 != 0){
				Store_NotZero[17] = salad_num_data3; 
			}
			if(salad_num_data4 != 0){
				Store_NotZero[18] = salad_num_data4; 
			}
			
			if(seafood_num_data1 != 0){
				Store_NotZero[19] = seafood_num_data1; 
			}
			
			if(seafood_num_data2 != 0){
				Store_NotZero[20] = seafood_num_data2; 
			}
			
			if(seafood_num_data3 != 0){
				Store_NotZero[21] = seafood_num_data3; 
			}
			Log.d(TAG,"send string = " +explore_string);	
		}
		catch(Exception e)
		{
			
		}
		return new int[] { Steak_NumSave1};

	}
	
	
public static String JsonPost_last_order(){
		
		String last_order ="";
		String last_order2 ="";
		
		String steak_order1="";
		String steak_order2="";
		String steak_order3="";
		String steak_order4="";
		
		JSONStringer jsonStringer = new JSONStringer();
		JSONStringer A = new JSONStringer();
		JSONStringer menu_value1 = new JSONStringer();
		JSONObject jsonobject;
		

	    int SteakNum1 = 0;
	    int SteakNum2 = 0;
	    int SteakNum3 = 0;
	    int SteakNum4 = 0;
		
		int AppetizerNum1 = 0;
		int AppetizerNum2 = 0;
		int AppetizerNum3 = 0;
		int AppetizerNum4 = 0;
		int AppetizerNum5 = 0;
		int AppetizerNum6 = 0;
		
		int PastaNum1 = 0;
		int PastaNum2 = 0;
		int PastaNum3 = 0;
		int PastaNum4 = 0;
		int PastaNum5 = 0;
		
		int SaladNum1 = 0;
		int SaladNum2 = 0;
		int SaladNum3 = 0;
		int SaladNum4 = 0;
		
		int SeafoodNum1 = 0;
		int SeafoodNum2 = 0;		
		int SeafoodNum3 = 0;
		
		
			if(steak_num_data1 != 0){
				SteakNum1 = steak_num_data1;
			}
			
			if(steak_num_data2 != 0){
				SteakNum2 = steak_num_data2;
			}
			
			if(steak_num_data3 != 0){
				SteakNum3 = steak_num_data3;
			}
			
			if(steak_num_data4 != 0){
				SteakNum4 = steak_num_data4;
			}

			if(appetizer_num_data1 != 0){
				AppetizerNum1 = appetizer_num_data1;
			}
			if(appetizer_num_data2 != 0){
				AppetizerNum2 = appetizer_num_data2;
			}
			if(appetizer_num_data3 != 0){
				AppetizerNum3 = appetizer_num_data3;
			}
			if(appetizer_num_data4 != 0){
				AppetizerNum4 = appetizer_num_data4;
			}
			if(appetizer_num_data5 != 0){
				AppetizerNum5 = appetizer_num_data5;
			}
			if(appetizer_num_data6 != 0){
				AppetizerNum6 = appetizer_num_data6;
			}

			if(pasta_num_data1 != 0){
				PastaNum1 = pasta_num_data1;
			}
			if(pasta_num_data2 != 0){
				PastaNum2 = pasta_num_data2;
			}
			if(pasta_num_data3 != 0){
				PastaNum3 = pasta_num_data3;
			}
			if(pasta_num_data4 != 0){
				PastaNum4 = pasta_num_data4;
			}
			if(pasta_num_data5 != 0){
				PastaNum5 = pasta_num_data5;
			}
			
			if(salad_num_data1 != 0){
				SaladNum1 = salad_num_data1;
			}
			if(salad_num_data2 != 0){
				SaladNum2 = salad_num_data2;
			}
			if(salad_num_data3 != 0){
				SaladNum3 = salad_num_data3;
			}
			if(salad_num_data4 != 0){
				SaladNum4 = salad_num_data4;
			}
			
			if(seafood_num_data1 != 0){
				SeafoodNum1 = seafood_num_data1;
			}
			if(seafood_num_data2!= 0){
				SeafoodNum2 = seafood_num_data2;
			}
			if(seafood_num_data3 != 0){
				SeafoodNum3 = seafood_num_data3;
			}
			
		try{/*
					if(SteakNum1 != 0){
						steak_order1 = jsonStringer.object().key(steak_name_data1).value(SteakNum1).endObject().endObject().toString();
					}
					
					if(SteakNum2 != 0){
						steak_order2 = jsonStringer.object().key(steak_name_data1).value(SteakNum1).endObject().endObject().toString();
					}
					
					if(SteakNum3 != 0){
						steak_order3 = jsonStringer.object().key(steak_name_data1).value(SteakNum1).endObject().endObject().toString();
					}
					
					if(SteakNum4 != 0){
						steak_order4 = jsonStringer.object().key(steak_name_data1).value(SteakNum1).endObject().endObject().toString();
					}
				*/	
			/*
					if(steak_num_data1 !=0){
						A.array().value(steak_name_data1).endArray().value(steak_num_data1);
						menu_value1.object().key(steak_name_data1).value(steak_num_data1).endObject();
					}
*/
			JSONObject jo = new JSONObject();
				  jsonStringer.object();
				  jsonStringer.key("total").value(final_tval_data);
				  jsonStringer.key("id").value("3");
				  jsonStringer.key("numOfMember").value("4");
				  jsonStringer.key("tableNum").array().value(Table_NumberSave_A).endArray();
				  jsonStringer.key("employee").value("이상현");
				  
				  if(SteakNum1>0){
					  jo.put(steak_name_data1, SteakNum1);
				  }
				  if(SteakNum2>0){
					  jo.put(steak_name_data2, SteakNum2);
				  }
				  if(SteakNum3>0){
					  jo.put(steak_name_data3, SteakNum3);
				  }
				  if(SteakNum4>0){
					  jo.put(steak_name_data4, SteakNum4);
				  }
				  
				  if(AppetizerNum1>0){
					  jo.put(appetizer_name_data1, AppetizerNum1);
				  }
				  if(AppetizerNum2>0){
					  jo.put(appetizer_name_data2, AppetizerNum2);
				  }
				  if(AppetizerNum3>0){
					  jo.put(appetizer_name_data3, AppetizerNum3);
				  }
				  if(AppetizerNum4>0){
					  jo.put(appetizer_name_data4, AppetizerNum4);
				  }
				  if(AppetizerNum5>0){
					  jo.put(appetizer_name_data5, AppetizerNum5);
				  }
				  if(AppetizerNum6>0){
					  jo.put(appetizer_name_data6, AppetizerNum6);
				  }

				  if(PastaNum1>0){
					  jo.put(pasta_name_data1, PastaNum1);
				  }
				  if(PastaNum2>0){
					  jo.put(pasta_name_data2, PastaNum2);
				  }
				  if(PastaNum3>0){
					  jo.put(pasta_name_data3, PastaNum3);
				  }
				  if(PastaNum4>0){
					  jo.put(pasta_name_data4, PastaNum4);
				  }
				  if(PastaNum5>0){
					  jo.put(pasta_name_data5, PastaNum5);
				  }
				  
				  if(SaladNum1>0){
					  jo.put(salad_name_data1, SaladNum1);
				  }
				  if(SaladNum2>0){
					  jo.put(salad_name_data2, SaladNum2);
				  }
				  if(SaladNum3>0){
					  jo.put(salad_name_data3, SaladNum3);
				  }
				  if(SaladNum4>0){
					  jo.put(salad_name_data4, SaladNum4);
				  }
				  
				  if(SeafoodNum1>0){
					  jo.put(seafood_name_data1, SeafoodNum1);
				  }
				  if(SeafoodNum2>0){
					  jo.put(seafood_name_data2, SeafoodNum2);
				  }
				  if(SeafoodNum3>0){
					  jo.put(seafood_name_data3, SeafoodNum3);
				  }
				  
				  
				  
				  
				//  jo.put(steak_name_data1, SteakNum1);
				  jsonStringer.key("menu").value(jo);
				  jsonStringer.endObject();
				
				  last_order = jsonStringer.toString();
				  
				  Log.e(TAG,""+ last_order);
				  
				  
//					last_order = jsonStringer.object().key("total").value(final_tval_data).key("id").value("3")
//							.key("numOfMember").value("3")
//							.key("tableNum").array().value(Table_NumberSave_A).endArray()
//							.key("menu").object()
//							.key(steak_name_data1).value(SteakNum1)
//							.key(steak_name_data2).value(steak_num_data2)
//							.key(appetizer_name_data1).value(appetizer_num_data1)
//							.key(appetizer_name_data2).value(appetizer_num_data2)
//							.endObject()
//							.endObject().toString();					
//	
// 메뉴가 22가지 이메뉴들중에서 각각수량갯수가 0개가 들어가면안돼
					// 
		/*
					last_order = jsonStringer.object().key("total").value(final_tval_data).key("id").value("3")
							.key("numOfMember").value("3")
							.key("tableNum").array().value(Table_NumberSave_A).endArray()
							.key("menu").object()
							.key(steak_name_data1).value(steak_num_data1)
							.endObject()
							.endObject().toString();					
			*/
					/*
					last_order2 = menu_value1.object().key("total").value(final_tval_data).key("id").value("0")
							.key("numOfMember").value("3")
							.key("tableNum").array().value(Table_NumberSave_A).endArray()
							.key("menu")
							.endObject().toString();		
					*/
					
		
		Log.d(TAG,"send string = " +final_tval_data);
		Log.d(TAG,"final_data = " +final_tval_data);
		
		}
		catch(JSONException e){
		e.printStackTrace();
		}
		return last_order;
		//return new String[] {steak_order1};
	}
	
	private class sendJsonToServer_last_order extends AsyncTask<String, String, String> {
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
				os.write(JsonPost_last_order().getBytes());
				
				
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

