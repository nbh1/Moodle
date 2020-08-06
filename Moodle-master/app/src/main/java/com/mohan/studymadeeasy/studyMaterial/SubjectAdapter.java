package com.mohan.studymadeeasy.studyMaterial;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mohan.studymadeeasy.R;

import java.util.ArrayList;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.ViewHolder> {
    private Context context;
    private ArrayList<SubjectClassMain> arrayList;

    public SubjectAdapter(Context context, ArrayList<SubjectClassMain> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.subjects_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        SubjectClassMain ne = arrayList.get(position);
        holder.location = position;
        holder.subject.setText(ne.getSubjectName());

        topicAdapter adapter = new topicAdapter(context,ne.getItemList());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        holder.recyclerView.setAdapter(adapter);
        boolean status = ne.isOpened();
        holder.subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean t = arrayList.get(position).isOpened;
                if(t){
                    holder.recyclerView.setVisibility(View.GONE);
                }else{
                    holder.recyclerView.setVisibility(View.VISIBLE);
                }
                arrayList.get(position).setOpened(!t);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        int location;
        TextView subject;
        RecyclerView recyclerView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            subject = itemView.findViewById(R.id.subjectName);
            recyclerView = itemView.findViewById(R.id.topic_recycler_view);
        }
    }
}
