package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView txt_biodata;
    private EditText edt_name;
    private EditText edt_surname;
    private EditText edt_fathername;
    private EditText edt_qc;
    private EditText edt_mobile;
    private TextView txt_gender;
    private RadioGroup rg_gender;
    private RadioButton rb_male;
    private RadioButton rb_female;
    private TextView txt_hobby;
    private CheckBox cb_reading;
    private CheckBox cb_swiming;
    private CheckBox cb_traveling;
    private SeekBar sb_age;
    private TextView txt_age;
    private Button btn_submit;
    String gender;
    String Check=" ",Check1=" ",Check2=" ", name,age, fathername, surname, qc, mobile;
    CheckBox reading, traveling, swiming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding();

        Click();

    }

    void Click() {
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetData();
                check();
                if (rg_gender.getCheckedRadioButtonId() == R.id.rb_male) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }
                Intent intent = new Intent(MainActivity.this, viewdata.class);
                intent.putExtra("gender", gender);
                intent.putExtra("Check", Check);
                intent.putExtra("Check1", Check1);
                intent.putExtra("Check2", Check2);
                intent.putExtra("name", name);
                intent.putExtra("fathername", fathername);
                intent.putExtra("surname", surname);
                intent.putExtra("qc", qc);
                intent.putExtra("mobile", mobile);
                intent.putExtra("age",age);
                startActivity(intent);
            }
        });
        sb_age.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                txt_age.setText(""+i);
                age=""+i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    void check() {
        if (cb_reading.isChecked()) {
            Check = "Reading";
        }

        if (cb_swiming.isChecked()) {
            Check1 = "Swiming";
        }

        if (cb_traveling.isChecked()) {
            Check2 = "Traveling";
        }
    }

    void GetData() {
        name = edt_name.getText().toString();
        fathername = edt_fathername.getText().toString();
        surname = edt_surname.getText().toString();
        qc = edt_qc.getText().toString();
        mobile = edt_mobile.getText().toString();

    }

    void Binding() {
        txt_biodata = findViewById(R.id.txt_biodata);
        edt_name = findViewById(R.id.edt_name);
        edt_fathername = findViewById(R.id.edt_fathername);
        edt_surname = findViewById(R.id.edt_surname);
        edt_qc = findViewById(R.id.edt_qc);
        edt_mobile = findViewById(R.id.edt_mobile);
        txt_gender = findViewById(R.id.txt_gender);
        rg_gender = findViewById(R.id.rg_gender);
        rb_male = findViewById(R.id.rb_male);
        rb_female = findViewById(R.id.rb_female);
        txt_hobby = findViewById(R.id.txt_hobby);
        cb_reading = findViewById(R.id.cb_reading);
        cb_swiming = findViewById(R.id.cb_swiming);
        cb_traveling = findViewById(R.id.cb_traveling);
        sb_age = findViewById(R.id.sb_age);
        txt_age = findViewById(R.id.txt_age);
        btn_submit = findViewById(R.id.btn_submit);
    }
}