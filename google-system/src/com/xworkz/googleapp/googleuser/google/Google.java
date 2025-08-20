package com.xworkz.googleapp.googleuser.google;

import com.xworkz.googleapp.google.GoogleUser;

public class Google {
    GoogleUser googleUser;

    public boolean createGoogleUser (GoogleUser googleUser){
        boolean googleUserCreated = false;
        boolean firstNameValid = false;
        boolean userNameValid = false;
        boolean phoneNumberValid = false;
        boolean verifyPhoneNumberValid= false;
        boolean genderValid=false;
        boolean dateOfBirthValid = false;
        boolean isPrivacyAndTermsValid=false;
        boolean emailValid=false;
        boolean pwdValid=false;
        boolean confirmPwdValid=false;

        if(googleUser.getFirstName() !=null){
            firstNameValid=true;
            this.googleUser=googleUser;
        }
        else{
            System.out.println("first name is valid");
        }
        if(googleUser.getUserName() !=null){
            userNameValid =true;
            this.googleUser=googleUser;
        }
        else{
            System.out.println("user name is valid");
        }
        if (googleUser.getPhoneNumber() !=null){
            phoneNumberValid=true;
            this.googleUser=googleUser;
        }
        else{
            System.out.println("phone number is valid");
        }
        if(googleUser.getVerifyPhoneNumber()!=null){
            verifyPhoneNumberValid=true;
            this.googleUser=googleUser;
        }
        else {
            System.out.println("verify phone number is valid");
        }
        if(googleUser.getGender() !=null){
            genderValid=true;
            this.googleUser=googleUser;
        }
        else{
            System.out.println("gender is valid");
        }
        if(googleUser.getDateOfBirth()!=null){
            dateOfBirthValid=true;
            this.googleUser=googleUser;
        }
        else{
            System.out.println("date of birth is valid");
        }
        if(googleUser.getIsPrivacyAndTerms()!=false){
            isPrivacyAndTermsValid=true;
            this.googleUser=googleUser;
        } else{
            System.out.println("isprivacy and terms is valid");
        }
        if (googleUser.getEmail()!=null){
            emailValid=true;
            this.googleUser=googleUser;
        }
        else {
            System.out.println("email is valid");
        }
        if (googleUser.getPwd()!=null){
            pwdValid=true;
            this.googleUser=googleUser;
        }
        else {
            System.out.println("pwd is valid");
        }
        if (googleUser.getConfirmPwd()!=null){
            confirmPwdValid=true;
            this.googleUser=googleUser;
        }
        if(firstNameValid && userNameValid && phoneNumberValid && verifyPhoneNumberValid && genderValid && dateOfBirthValid && isPrivacyAndTermsValid && emailValid && pwdValid && confirmPwdValid){
            googleUserCreated =true;
            this.googleUser=googleUser;
        }
        return googleUserCreated;
    }
    public void showInfo(){
        System.out.println("main started");
        System.out.println("first name:"+googleUser.getFirstName());
        System.out.println("user name:"+googleUser.getFirstName());
        System.out.println("phone number:"+googleUser.getPhoneNumber());
        System.out.println("verify phone number:"+googleUser.getVerifyPhoneNumber());
        System.out.println("gender:"+googleUser.getGender());
        System.out.println("date of birth:"+googleUser.getDateOfBirth());
        System.out.println("is privacy and terms:"+googleUser.getIsPrivacyAndTerms());
        System.out.println("email:"+googleUser.getEmail());
        System.out.println("pwd:"+googleUser.getPwd());
        System.out.println("confirmpwd:"+googleUser.getConfirmPwd());

        System.out.println("main ended");
    }
}