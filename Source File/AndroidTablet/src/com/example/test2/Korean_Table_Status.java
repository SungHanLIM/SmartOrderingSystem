package com.example.test2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class Korean_Table_Status extends Activity {

	public ImageButton table1_Button;
	public ImageButton table2_Button;
	public ImageButton table3_Button;
	public ImageButton table4_Button;
	public ImageButton table5_Button;
	public ImageButton table6_Button;
	public ImageButton table7_Button;
	public ImageButton table8_Button;
	public ImageButton table9_Button;
	public ImageButton table10_Button;
	public ImageButton table11_Button;
	public ImageButton table12_Button;
	public ImageButton table13_Button;
	public ImageButton table14_Button;
	public ImageButton table15_Button;
	public ImageButton table16_Button;
	public ImageButton table17_Button;
	public ImageButton table18_Button;
	
	public ImageButton table_select_button;

	public int Table_NumberSave_A = 1;
	//public int Table_NumberSave_A = 2;
	
	public TextView select_table_numberA;
	// public TextView select_table_numberB;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.table_state);

		Logo.at.add(this);
		
		table1_Button = (ImageButton) findViewById(R.id.table1_button);
		table2_Button = (ImageButton) findViewById(R.id.table2_button);
		table3_Button = (ImageButton) findViewById(R.id.table3_button);
		table4_Button = (ImageButton) findViewById(R.id.table4_button);
		table5_Button = (ImageButton) findViewById(R.id.table5_button);
		table6_Button = (ImageButton) findViewById(R.id.table6_button);
		table7_Button = (ImageButton) findViewById(R.id.table7_button);
		table8_Button = (ImageButton) findViewById(R.id.table8_button);
		table9_Button = (ImageButton) findViewById(R.id.table9_button);
		table10_Button = (ImageButton) findViewById(R.id.table10_button);
		table11_Button = (ImageButton) findViewById(R.id.table11_button);
		table12_Button = (ImageButton) findViewById(R.id.table12_button);
		table13_Button = (ImageButton) findViewById(R.id.table13_button);
		table14_Button = (ImageButton) findViewById(R.id.table14_button);
		table15_Button = (ImageButton) findViewById(R.id.table15_button);
		table16_Button = (ImageButton) findViewById(R.id.table16_button);
		table17_Button = (ImageButton) findViewById(R.id.table17_button);
		table18_Button = (ImageButton) findViewById(R.id.table18_button);
		
		table_select_button = (ImageButton) findViewById(R.id.table_select_button);
		
		select_table_numberA = (TextView) findViewById(R.id.select_table_numberA);
		// select_table_numberB = (TextView) findViewById(R.id.select_table_numberB);
		
		table1_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				// 텍스트 출력했고, 선택된 번호 저장했고, 다음 액티비티로 테이블 넘버를 보내야함. 
				int table_number = 1;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});

		table2_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 2;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table3_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 3;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table4_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 4;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});

		table5_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 5;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table6_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 6;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table7_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 7;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table8_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 8;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table9_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 9;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table10_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 10;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table11_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 11;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table12_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 12;
				
				select_table_numberA.setText(""+table_number);
				
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table13_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 13;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table14_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 14;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table15_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 15;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table16_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 16;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table17_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 17;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
		
		table18_Button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 텍스트 출력하게 하고 선택된 번호 저장해서 보내야한다.
				int table_number = 18;
				
				select_table_numberA.setText(""+table_number);
				
				Table_NumberSave_A = table_number;
			}
		});
	
		table_select_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// 여기서 테이블번호를 보내야함. 다음액티비티로
				
				final Intent intent = new Intent(Korean_Table_Status.this, Korean_OrderDetail.class);
				
				AlertDialog.Builder alert_confirm = new AlertDialog.Builder(Korean_Table_Status.this);
				alert_confirm.setMessage("현재 좌석은"+"   "+Table_NumberSave_A +" 입니다."+"\n\n\n\n ---------------------------------------------------------------------------\n\n\n\n 좌석선택을 완료하시겠습니까? (^_^)").setCancelable(false).setPositiveButton("예",
				new DialogInterface.OnClickListener() {
				    @Override
				    public void onClick(DialogInterface dialog, int which) {
				
			
				
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
					
					intent.putExtra("Table_NumberSave_A", Table_NumberSave_A);
				//	intent.putExtra("Table_NumberSave_A", Table_NumberSave_A);
					
				}
				catch(Exception e){
					
				}
				
				startActivity(intent);
				    }
				}).setNegativeButton("아니요",
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
		});
	}
}
