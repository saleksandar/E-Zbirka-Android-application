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


public class IndustrijaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.industrija_fragment,container,false);

        ListView lv= (ListView) rootView.findViewById(R.id.docsListView);
        CustomAdapter adapter=new CustomAdapter(this.getActivity(),getDocumentaries());

        lv.setAdapter(adapter);
        return rootView;
    }
    private ArrayList<Kompanii> getDocumentaries() {
        ArrayList<Kompanii> movies=new ArrayList<>();
        Kompanii movie=new Kompanii("МАКС",R.drawable.maks,"Прехранбена индустрија", "034/322-695", "www.maks.com.mk");
        movies.add(movie);

        movie=new Kompanii("Алкалоид",R.drawable.alkaloid, "Производство на лекови, преработка на билни суровини", "02/310-4000", "www.alkaloid.com.mk");
        movies.add(movie);

        movie=new Kompanii("Леов",R.drawable.leov, "Производство и трговија на електрични апарати", "043/231-530", "www.leov.com.mk");
        movies.add(movie);

        movie=new Kompanii("Кода Трејд",R.drawable.koda, "Производство и трговија на брашно", "034/331-307", "www.kodatrejd.com.mk");
        movies.add(movie);

        movie=new Kompanii("Фруктал",R.drawable.fruktal,"Производство на високо квалитетни овошни сокови", "02/2785-260", "www.fructal.com.mk");
        movies.add(movie);

        return movies;
    }

    @Override
    public String toString() {
        return "Индустрија";
    }
}
