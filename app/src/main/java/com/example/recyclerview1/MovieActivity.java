package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    Button linear,grid,staggered;
    public List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        setTitle("Select your movie");
        linear = findViewById(R.id.btnLinear);
        grid = findViewById(R.id.btnGrid);
        staggered = findViewById(R.id.btnStaggered);

        rvMovie = findViewById(R.id.rv_movie);

        movieList = MovieData.getDataMovies();
        MovieAdapter movieAdapter = new MovieAdapter(movieList);

        rvMovie.setAdapter(movieAdapter);
        rvMovie.setLayoutManager(new LinearLayoutManager(MovieActivity.this));



        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rvMovie.setLayoutManager(new LinearLayoutManager(MovieActivity.this));
            }
        });
        staggered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
                rvMovie.setLayoutManager(staggeredGridLayoutManager);
            }
        });
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),3,LinearLayoutManager.VERTICAL,false);
                rvMovie.setLayoutManager(gridLayoutManager); // set LayoutManager to RecyclerView
            }
        });

    }

}