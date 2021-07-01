package com.example.adapterpersonalizat1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterMaterial extends ArrayAdapter<Material> {

    Context context;
    List<Material>  materials;
    LayoutInflater layoutInflater;
    int resource;

    public AdapterMaterial(@NonNull Context context, int resource, @NonNull List<Material> objects, LayoutInflater layoutInflater) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.materials=objects;
        this.layoutInflater=layoutInflater;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= layoutInflater.inflate(resource, parent, false);
        Material material=materials.get(position);
        if(material!=null)
        {
            TextView tv1= view.findViewById(R.id.textMaterial);

            tv1.setText(material.getMaterial());

            TextView tv2= view.findViewById(R.id.textPret);
            tv2.setText(String.valueOf(material.getPret()));

            TextView tv3= view.findViewById(R.id.textvaloare);
            tv3.setText(String.valueOf(material.getValoare()+""));

            RatingBar ratingBar=view.findViewById(R.id.ratingbar);

        }
        return view;
    }
}
