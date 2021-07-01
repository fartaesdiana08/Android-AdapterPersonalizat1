package com.example.adapterpersonalizat1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AdaugaMaterialActivity extends AppCompatActivity {
    EditText material;
    EditText pret;
    SeekBar seekBar;
    RadioGroup radioGroup;
    Button btnSalveaza;
    RadioButton radioButton;
    DatePicker data;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adauga_material);

        material=findViewById(R.id.material);
        pret=findViewById(R.id.pret);
        seekBar=findViewById(R.id.seek_bar);
        radioGroup=findViewById(R.id.radioGroup);
        btnSalveaza=findViewById(R.id.btnSalveaza);
        data=findViewById(R.id.data_folosire);
        radioButton=findViewById(R.id.radioButton);


        btnSalveaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(material.getText().toString().isEmpty())
                {
                    Toast.makeText(AdaugaMaterialActivity.this, R.string.error_1,Toast.LENGTH_SHORT).show();
                }
                else if(pret.getText().toString().isEmpty() )
                {
                    Toast.makeText(AdaugaMaterialActivity.this, R.string.error_2,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String numeMaterial=material.getText().toString();
                    int pretMaterial=Integer.parseInt(pret.getText().toString());
                    int lunaFolosire=data.getMonth();
                    String valoare=radioButton.getText().toString();
                    int nrMateriale=seekBar.getProgress();

                    Material mmaterial=new Material(numeMaterial,pretMaterial,nrMateriale,valoare,lunaFolosire);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("material",mmaterial);

                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });
    }
}
