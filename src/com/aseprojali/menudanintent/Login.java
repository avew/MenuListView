package com.aseprojali.menudanintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity implements OnClickListener {
	EditText id, pass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		findViewById(R.id.btnSubmit).setOnClickListener(this);
		findViewById(R.id.btnReset).setOnClickListener(this);
		id = (EditText) findViewById(R.id.edtId);
		pass = (EditText) findViewById(R.id.edtPass);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// Memakai Intent
		// Intent intent = null;
		switch (v.getId()) {
		case R.id.btnSubmit:
			hardCodeLogin();
			break;
		default:
			break;
		}
	}

	public void hardCodeLogin() {
		// hardcode login sebelum memakai service
		if (id.getText().toString().equalsIgnoreCase("admin")
				&& pass.getText().toString().equalsIgnoreCase("admin")) {
			// akan pindah ke activity baru
			// Toast.makeText(this, "Login Sukses " +
			// txtUsername.getText().toString() , Toast.LENGTH_LONG).show();
			Intent intent = new Intent(this, UsingIntent.class);
			// intent.putExtra("username", id.getText().toString());
			startActivity(intent);
		} else {
			Toast.makeText(this, "Maaf username dan password anda salah!!!",
					Toast.LENGTH_LONG).show();
		}
	}

}
