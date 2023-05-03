package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ViewHolder> {

    public ImageAdapter(Context context, List<card> item) {
        this.context = context;
        this.item = item;
    }

    Context context;
    List<card> item;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.card_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.book_name.setText(item.get(position).getBook_name());
    holder.author.setText(item.get(position).getAuthor());
    holder.content.setText(item.get(position).getContent());
    holder.imageView.setImageResource(item.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
