package com.example.da08.intentbasic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtcall, txtUrl;
    Button btncall, btnUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtcall = (EditText) findViewById(R.id.txtcall);
        txtUrl = (EditText) findViewById(R.id.txtUrl);
        btncall = (Button) findViewById(R.id.btncall);
        btnUrl = (Button) findViewById(R.id.btnUrl);

        btncall.setOnClickListener(new View.OnClickListener() {  // 버튼 누르면 다이얼로 이동되게
            @Override
            public void onClick(View view) {
                String phoneNumber = txtcall.getText().toString();
                Uri uri = Uri.parse("tel:" + phoneNumber);
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });

        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = txtUrl.getText().toString();
                Uri uri = Uri.parse("http://" + url);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

            }
        });
    }
}
