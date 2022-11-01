package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerview1.adapters.FoodAdapter;
import com.example.recyclerview1.adapters.MovieAdapter;
import com.example.recyclerview1.datas.FoodData;
import com.example.recyclerview1.datas.MovieData;
import com.example.recyclerview1.models.Food;
import com.example.recyclerview1.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieActivity extends AppCompatActivity {
    RecyclerView rvMovie;
    public List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        setTitle("Select your movie");

        rvMovie = findViewById(R.id.rv_movie);

        movieList = MovieData.getDataMovies();
        MovieAdapter movieAdapter = new MovieAdapter(movieList);

        rvMovie.setAdapter(movieAdapter);
        rvMovie.setLayoutManager(new LinearLayoutManager(this));

        rvMovie.addItemDecoration(new DividerItemDecoration
                (this, DividerItemDecoration.VERTICAL));

    }

}