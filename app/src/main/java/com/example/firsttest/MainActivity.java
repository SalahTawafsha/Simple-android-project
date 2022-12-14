package com.example.firsttest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText name;
    private RadioButton male;
    private RadioButton female;
    private RadioGroup sexGroup;
    private RadioButton selected;
    private Switch sw;
    private Spinner sp;
    private TextView result;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        implement();

        submit.setOnClickListener(e -> {
                    String s = name.getText().toString();
                    int id = sexGroup.getCheckedRadioButtonId();
                    if (id != -1) {
                        selected = findViewById(id);
                        s += "\n" + selected.getText();
                    }
                    if (sw.isChecked())
                        s += "\n" + "congratulations, it's your last year !";

                    result.setText(s + "\n" + sp.getSelectedItem().toString());

                }
        );


    }

    private void implement() {
        name = findViewById(R.id.edit1);
        submit = findViewById(R.id.submit);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        sexGroup = findViewById(R.id.sexGroup);
        sw = findViewById(R.id.sw);
        sp = findViewById(R.id.sp);
        result = findViewById(R.id.result);
    }
}