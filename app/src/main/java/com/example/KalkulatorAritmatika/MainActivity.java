package com.example.KalkulatorAritmatika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4;
    TextView tv1;
    EditText bi1, bi2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bi1 = (EditText) findViewById(R.id.edt1);
        bi2 = (EditText) findViewById(R.id.edt2);
        tv1 = (TextView) findViewById(R.id.hasil);
        rb1 = (RadioButton) findViewById(R.id.radio_tambah);
        rb2 = (RadioButton) findViewById(R.id.radio_kurang);
        rb3 = (RadioButton) findViewById(R.id.radio_kali);
        rb4 = (RadioButton) findViewById(R.id.radio_bagi);

    }

    public void calculator(View view){
        String bil1_String = bi1.getText().toString();
        String bil2_String = bi2.getText().toString();

        int bil1_int = Integer.parseInt(bil1_String);
        int bil2_int = Integer.parseInt(bil2_String);

        if (rb1.isChecked() == true){
            int tambah = bil1_int + bil2_int;
            String hasil = String.valueOf(tambah);
            tv1.setText(hasil);

        }else if (rb2.isChecked() == true){
            int kurang = bil1_int - bil2_int;
            String hasil = String.valueOf(kurang);
            tv1.setText(hasil);

        }else if (rb3.isChecked() == true) {
            int kali = bil1_int * bil2_int;
            String hasil = String.valueOf(kali);
            tv1.setText(hasil);

        }else if (rb4.isChecked() == true) {
            int bagi = bil1_int / bil2_int;
            tv1.setText(Integer.toString(bagi));
        }



    }


}



