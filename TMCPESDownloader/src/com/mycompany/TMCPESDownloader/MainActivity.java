package com.mycompany.TMCPESDownloader;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View;
import android.widget.*;
import android.text.util.*;
import android.content.*;
import java.util.regex.*;
import android.webkit.*;
import android.net.*;

public class MainActivity extends Activity
	
{
	@Override 
	public void onBackPressed(){
		setContentView(R.layout.main);
		}	
				
	Button button;
	Button MS;
	Button RJ;
	Button ET;
	Button ED;
	Button EM;
	Button EMD;
	Button TM;
	Button AM;
	Button CA;
	Button PD;
	Button MD;
	Button AV;
	Button RD;
	Button UD;
	Button DH;
	Button US;
	Button HM;
	Button PM;
	Button TP;
	Button SD; 
	Button JA;
	Button WZ;
	Button V;
	Button EX;	
    Dialog dialog;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main); 		
		button = (Button)findViewById(R.id.myButton);
		TP = (Button)findViewById(R.id.TP);
		SD = (Button)findViewById(R.id.SD);		
		JA = (Button)findViewById(R.id.JA);
		AV = (Button)findViewById(R.id.AV);
		EM = (Button)findViewById(R.id.EM);
		EMD = (Button)findViewById(R.id.EMD);
		UD = (Button)findViewById(R.id.UD);
		RD = (Button)findViewById(R.id.RD);
		PD = (Button)findViewById(R.id.PD);
		MD = (Button)findViewById(R.id.MD);
		TM = (Button)findViewById(R.id.TM);
		DH = (Button)findViewById(R.id.DH);
		CA = (Button)findViewById(R.id.CA);
		US = (Button)findViewById(R.id.US);
		WZ = (Button)findViewById(R.id.WZ);
		V = (Button)findViewById(R.id.V);
		MS = (Button)findViewById(R.id.MS);
		RJ = (Button)findViewById(R.id.RJ);
		ET = (Button)findViewById(R.id.ET);
		ED = (Button)findViewById(R.id.ED);
		EX = (Button)findViewById(R.id.EX);}
		
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {		
			case R.id.about:
				setContentView(R.layout.aboutmain);
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
			
	public void ClickMe(View v){
    // setContentView(R.layout.newm);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
	   setContentView(R.layout.newmain);}		
	   
	public void ClickTM(View v){
		// setContentView(R.layout.TM);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Coming Soon...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();}						
	   
	public void ClickMS(View v){
		// setContentView(R.layout.m);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.mainer);}			
	
	public void ClickRJ(View v){
		// setContentView(R.layout.RJ);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.addsmain);}		
		
	public void ClickCA(View v){
		// setContentView(R.layout.CA);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.hehe);}						
		
	public void ClickAV(View v){
		// press download
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://db.tt/BNYRI7kU"))); }
	
	public void ClickDH(View v){
		// press download
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://db.tt/8CcvnoEv"))); }
		
	public void ClickPD(View v){
		// press download
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://db.tt/8YyH76PA"))); }

	public void ClickRD(View v){
		// press download
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://db.tt/oKrgyqIF"))); }	
		
	public void ClickED(View v){
		// press download
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://db.tt/KwC6mClZ"))); }		
		
	public void ClickMD(View v){
		// press download
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://db.tt/OzCAYbdV"))); }	

	public void ClickEMD(View v){
		// press download
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://db.tt/614anA8h"))); }	
		
	public void ClickUD(View v){
		// press download
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://db.tt/BqCd4oXT"))); }				
	
    public void ClickET(View v){
		// setContentView(R.layout.ET);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.plentymain);}				
		
	public void ClickUS(View v){
		// setContentView(R.layout.US);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.woahmain);}			
		 
	public void ClickEM(View v){
		// setContentView(R.layout.EM);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.wholemain);}			
	 
	public void ClickAM(View v){
		// setContentView(R.layout.wem);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.wemain);}
	
	public void ClickHM(View v){
		// setContentView(R.layout.mainm);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.mainm);}	
				 
	public void ClickPM(View v){
		// setContentView(R.layout.maint);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.maint);}
	
	public void ClickTP(View v){
	// setContentView(R.layout.morem);		
		Toast waitToast = Toast.makeText(getApplicationContext(), "Coming Soon...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();}		  

	public void ClickSD(View v){
	//	setContentView(R.layout.extram);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.extramain);}
				  
	public void ClickJA(View v){
	//  setContentView(R.layout.alotm);
	    Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
		setContentView(R.layout.alotmain);}
		
	public void ClickWZ(View v){
	// setContentView(R.layout.manym);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
	   setContentView(R.layout.manymain);}
	   
	public void ClickV(View v){
	// setContentView(R.layout.triplem);
		Toast waitToast = Toast.makeText(getApplicationContext(), "Please wait...", Toast.LENGTH_LONG);
		waitToast.setGravity(Gravity.BOTTOM, 0, 0);
		waitToast.show();		
	   setContentView(R.layout.triplemain);}
		
	public void ClickEX(View v){
		AlertDialog.Builder builder = new AlertDialog.Builder((Context)(this));
	    builder.setCancelable(false);
	    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					MainActivity.this.finish();
				}
			});		
		builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					dialog.cancel();
				}
			});
		AlertDialog alert = builder.create();		
		alert.setTitle("Exit");
		alert.setMessage("Are you sure you want to exit?");
		alert.show();
		
	
}} 
