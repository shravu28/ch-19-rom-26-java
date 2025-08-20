package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.theatre.movie.Movie;
import com.xworkz.theatreapp.theatre.theatre.Theatre;

public class MovieRunner {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        theatre.setWashroom(4);
        theatre.setSeats(500);
        theatre.setClasses("Balcony,1stclass");
        theatre.setScreen("White and black");
        theatre.setMovieLanguage("Kannada,tamil,telugu,hindi,english,maliyalum");

        Movie movie = new Movie();
        boolean theatreAdded = movie.addTheatre(theatre);
        if (theatreAdded) {
            movie.getTheatreInfo();
        } else {
        }
        System.out.println("Theatre is not added");
    }
}