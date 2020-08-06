package com.mohan.studymadeeasy.studyMaterial;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mohan.studymadeeasy.R;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class quarter1 extends Fragment {



    public quarter1() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    SubjectAdapter adapter;
    ArrayList<SubjectClassMain> itemList;
    ArrayList<SubjectTopicSubClass> subItem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_quarter1, container, false);
        recyclerView = v.findViewById(R.id.SubjectRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        subItem = new ArrayList<>();
        subItem.add(new SubjectTopicSubClass("Real No","WWVt5GIzw90","null",false));
        subItem.add(new SubjectTopicSubClass("Number Theory","WWVt5GIzw90","null",false));
        subItem.add(new SubjectTopicSubClass("Circle","WWVt5GIzw90","null",false));
        subItem.add(new SubjectTopicSubClass("Triangle","WWVt5GIzw90","null",false));

        itemList = new ArrayList<>();
        itemList.add(new SubjectClassMain("Math",subItem,false));
        itemList.add(new SubjectClassMain("Science",subItem,false));
        itemList.add(new SubjectClassMain("History",subItem,false));
        itemList.add(new SubjectClassMain("English",subItem,false));
        itemList.add(new SubjectClassMain("Hindi",subItem,false));

        adapter = new SubjectAdapter(getContext(),itemList);
        recyclerView.setAdapter(adapter);

        return v;
    }


}
