package com.xworkz.googleapp.googleuser;

import com.xworkz.googleapp.google.google.Google;

public class GoogleRunner {
    public static void main(String[] args) {
        com.xworkz.googleapp.google.GoogleUser googleUser = new com.xworkz.googleapp.google.GoogleUser();

        googleUser.setFirstName("Shravana");
        googleUser.setUserName(" M S");
        googleUser.setPhoneNumber("998018915");
        googleUser.setVerifyPhoneNumber("9980189156");
        googleUser.setGender("Female");
        googleUser.setDateOfBirth("26-07-2002");
        googleUser.setIsPrivacyAndTerms(true);
        googleUser.setEmail("shravana390@gmail.com");
        googleUser.setPwd("shrav@1234");
        googleUser.setConfirmPwd("shrav@1234");


        Google google = new Google();
        boolean check =  google.createGoogleUser(googleUser);
        if(check){
            google.showInfo();
        }
        else{
            System.out.println("User not registered");
        }

    }
}