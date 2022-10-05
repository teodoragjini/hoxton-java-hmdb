package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

public class Movie {
    public static ArrayList<Movie> movies = new ArrayList<>();
    public static Integer currentId = 0;

    public Integer id;
    public String title;
    public String description;
    public Integer year;

    static{
        new Movie("The Mummy", "An ancient Egyptian princess is awakened from her crypt beneath the desert, bringing with her malevolence grown over millennia, and terrors that defy human comprehension.", 2017);
        new Movie("Pretty Woman", "A very successful, wealthy lawyer, Edward Lewis, hires a beautiful and unlikely prostitute, Vivian Ward (Julia Roberts), from Sunset Blvd to bring along to various business events. An attraction developes between the two, and Edward finds it harder and harder to let the infectious, kind-hearted Vivian go.", 1990);
        new Movie("Troy", "Based on Homer's Iliad, this epic portrays the battle between the ancient kingdoms of Troy and Sparta.", 2004);
    }

    public Movie(String title, String description,  Integer year){
        this.id = ++Movie.currentId;
        this.title = title;
        this.description = description;
        this.year = year;

        Movie.movies.add(this);
    }

    
}
