package com.xworkz.theatreapp.theatre.movie;

import com.xworkz.theatreapp.theatre.theatre.Theatre;
import com.xworkz.theatreapp.theatre.validator.TheatreValidator;

public class Movie {
    Theatre theatre;

    public boolean addTheatre(Theatre theatre){
        boolean isTheatreAdded=false;

        TheatreValidator theatreValidator = new TheatreValidator();
        boolean isTheatreInfoAddedValid=theatreValidator.validTheatreInfo(theatre);

        if (isTheatreInfoAddedValid) {
            this.theatre = theatre;
            isTheatreAdded = true;
        }
        return isTheatreAdded;
    }


    public void getTheatreInfo(){
        System.out.println("The theatre info:"+theatre.getWashroom());
        System.out.println("the theatre is:"+theatre.getSeats());
        System.out.println("The theatre is :"+theatre.getClasses());
        System.out.println("The theatre is :"+theatre.getScreen());
        System.out.println("The theatre is :"+theatre.getMovieLanguage());

    }

}