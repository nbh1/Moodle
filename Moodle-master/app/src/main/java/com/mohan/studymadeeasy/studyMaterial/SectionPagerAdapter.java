package com.mohan.studymadeeasy.studyMaterial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SectionPagerAdapter extends FragmentPagerAdapter {

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                quarter1 q1 = new quarter1();
                return q1;
            case 1:
                quarter2 q2 = new quarter2();
                return q2;
            case 2:
                quarter3 q3 = new quarter3();
                return q3;
            case 3:
                quarter4 q4 = new quarter4();
                return q4;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Quart-1";
            case 1:
                return "Quart-2";
            case 2:
                return "Quart-3";
            case 3:
                return "Quart-4";
            default:
                return null;
        }
    }
}
