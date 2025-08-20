package com.xworkz.passportapp;

import com.xworkz.passportapp.seva.PassportSeva;
import com.xworkz.passportapp.user.PassportUser;

public class PassportRunner {

    public static void main(String[] args) {


        PassportUser passportuser = new PassportUser();


        passportuser.setCpvLocation("PO");

        passportuser.setGivenName("Shravana");
        passportuser.setSureName("M S");
        passportuser.setDob(28-5-2001);
        passportuser.setEmail("shravana28@gmail.com");
        passportuser.setEmailLoginSame(true);
        passportuser.setLoginId("shravu28@gmail.com");
        passportuser.setPassWord("shravu@123");
        passportuser.setConfirmPassword("shravu@123");
        passportuser.setHintQuestion("Birth Place");
        passportuser.setHintAnswer("Hassan");
        passportuser.setCaptcha("QW1o99");

        PassportSeva passportSeva = new PassportSeva();

        String cpvLocation = passportuser.getCpvLocation();

        String givenName = passportuser.getGivenName();
        String surName = passportuser.getSureName();
        int  dob = passportuser.getDob();
        String email = passportuser.getEmail();
        boolean isEmailLoginSame = passportuser.getIsEmailLoginSame();
        String loginId = passportuser.getLoginId();
        String pwd = passportuser.getPassWord();
        String confirmPwd = passportuser.getConfirmPassword();
        String hintQuestion = passportuser.getHintQuestion();
        String hintAnswer = passportuser.getHintAnswer();
        String captcha = passportuser.getCaptcha();

        System.out.println("main started");
        System.out.println("CPV Location:" + cpvLocation);
        System.out.println("Given name: " + givenName);
        System.out.println("SurName: " + surName);
        System.out.println("DOB: " + dob);
        System.out.println("Email: " + email);
        System.out.println("Is Email Login Is same: " + isEmailLoginSame);
        System.out.println("Login Id: " + loginId);
        System.out.println("Password: " + pwd);
        System.out.println("Confirm password: " + confirmPwd);
        System.out.println("Hint Question: " + hintQuestion);
        System.out.println("Hint Answer: " + hintAnswer);
        System.out.println("Captcha: " + captcha);

        System.out.println("main ended");
    }
}
