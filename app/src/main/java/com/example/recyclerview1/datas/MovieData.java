package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Food;
import com.example.recyclerview1.models.Movie;

import java.util.ArrayList;

public class MovieData {
    private static String [] movieName = {
            "Django Unchained",
            "Shawshank Redemption",
            "Forest Gump",
            "Interstellar",
            "Inception",
            "Midway",
            "Spirited Away",
    };
    private static int [] movieImage = {
            R.drawable.django,
            R.drawable.shawshank,
            R.drawable.gump,
            R.drawable.interstellar,
            R.drawable.incception,
            R.drawable.midway,
            R.drawable.spirited,
    };
    public static ArrayList<Movie> getDataMovies() {
        ArrayList<Movie> list = new ArrayList<>();
        for(int i=0;i<movieName.length;i++){
            Movie x = new Movie(movieName[i], movieImage[i]);
            list.add(x);
        }
        return list;
    }
}
