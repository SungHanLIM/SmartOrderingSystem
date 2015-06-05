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
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class Korean_Fragment_Favorite extends Fragment implements
OnItemSelectedListener {
	
	static public int favorite_numInt1;
	static public int favorite_numInt2;
	static public int favorite_numInt3;
	static public int favorite_numInt4;
	static public int favorite_numInt5;
	static public int favorite_numInt6;
	
	static public int favorite_total1;
	static public int favorite_total2;
	static public int favorite_total3;
	static public int favorite_total4;
	static public int favorite_total5;
	static public int favorite_total6;
	static public int favorite_final_total;
	
	static public String favorite1_name;
	static public String favorite2_name;
	static public String favorite3_name;
	static public String favorite4_name;
	static public String favorite5_name;
	static public String favorite6_name;
	
	Spinner favorite_spinner1;
	Spinner favorite_spinner2;
	Spinner favorite_spinner3;
	Spinner favorite_spinner4;
	Spinner favorite_spinner5;
	Spinner favorite_spinner6;

	String[] items = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
			"22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
			"33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43",
			"44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54",
			"55", "56", "57", "58", "59", "59", "60", "61", "62", "63", "64",
			"65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75",
			"76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86",
			"87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97",
			"98", "99", "100", "101", "102", "103", "104", "105", "106", "107",
			"108", "109", "110", "111", "112", "113", "114", "115", "116",
			"117", "118", "119", "120", "121", "122", "123", "124", "125",
			"126", "127", "128", "129", "130", "131", "132", "133", "134",
			"135", "136", "137", "138", "139", "140", "141", "142", "143",
			"144", "145", "146", "147", "148", "149", "150", "151", "152",
			"153", "154", "155", "156", "157", "158", "159", "160", "161",
			"162", "163", "164", "165", "166", "167", "168", "169", "170",
			"171", "172", "173", "174", "175", "176", "177", "178", "179",
			"180", "181", "182", "183", "184", "185", "186", "187", "188",
			"189", "190", "191", "192", "193", "194", "195", "196", "197",
			"198", "199", "200" };

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.korean_fragment_favorite,container, false);
		
		   //Button button = (Button) view.findViewById(R.id.popup_button1);
		   
		
		ScrollView favorite_contents_popup1 = (ScrollView) view.findViewById(R.id.favorite_contents_popup1);
		ScrollView favorite_contents_popup2 = (ScrollView) view.findViewById(R.id.favorite_contents_popup2);
		ScrollView favorite_contents_popup3 = (ScrollView) view.findViewById(R.id.favorite_contents_popup3);
		ScrollView favorite_contents_popup4 = (ScrollView) view.findViewById(R.id.favorite_contents_popup4);
		ScrollView favorite_contents_popup5 = (ScrollView) view.findViewById(R.id.favorite_contents_popup5);
		ScrollView favorite_contents_popup6 = (ScrollView) view.findViewById(R.id.favorite_contents_popup6);
		
		
		final View layout = inflater.inflate(R.layout.favorite1_contents,(ViewGroup) favorite_contents_popup1);
		final View layout2 = inflater.inflate(R.layout.favorite2_contents,(ViewGroup) favorite_contents_popup2);
		final View layout3 = inflater.inflate(R.layout.favorite3_contents,(ViewGroup) favorite_contents_popup3);
		final View layout4 = inflater.inflate(R.layout.favorite4_contents,(ViewGroup) favorite_contents_popup4);
		final View layout5 = inflater.inflate(R.layout.favorite5_contents,(ViewGroup) favorite_contents_popup5);
		final View layout6 = inflater.inflate(R.layout.favorite6_contents,(ViewGroup) favorite_contents_popup6);
		
		
		
	   return view;
   }

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
}