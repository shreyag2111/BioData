package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class viewdata extends AppCompatActivity {

    private TextView txt_view_name1;
    private TextView txt_view_fathername1;
    private TextView txt_view_surname1;
    private TextView txt_view_qc1;
    private TextView txt_view_mobile1;
    private TextView txt_view_gender1;
    private TextView txt_view_hobby1;
    private TextView txt_view_age1;
    String age, gender, Check;
    String Check1, Check2, name, fathername, surname, qc, mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdata);
        Binding();
        getdata();
        SetData();
    }

    void SetData() {
        txt_view_name1.setText(name);
        txt_view_surname1.setText(surname);
        txt_view_fathername1.setText(fathername);
        txt_view_qc1.setText(qc);
        txt_view_mobile1.setText(mobile);
        txt_view_gender1.setText(gender);
        txt_view_hobby1.setText(Check + Check2 + Check1);
        txt_view_age1.setText(age);
    }

    void getdata() {
        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        Check1 = intent.getStringExtra("Check1");
        Check2 = intent.getStringExtra("Check2");
        gender = intent.getStringExtra("gender");
        fathername = intent.getStringExtra("fathername");
        surname = intent.getStringExtra("surname");
        qc = intent.getStringExtra("qc");
        mobile = intent.getStringExtra("mobile");
        Check = intent.getStringExtra("Check");
        age = intent.getStringExtra("age");
    }

    void Binding() {
        txt_view_name1 = findViewById(R.id.txt_view_name1);
        txt_view_fathername1 = findViewById(R.id.txt_view_fathername1);
        txt_view_surname1 = findViewById(R.id.txt_view_surname1);
        txt_view_qc1 = findViewById(R.id.txt_view_qc1);
        txt_view_mobile1 = findViewById(R.id.txt_view_mobile1);
        txt_view_gender1 = findViewById(R.id.txt_view_gender1);
        txt_view_hobby1 = findViewById(R.id.txt_view_hobby1);
        txt_view_age1 = findViewById(R.id.txt_view_age1);

    }
}