package com.xworkz.theatreapp.theatre.validator;

import com.xworkz.theatreapp.theatre.theatre.Theatre;

public class TheatreValidator {
    Theatre theatre;
    public boolean validTheatreInfo(Theatre theatre){
        boolean theatreValidated = false;
        boolean washroomValidate = false;
        boolean seatsValidate = false;
        boolean classesValidate = false;
        boolean screenValidate = false;
        boolean movieLanguageValidate = false;

        if (theatre.getWashroom()!=0){
            washroomValidate=true;
        }
        else {
            System.out.println("washroom is valid");
        }
        if(theatre.getSeats()!=0){
            seatsValidate=true;
        }else {
            System.out.println("seats is valid");
        }
        if (theatre.getClasses()!=null && !theatre.getClasses().isEmpty()){
            classesValidate=true;
        }else {
            System.out.println("classes is valid");
        }
        if (theatre.getScreen()!=null && !theatre.getScreen().isEmpty()){
            screenValidate=true;
        }else {
            System.out.println("screen is valid");
        }
        if (theatre.getMovieLanguage()!=null && !theatre.getMovieLanguage().isEmpty()){
            movieLanguageValidate=true;
        }else {
            System.out.println("movie language is valid");
        }
        if (washroomValidate && seatsValidate && classesValidate && screenValidate && movieLanguageValidate){
            this.theatre=theatre;
            theatreValidated=true;
        }
        return theatreValidated;
    }
}