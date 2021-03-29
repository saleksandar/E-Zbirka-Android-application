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


public class EdukacijaFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.edukacija_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.educationListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getCrimeMovies());
        lv.setAdapter(adapter);


        return rootView;
    }

    private ArrayList<Kompanii> getCrimeMovies() {

        ArrayList<Kompanii> movies=new ArrayList<>();


        Kompanii kompanii =new Kompanii("Центар за странски јазици",R.drawable.csj,"Учење на странски јазици","02/306-7783", "www.csj.com.mk");


        movies.add(kompanii);

        kompanii =new Kompanii("Саба",R.drawable.saba, "Средношколска Академија за Бизнис Администрација","078/384-005", "www.saba.edu.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("Гоце Делчев",R.drawable.ugd, "Универзитет","032/550-071", "www.ugd.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("Св. Кирил и Методиј",R.drawable.ukim, "Универзитет","02/3293-293", "www.ukim.edu.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("Семос",R.drawable.semos, "Едукативен центар","02/3130-900", "www.semosedu.com.mk");
        movies.add(kompanii);

        kompanii =new Kompanii("Сонце",R.drawable.sonce, "Едукативен центар за деца","071/935-208", "www.sonce.com.mk");
        movies.add(kompanii);

        return movies;
    }

    @Override
    public String toString() {
        String title="Едукација";
        return title;
    }
}
