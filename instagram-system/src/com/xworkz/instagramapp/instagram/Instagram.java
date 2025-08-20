package com.xworkz.instagramapp.instagram;

import com.xworkz.instagramapp.user.Instagramuser;

public class Instagram {
    Instagramuser instagramUser;

    public boolean createUserRegistered(Instagramuser instagramUser) {
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean emailValid = false;
        boolean phoneNumberValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;
        boolean isRegistered = false;

        if (instagramUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("given name is not valid");
        }


        if (instagramUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("the sur name is not valid");
        }

        if (instagramUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("the email is not valid ");
        }

        if (instagramUser.getPhoneNumber() != 0) {
            phoneNumberValid = true;
        } else {
            System.out.println("the phone number is not valid");
        }

        if (instagramUser.getPassword() != null) {
            passwordValid = true;
        } else {
            System.out.println("the password is not valid");
        }

        if (instagramUser.getConfirmPassword()!= null) {
            confirmPasswordValid = true;
        } else {
            System.out.println("the confirm password is not valid");
        }
        if (givenNameValid && surNameValid && emailValid && phoneNumberValid && passwordValid && confirmPasswordValid) {
            isRegistered = true;
            this.instagramUser=instagramUser;
        }
        return isRegistered;
    }
    public void showInfo(){
        //System.out.println("the user registered:" +amazonUser.getUserCreated);
        System.out.println("the amazon user is:" + instagramUser.getGivenName());
        System.out.println("the sur name is:" + instagramUser.getSurName());
        System.out.println("the email is:" + instagramUser.getEmail());
        System.out.println("the phone number is:" + instagramUser.getPhoneNumber());
        System.out.println("the password is:" + instagramUser.getPassword());
        System.out.println("the confirm pwd is:" + instagramUser.getConfirmPassword());
        System.out.println("main ended");
    }

}