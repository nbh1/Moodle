package com.mohan.studymadeeasy.studyMaterial;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mohan.studymadeeasy.R;

import java.util.ArrayList;

public class topicAdapter extends RecyclerView.Adapter<topicAdapter.ViewHolder> {

    private Context context;
    private ArrayList<SubjectTopicSubClass> arrayList;

    public topicAdapter(Context context, ArrayList<SubjectTopicSubClass> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.subject_topic_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        SubjectTopicSubClass ne = arrayList.get(position);
        holder.position = position;
        holder.textView.setText(ne.getTopicName());
        final String topic = ne.getTopicName();
        final String link = ne.getVideoLink();
        final String pdflink = ne.getNotesLink();
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,playerActivity.class);
                intent.putExtra("topic",topic);
                intent.putExtra("video",link);
                intent.putExtra("pdf",pdflink);
                context.startActivity(intent);
//                Toast.makeText(context, "Clicked "+String.valueOf(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        int position;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.topic_text_view);

        }
    }
}
