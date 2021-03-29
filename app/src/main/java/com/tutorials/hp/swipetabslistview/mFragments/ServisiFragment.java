package com.example.ezbirka.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ezbirka.R;
import com.example.ezbirka.mData.Kompanii;
import com.example.ezbirka.mListView.CustomAdapter;

import java.util.ArrayList;


public class ServisiFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.servisi_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.educationListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getCrimeMovies());
        lv.setAdapter(adapter);


        return rootView;
    }

    private ArrayList<Kompanii> getCrimeMovies() {
        //COLECTION OF CRIME MOVIES
        ArrayList<Kompanii> movies=new ArrayList<>();

        //SINGLE MOVIE
        Kompanii kompanii =new Kompanii("Анхоч",R.drawable.anhoch,"Компјутерска опрема, хардвер и сервис","034/341-505", "www.anhoch.com");

        //ADD ITR TO COLLECTION
        movies.add(kompanii);

        kompanii =new Kompanii("Сетра",R.drawable.setra, "Одржување на хардвер, мрежи","070/226-264", "www.setra.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("Дигиком",R.drawable.digikom, "Надградба на вашиот стар и слаб компјутер","070/337-989", "www.digicom.com.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("К2 Сервис",R.drawable.k2servis, "Компјутерски сервис за сите видови компјутери и LCD монитори","078/414-142", "www.k2laptop.com");
        movies.add(kompanii);

        kompanii =new Kompanii("Лининг",R.drawable.lining, "Сервисирање на компјутери и разни електроники","075/430-963", "www.lining.com.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("Акцент",R.drawable.akcent, "Сервис за фискални апарати и компјутери","02/3133-122", "www.accent.mk");
        movies.add(kompanii);

        return movies;
    }

    @Override
    public String toString() {
        String title="Сервиси";
        return title;
    }
}
