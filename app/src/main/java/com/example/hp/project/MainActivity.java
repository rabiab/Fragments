package com.example.hp.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends FragmentActivity {
ViewPager viewpage=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpage=(ViewPager)findViewById(R.id.pager);
        FragmentManager fragmanager=getSupportFragmentManager();
        viewpage.setAdapter(new MyAdapter(fragmanager));
    }
 }
class MyAdapter extends FragmentPagerAdapter{


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
      Fragment fragment=null;

       if(i==0){
           fragment = new FragmentA();
       }
        if(i==1)
        {
            fragment = new Tab2();

        }
        if(i==2)
        {
            fragment = new Tab3();

        }

       return fragment;
    }

    @Override
    public int getCount() {

        return 3;
    }
}
