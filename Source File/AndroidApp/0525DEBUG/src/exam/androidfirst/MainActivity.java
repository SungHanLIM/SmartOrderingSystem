package exam.androidfirst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.gcm.GCMRegistrar;

public class MainActivity extends ActionBarActivity{

	//layout activity_main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        
        //전체화면 만들기
    	Window win = getWindow();
    	win.requestFeature(Window.FEATURE_NO_TITLE);
    	win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    	
    	setContentView(R.layout.activity_main);
    	registerGcm();
    	
    	 //쓰레드 죽는것 방지하기위해. 
    	/*
    	try {  
            Class.forName("android.os.AsyncTask");  
        } catch (ClassNotFoundException e) {  
        }  
        */
    }
    
    public void registerGcm(){
    	
    	GCMRegistrar.checkDevice(this);
    	GCMRegistrar.checkManifest(this);
    	
    	final String regId = GCMRegistrar.getRegistrationId(this);
    	
    	if(regId.equals("")){
    		GCMRegistrar.register(this, "1044525742912");
    	}else{
    		Log.e("id", regId);
    	}
    }
    
   
    //Kitchen 버튼 click  KitchenState
    public void kOnClick(View v)
    {
    	Intent intent = new Intent(this, KitchenState.class);
    	startActivity(intent);
    }
  
    //Server 버튼을 click  ServerState
    public void sOnClick(View v)
    {
    	Intent intent = new Intent(this, ServerState.class);
    	startActivity(intent);
    }
    

}
