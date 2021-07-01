package com.example.adapterpersonalizat1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    ListView listView;
    final int CODE =100;

    public Intent intent;
    List<Material> materialList = new ArrayList<>();

    AdapterMaterial adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AdaugaMaterialActivity.class);
                startActivityForResult(intent,CODE);
            }
        });

        //adapter
        adapter=new AdapterMaterial(this, R.layout.row_item,materialList,getLayoutInflater());
        listView.setAdapter(adapter);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CODE && resultCode==RESULT_OK) {
            Material material1=(Material)data.getExtras().getSerializable("material");
            materialList.add(material1);
            adapter.notifyDataSetChanged();
            Toast.makeText(this,material1.toString(),Toast.LENGTH_SHORT).show();
        }
    }
}