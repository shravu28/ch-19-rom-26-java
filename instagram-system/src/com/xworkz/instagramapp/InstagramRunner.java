package com.xworkz.instagramapp;

import com.xworkz.instagramapp.instagram.Instagram;
import com.xworkz.instagramapp.user.Instagramuser;

public class InstagramRunner {
    public static void main(String[] args) {
        Instagramuser instagramUser=new Instagramuser();
        instagramUser.setGivenName("shravana");
        instagramUser.setSurName("M S");
        instagramUser.setEmail("shravu123@gmail.com");
        instagramUser.setPhoneNumber(9900886655L);
        instagramUser.setPassword("shravu@123");
        instagramUser.setConfirmPassword("shravu@123");

        Instagram instagram = new Instagram();
        boolean userCreated = instagram.createUserRegistered(instagramUser);
        boolean check = instagram.createUserRegistered(instagramUser);
        if (check==true) {
            instagram.showInfo();
        }
        else{
            System.out.println("User not registered");
        }

    }
}