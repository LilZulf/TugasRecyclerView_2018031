package com.example.recyclerview1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }


    @NonNull
    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View movieView = layoutInflater.inflate(R.layout.item_movie,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(movieView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MyViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.movieName.setText(movie.getName());
        Glide.with(holder.itemView.getContext())
                .load(movie.getLogo())
                .apply(new RequestOptions().override(80,80))
                .into(holder.moviePhoto);
    }

    @Override
    public int getItemCount() {
//        return 0;
        return (movieList != null) ? movieList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView movieName;
        public ImageView moviePhoto;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            movieName = itemView.findViewById(R.id.tv_title);
            moviePhoto = itemView.findViewById(R.id.image_logo);
        }
    }

}
