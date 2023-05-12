package com.minhpt.lab2_ph32719;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtResult = findViewById(R.id.txtResult);
        EditText edtName = findViewById(R.id.edtName);
        EditText edtID = findViewById(R.id.edtID);
        EditText edtAge = findViewById(R.id.edtAge);
        RadioButton rdoMale = findViewById(R.id.rdoMale);
        RadioButton rdoFemale = findViewById(R.id.rdoFemale);
        CheckBox chkFootball = findViewById(R.id.chkFootball);
        CheckBox chkPlayGame = findViewById(R.id.PlayGame);
        Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String id = edtID.getText().toString();
                String age = edtAge.getText().toString();
                String gender = rdoMale.isChecked() ? rdoMale.getText().toString() : rdoFemale.isChecked() ? rdoFemale.getText().toString() : "Chưa chọn giới tính";
                String interest = chkFootball.isChecked() && chkPlayGame.isChecked() ? "Đá bóng và chơi game" : chkFootball.isChecked() ? chkFootball.getText().toString() : chkPlayGame.isChecked() ? chkPlayGame.getText().toString() : "Không thích gì cả.";
                txtResult.setText("Tôi tên: " +name+ "\n" + "MSSV: " +id+ "\n" + "Tuổi: " +age+ "\n" + "Giới tính: " +gender+ "\n" + "Sở thích: " +interest );
            }
        });
    }
}