package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView book_name,author,content;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img);
        book_name = itemView.findViewById(R.id.book_name);
        author = itemView.findViewById(R.id.author);
        content = itemView.findViewById(R.id.content);
    }
}
