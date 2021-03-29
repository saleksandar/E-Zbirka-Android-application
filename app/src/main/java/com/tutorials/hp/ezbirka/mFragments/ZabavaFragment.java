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


public class ZabavaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.zabava_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.dramaListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getDramaMovies());
        lv.setAdapter(adapter);

        return rootView;
    }


    private ArrayList<Kompanii> getDramaMovies() {
        ArrayList<Kompanii> movies=new ArrayList<>();
        Kompanii kompanii =new Kompanii("The Cube Escape Room",R.drawable.thecube, "Решавање на сите загатки за излез од собата", "071/263-374", "www.thecube.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("Cineplexx",R.drawable.cineplexx,"Кино за гледање на најновите филмови", "02/307-4477", "www.cineplexx.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("ЦрноБело",R.drawable.crnobelo, "Портал за забава", "нема телефон", "www.crnobelo.com");
        movies.add(kompanii);

        kompanii =new Kompanii("BO Bowling",R.drawable.bobowling, "Куглана", "078/500-035", "www.bobowling.mk");
        movies.add(kompanii);

        return movies;
    }

    @Override
    public String toString() {
        return "Забава";
    }
}
