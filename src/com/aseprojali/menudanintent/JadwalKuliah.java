package com.aseprojali.menudanintent;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class JadwalKuliah extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jadwal_kuliah);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jadwal_kuliah, menu);
		return true;
	}

}
