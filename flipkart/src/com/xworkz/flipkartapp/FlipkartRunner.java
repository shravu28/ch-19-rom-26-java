package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.flipkart.Flipkart;


public class FlipkartRunner {
    public static void main(String[] args) {
        FlipkartUser flipcartUser = new FlipkartUser();

        flipcartUser.setFirstName("shravana");
        flipcartUser.setUserName("shravu");
        flipcartUser.setPhoneNumber("998018915");
        flipcartUser.setVerifyPhoneNumber("9980189156");
        flipcartUser.setGender("Female");
        flipcartUser.setDateOfBirth("28-05-2001");
        flipcartUser.setIsPrivacyAndTerms(true);
        flipcartUser.setEmail("shravu123@gmail.com");
        flipcartUser.setPwd("shravua@1234");
        flipcartUser.setConfirmPwd("shravu@1234");


        Flipkart flipcart = new Flipkart();
        boolean check =  flipcart.createFlipcartUser(flipcartUser);
        if(check){
            flipcart.showInfo();
        }
        else{
            System.out.println("User not registered");
        }

    }
}