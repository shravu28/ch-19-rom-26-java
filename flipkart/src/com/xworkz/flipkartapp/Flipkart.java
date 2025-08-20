package com.xworkz.flipkartapp.flipkart;

import com.xworkz.flipkartapp.FlipkartUser;


public class Flipkart {
    Flipkart flipkart;
    private FlipkartUser flipkartUser;

    public boolean createFlipcartUser (FlipkartUser flipkartUser){
        boolean flipcartUserCreated = false;
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

        if(flipkartUser.getFirstName() !=null){
            firstNameValid=true;
            this.flipkartUser=flipkartUser;
        }
        else{
            System.out.println("first name is valid");
        }
        if(flipkartUser.getUserName() !=null){
            userNameValid =true;
            this.flipkartUser=flipkartUser;
        }
        else{
            System.out.println("user name is valid");
        }
        if (flipkartUser.getPhoneNumber() !=null){
            phoneNumberValid=true;
            this.flipkartUser=flipkartUser;
        }
        else{
            System.out.println("phone number is valid");
        }
        if(flipkartUser.getVerifyPhoneNumber()!=null){
            verifyPhoneNumberValid=true;
            this.flipkartUser=flipkartUser;
        }
        else {
            System.out.println("verify phone number is valid");
        }
        if(flipkartUser.getGender() !=null){
            genderValid=true;
            this.flipkartUser=flipkartUser;
        }
        else{
            System.out.println("gender is valid");
        }
        if(flipkartUser.getDateOfBirth()!=null){
            dateOfBirthValid=true;
            this.flipkartUser=flipkartUser;
        }
        else{
            System.out.println("date of birth is valid");
        }
        if(flipkartUser.getIsPrivacyAndTerms()!=false){
            isPrivacyAndTermsValid=true;
            this.flipkartUser=flipkartUser;
        } else{
            System.out.println("isprivacy and terms is valid");
        }
        if (flipkartUser.getEmail()!=null){
            emailValid=true;
            this.flipkartUser=flipkartUser;
        }
        else {
            System.out.println("email is valid");
        }
        if (flipkartUser.getPwd()!=null){
            pwdValid=true;
            this.flipkartUser=flipkartUser;
        }
        else {
            System.out.println("pwd is valid");
        }
        if (flipkartUser.getConfirmPwd()!=null){
            confirmPwdValid=true;
            this.flipkartUser=flipkartUser;
        }
        if(firstNameValid && userNameValid && phoneNumberValid && verifyPhoneNumberValid && genderValid && dateOfBirthValid && isPrivacyAndTermsValid && emailValid && pwdValid && confirmPwdValid){
            flipcartUserCreated =true;
            this.flipkartUser=flipkartUser;
        }
        return flipcartUserCreated;
    }
    public void showInfo(){
        System.out.println("main started");
        System.out.println("first name:"+flipkartUser.getFirstName());
        System.out.println("user name:"+flipkartUser.getFirstName());
        System.out.println("phone number:"+flipkartUser.getPhoneNumber());
        System.out.println("verify phone number:"+flipkartUser.getVerifyPhoneNumber());
        System.out.println("gender:"+flipkartUser.getGender());
        System.out.println("date of birth:"+flipkartUser.getDateOfBirth());
        System.out.println("is privacy and terms:"+flipkartUser.getIsPrivacyAndTerms());
        System.out.println("email:"+flipkartUser.getEmail());
        System.out.println("pwd:"+flipkartUser.getPwd());
        System.out.println("confirmpwd:"+flipkartUser.getConfirmPwd());

        System.out.println("main ended");
    }
}