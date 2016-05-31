package com.myf.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myf.PagerSlidingTabStripEx;

/**
 * Created by MaoYouFeng on 2016/5/30.
 */
public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    ViewPager pager;
    PagerSlidingTabStripEx tabs;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pager = (ViewPager) view.findViewById(R.id.childViewPager);
        pager.setAdapter(new MyPagerAdapter(getChildFragmentManager()));
        tabs = (PagerSlidingTabStripEx) view.findViewById(R.id.tabs);
        tabs.setViewPager(pager);
    }

    class MyPagerAdapter extends FragmentPagerAdapter {
        private final String[] TITLES = {"Categories", "Home", "Top Paid"};
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return TITLES[position];
        }
        @Override
        public int getCount() {
            return TITLES.length;
        }
        @Override
        public Fragment getItem(int position) {
            return new Fragment2();
        }

    }
}
