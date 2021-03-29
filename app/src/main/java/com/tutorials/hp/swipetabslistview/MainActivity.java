package com.example.ezbirka;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.ezbirka.R;
import com.example.ezbirka.mFragments.ServisiFragment;
import com.example.ezbirka.mFragments.IndustrijaFragment;
import com.example.ezbirka.mFragments.ZabavaFragment;
import com.example.ezbirka.mFragments.EdukacijaFragment;
import com.example.ezbirka.mFragments.MyPagerAdapter;


public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {


    ViewPager vp;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        vp= (ViewPager) findViewById(R.id.mViewpager_ID);
        this.addPages();


        tabLayout= (TabLayout) findViewById(R.id.mTab_ID);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);

    }

    private void addPages()
    {
        MyPagerAdapter pagerAdapter=new MyPagerAdapter(this.getSupportFragmentManager());
        pagerAdapter.addFragment(new ServisiFragment());
        pagerAdapter.addFragment(new ZabavaFragment());
        pagerAdapter.addFragment(new IndustrijaFragment());
        pagerAdapter.addFragment((new EdukacijaFragment()));


        vp.setAdapter(pagerAdapter);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
