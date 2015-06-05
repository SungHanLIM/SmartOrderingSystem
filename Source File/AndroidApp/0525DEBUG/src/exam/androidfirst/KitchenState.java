package exam.androidfirst;

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
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

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

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class KitchenState extends ActionBarActivity {
	View orderPage, seatPage;	//보여줄 페이지 주문현황 좌석현황 

	//좌석현황 테이블 변수선언 
	Button mtable1, mtable2, mtable3, mtable4, mtable5, mtable6, mtable7, mtable8, mtable9, mtable10, mtable11, mtable12, mtable13, mtable14, mtable15, mtable16, mtable17, mtable18;
	
	//파싱에 필요한 것
	public final static String TAG = "LOG";
	private GregorianCalendar mClendar;
	private Handler mHandler;
	private Runnable mRunnable;
	
	//주문목록 리스트뷰 1
	ArrayList<String> mItem = new ArrayList<String>();
	ArrayAdapter<String> mAdapter;
	ListView mList;
	
	String[] S = new String[100];	// 리스트에 보여줄 한행의 문자열 변수 .
	int[] ID = new int[100];		// 서버와 통신위한 orderMenuID 저장할 변수.
	static int Value;				// 그때 그때 클릭한 position의 orderMenuID 저장변수. 
	
	
	//kitchenstate 화면 
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        
    	
        //전체화면 만들기
    	Window kwin = getWindow();
    	kwin.requestFeature(Window.FEATURE_NO_TITLE);
    	kwin.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    	setContentView(R.layout.kitchenstate);
    	
        
        orderPage = findViewById(R.id.orderpage);
        seatPage = findViewById(R.id.seatpage);
        
        findViewById(R.id.orderbtn).setOnClickListener(mClickListener);
        findViewById(R.id.seatbtn).setOnClickListener(mClickListener);
        
        //주문목록 리스트뷰 2
        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mItem);
        mList = (ListView)findViewById(R.id.list);
        mList.setAdapter(mAdapter);
        mList.setOnItemClickListener(mItemClickListener);	//리스트 클릭이벤트 선언.

        
        //좌석현황 파싱할 테이블변수
        mtable1  = (Button)findViewById(R.id.table1);
        mtable2  = (Button)findViewById(R.id.table2);
        mtable3  = (Button)findViewById(R.id.table3);
        mtable4  = (Button)findViewById(R.id.table4);
        mtable5  = (Button)findViewById(R.id.table5);
        mtable6  = (Button)findViewById(R.id.table6);
        mtable7  = (Button)findViewById(R.id.table7);
        mtable8  = (Button)findViewById(R.id.table8);
        mtable9  = (Button)findViewById(R.id.table9);
        mtable10 = (Button)findViewById(R.id.table10);
        mtable11 = (Button)findViewById(R.id.table11);
        mtable12 = (Button)findViewById(R.id.table12);
        mtable13 = (Button)findViewById(R.id.table13);
        mtable14 = (Button)findViewById(R.id.table14);
        mtable15 = (Button)findViewById(R.id.table15);
        mtable16 = (Button)findViewById(R.id.table16);
        mtable17 = (Button)findViewById(R.id.table17);
        mtable18 = (Button)findViewById(R.id.table18);
        
        //주문목록 파싱필요 버튼 클릭이벤트 선언.
        Button p1Button = (Button)this.findViewById(R.id.parse1);						//새로고침할 버튼 변수 정의 "새로고침"
        p1Button.setOnClickListener(new Button.OnClickListener(){
        	public void onClick(View v){ 												//버튼 누르면 현재 주문 상황 새로고침
        		new ReadJSONFeed1().execute("http://117.16.231.212:8010/getOrderList");	//읽어올 url
        	}
        });
        
        TimerTask myTask_g = new TimerTask(){
        	public void run(){
        		new ReadJSONFeed1().execute("http://117.16.231.212:8010/getOrderList");	//읽어올 url
        	}
        };
        
        Timer timer1 = new Timer();
        timer1.schedule(myTask_g, 10000, 2000); 	// 10초 기다리고 2초마다 새로고침.안그러면 에러남. 
        
        //좌석현황 파싱필요 버튼 클릭이벤트 선언.
        Button pButton = (Button)this.findViewById(R.id.parse);	 
        //새로고침할 버튼 변수 정의 "좌석현황"
        pButton.setOnClickListener(new Button.OnClickListener(){
        	public void onClick(View v){ //버튼 누르면 현재 주문 상황 새로고침
        		new ReadJSONFeed().execute("http://117.16.231.212:8010/tableState");	//읽어올 url
        	}
        });
        
        TimerTask myTask = new TimerTask(){
        	public void run(){
        		new ReadJSONFeed().execute("http://117.16.231.212:8010/tableState");	//읽어올 url
        	}
        };
        
        Timer timer = new Timer();
        timer.schedule(myTask, 10000, 1000); 	//  10초 기다리고 2초마다 새로고침
        
        //쓰레드 죽는것 방지하기위해. 
    	/*
        try {  
            Class.forName("android.os.AsyncTask");  
        } catch (ClassNotFoundException e) {  
        }  
    	*/
    }
    
    //페이지 전환 레이아웃 설정 
    Button.OnClickListener mClickListener = new Button.OnClickListener(){
    	public void onClick(View v){
    		orderPage.setVisibility(View.INVISIBLE);
    		seatPage.setVisibility(View.INVISIBLE);
   
    	switch (v.getId()){
    	
    	case R.id.orderbtn:
    		orderPage.setVisibility(View.VISIBLE);
    		break;

    	case R.id.seatbtn:
    		seatPage.setVisibility(View.VISIBLE);
    		break;
    	}
    }
    };

    //Home 버튼 click
    public void hOnClick(View v)
    {
    	finish();
    }
    
    //리스트 클릭이벤트 생성.
    AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener(){
    	public void onItemClick(AdapterView<?> parent, View view, int position, long id){
    		
    		//클릭하면 삭제되게.
    		if(position != ListView.INVALID_POSITION)
    		{
    			mItem.remove(position);
    			Value = ID[position-1];
    			//푸쉬사용위해 선언부분.
    	    	//조리완료.
    	    	sendJsonToServer_list list1;								//리스트 변수 선언.
    	    	list1 = new sendJsonToServer_list();						//리스트 변수 객체 생성.
    	    	list1.execute("http://117.16.231.212:8010/finishCook");		// 푸쉬 URL 설정.
    			
    			mList.clearChoices();
    			mAdapter.notifyDataSetChanged();
    		}
    	}
    };
    
    
    
    
    //주문목록 파싱 위해 필요한 부분 
    private class ReadJSONFeed1 extends AsyncTask <String, String, String>
    {
    	protected void onPreExecute() { } //안씀.

		@Override
		protected String doInBackground(String... urls) { // 백그라운드 작업

			HttpClient httpclient = new DefaultHttpClient();
			StringBuilder builder = new StringBuilder();

			HttpGet httpget = new HttpGet(urls[0]);

			try {
				HttpResponse response = httpclient.execute(httpget);
				StatusLine statusLine = response.getStatusLine();
				int statusCode = statusLine.getStatusCode();
				
				if (statusCode == 200) {
					HttpEntity entity = response.getEntity();

					InputStream content = entity.getContent(); // 사람이 읽을수 있게해줌
					BufferedReader reader = new BufferedReader(// 사람이 읽을수 있게해줌

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
		
		protected void onPostExecute(String Json) {	
			
			mItem.clear();										// 리스트뷰 초기화.
		    mItem.add("Table |  Menu (Count)");					// 리스트뷰 첫번쨰 표기할 리스트.
			
			try {				
				
				JSONObject obj = new JSONObject(Json);	
				JSONArray jArr = obj.getJSONArray("data");
				
				for (int i = 0; i < jArr.length(); i++)
				{
	    			JSONObject jObject = jArr.getJSONObject(i);
	    		
	    			String Tn = jObject.getString("tableNum");	// 테이블번호 
	    			String Na = jObject.getString("name");		// 메뉴 
	    			int Co = jObject.getInt("count");			// 메뉴 갯수 
	    			
	    			ID[i] = jObject.getInt("orderMenuID");		// 주문아이디 저장해놓기.
	    			
	    			S[i] = "   " + Tn + "   | "+ Na + "(" + Co + ")";
	    			
	    			mItem.add(S[i]);							//리스트에 추가 
	    			mList.setAdapter(mAdapter);					//어댑터로 리스트에 연결. 
				}
				
			}catch (JSONException e) {
				e.printStackTrace();
				Log.e("serving_Success","Exception="+e);
			}
		}
    }
    
    //좌석현황 파싱위해 필요한 부분.
    private class ReadJSONFeed extends AsyncTask <String, String, String>
    {
    	protected void onPreExecute() { } //안씀.

    	
		@Override
		protected String doInBackground(String... urls) { // 백그라운드 작업

			HttpClient httpclient = new DefaultHttpClient();
			StringBuilder builder = new StringBuilder();

			HttpGet httpget = new HttpGet(urls[0]);

			try {
				HttpResponse response = httpclient.execute(httpget);
				StatusLine statusLine = response.getStatusLine();
				int statusCode = statusLine.getStatusCode();
				
				if (statusCode == 200) {
					HttpEntity entity = response.getEntity();

					InputStream content = entity.getContent(); // 사람이 읽을수 있게해줌
					BufferedReader reader = new BufferedReader(// 사람이 읽을수 있게해줌

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
		
		protected void onPostExecute(String Json) {	
			
			try {				
				
				JSONObject obj = new JSONObject(Json);
				JSONArray jArr = obj.getJSONArray("data");
								
				Button mtable1 = (Button)findViewById(R.id.table1);
		        Button mtable2 = (Button)findViewById(R.id.table2);
		        Button mtable3 = (Button)findViewById(R.id.table3);
		        Button mtable4 = (Button)findViewById(R.id.table4);
		        Button mtable5 = (Button)findViewById(R.id.table5);
		        Button mtable6 = (Button)findViewById(R.id.table6);
		        Button mtable7 = (Button)findViewById(R.id.table7);
		        Button mtable8 = (Button)findViewById(R.id.table8);
		        Button mtable9 = (Button)findViewById(R.id.table9);
		        Button mtable10 = (Button)findViewById(R.id.table10);
		        Button mtable11 = (Button)findViewById(R.id.table11);
		        Button mtable12 = (Button)findViewById(R.id.table12);
		        Button mtable13 = (Button)findViewById(R.id.table13);
		        Button mtable14 = (Button)findViewById(R.id.table14);
		        Button mtable15 = (Button)findViewById(R.id.table15);
		        Button mtable16 = (Button)findViewById(R.id.table16);
		        Button mtable17 = (Button)findViewById(R.id.table17);
		        Button mtable18 = (Button)findViewById(R.id.table18);
		
		       
		        
				for (int i = 0; i < jArr.length(); i++)
				{
					
	    			JSONObject jObject = jArr.getJSONObject(i);
	    			
	    			
	    			if((jObject.getInt("tableNum"))==1)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable1.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable1.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable1.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable1.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==2)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable2.setBackgroundResource(R.drawable.table_icon2);
		    			else if((jObject.getString("state")).equals("order"))	mtable2.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable2.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable2.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==3)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable3.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable3.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable3.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable3.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==4)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable4.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable4.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable4.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable4.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==5)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable5.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable5.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable5.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable5.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==6)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable6.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable6.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable6.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable6.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==7)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable7.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable7.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable7.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable7.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==8)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable8.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable8.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable8.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable8.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==9)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable9.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable9.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable9.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable9.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==10)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable10.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable10.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable10.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable10.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==11)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable11.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable11.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable11.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable11.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==12)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable12.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable12.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable12.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable12.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==13)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable13.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable13.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable13.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable13.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==14)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable14.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable14.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable14.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable14.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==15)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable15.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable15.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable15.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable15.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==16)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable16.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable16.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable16.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable16.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==17)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable17.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable17.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable17.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable17.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
	    			else if((jObject.getInt("tableNum"))==18)
	    			{
	    				if((jObject.getString("state")).equals("empty"))		mtable18.setBackgroundResource(R.drawable.table_icon2);
	    				else if((jObject.getString("state")).equals("order"))	mtable18.setBackgroundResource(R.drawable.order_icon);
	    				else if((jObject.getString("state")).equals("have"))	mtable18.setBackgroundResource(R.drawable.have_icon);
	    				else if((jObject.getString("state")).equals("add"))		mtable18.setBackgroundResource(R.drawable.add_icon);
	    			}
	    			
				}
				
			}catch (JSONException e) {
				e.printStackTrace();
			}
		}
    }
    

    
    //포스트 부분.
    public static String JsonPost_list(){
		
		String list ="";
		JSONStringer jsonStringer = new JSONStringer();
		
		try{
		list = jsonStringer.object().key("orderMenuID").value(Value).endObject().toString();
		
		}
		catch(JSONException e){
			e.printStackTrace();
		}
		return list;
	}
	
	private class sendJsonToServer_list extends AsyncTask<String, String, String> {
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
				conn.setConnectTimeout(20*1000);	//2에서 20로. ; 하나 제거 
				conn.setReadTimeout(1*1000); 	//1에서 1로 
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Cache-Control", "no-cache");
				conn.setRequestProperty("Content-Type", "application/json");
				conn.setRequestProperty("Accept", "application/json");
				conn.setDoOutput(true);
				conn.setDoInput(true);
				
				os = conn.getOutputStream();
				os.write(JsonPost_list().getBytes());
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
	}
}