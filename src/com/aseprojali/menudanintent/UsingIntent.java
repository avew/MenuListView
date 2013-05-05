package com.aseprojali.menudanintent;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class UsingIntent extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Menyusun List Menu Yang Akan Ditampilkan
		String[] menu = new String[] { "Jadwal Kuliah", "Absen Kuliah",
				"Transkip Kuliah", "Nilai Kuliah" };

		// Menset nilai array pada adapter ke dalam list adapter sehingga data
		// pada array akan dimunculkan
		// dalam list
		this.setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, menu));
	}

	// Override method onListItemClick
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		// Menangkap nilai list item yang di klik
		Object o = this.getListAdapter().getItem(position);
		String pilihan = o.toString();
		tampilkanPilihan(pilihan);
	}

	// Tampilkan activity sesuai yang dipilih
	private void tampilkanPilihan(String pilihan) {
		try {
			Intent i = null;
			if (pilihan.equals("Jadwal Kuliah")) {
				i = new Intent(this, JadwalKuliah.class);
			} else if (pilihan.equals("Absen Kuliah")) {
				i = new Intent(this, AbsenKuliah.class);
			} else {
				Toast.makeText(this,
						"Anda memilih :" + pilihan + "\n Actionya belum dibuat",
						Toast.LENGTH_LONG).show();
			}
			startActivity(i);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.using_intent, menu);
		return true;
	}

}
