package com.example.ezbirka.mListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ezbirka.R;
import com.example.ezbirka.mData.Kompanii;

import java.util.ArrayList;


public class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<Kompanii> kompaniis;
    LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<Kompanii> kompaniis) {
        this.c = c;
        this.kompaniis = kompaniis;
    }

    @Override
    public int getCount() {
        return kompaniis.size();
    }

    @Override
    public Object getItem(int position) {
        return kompaniis.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null)
        {
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.model,parent,false);
        }

        TextView nameTxt= (TextView) convertView.findViewById(R.id.nameTxt);
        ImageView img= (ImageView) convertView.findViewById(R.id.movieImage);
        TextView descTxt= (TextView) convertView.findViewById(R.id.descTxt);
        TextView numberTxt= (TextView) convertView.findViewById(R.id.numberTxt);
        TextView websiteTxt= (TextView) convertView.findViewById((R.id.websiteTxt));

        final String name= kompaniis.get(position).getName();
        int image= kompaniis.get(position).getImage();
        final String description= kompaniis.get(position).getDescription();
        final String number= kompaniis.get(position).getNumber();
        final String website= kompaniis.get(position).getWebsite();

        nameTxt.setText(name);
        img.setImageResource(image);
        descTxt.setText(description);
        numberTxt.setText(number);
        websiteTxt.setText(website);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(c,name,Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
