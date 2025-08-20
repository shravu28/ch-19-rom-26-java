package com.xworkz.amazonapp.amazon.validator;
import com.xworkz.amazonapp.amazon.amazon.Amazon;

public class AmazonValidator {



        Amazon amazon;
        public boolean validAmazonInfo(Amazon amazon){
            boolean amazonValidated = false;
            boolean firstNameValid = false;
            boolean userNameValid = false;
            boolean phoneNumberValid = false;
            boolean genderValid = false;
            boolean emailValid = false;
            boolean pwdValid = false;
            boolean priceValid=false;


            if (amazon.getFirstName()!=null && ! amazon.getFirstName().isEmpty()){
                firstNameValid=true;
            }
            else {
                System.out.println("firstname is not  valid");
            }
            if(amazon.getUserName()!=null && !amazon.getUserName().isEmpty()){
                userNameValid=true;
            }else {
                System.out.println("username is not valid");
            }
            if (amazon.getPhoneNumber()!=null && !amazon.getPhoneNumber().isEmpty()){
                phoneNumberValid=true;
            }else {
                System.out.println("phone number is  not valid");
            }
            if (amazon.getGender()!=null && !amazon.getGender().isEmpty()){
                genderValid=true;
            }else {
                System.out.println("gender is not valid");
            }
            if (amazon.getEmail()!=null && !amazon.getEmail().isEmpty()){
                emailValid=true;
            }else {
                System.out.println("email  is not valid");
            }

            if(amazon.getPwd()!=null && !amazon.getPwd().isEmpty()){
                pwdValid=true;
            }else{
                System.out.println("pwd is not valid");
            }

            if(amazon.getPrice()>0){
                priceValid=true;
            }else{
                System.out.println("price is not valid");
            }
            if (firstNameValid && userNameValid && pwdValid && emailValid && phoneNumberValid && genderValid && priceValid){
                amazonValidated=true;
            }
            return amazonValidated;
        }
}

