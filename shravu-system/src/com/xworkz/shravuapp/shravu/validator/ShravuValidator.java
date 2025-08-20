package com.xworkz.shravuapp.shravu.validator;
import com.xworkz.shravuapp.shravu.shravu.Shravu;

public class ShravuValidator {

Shravu shravu;
public  boolean validShravuInfo(Shravu shravu){

            boolean shravuValidated = false;
            boolean firstNameValidate = false;
            boolean lastNameValidate = false;
            boolean addressNameValidate = false;
            boolean QualificationValidate = false;
            boolean userIdValidate = false;
            boolean GenderValidate = false;
            boolean passWordValidate = false;
            boolean confirmPwdValidate= false;
            boolean CountryValidate = false;
            boolean StateValidate = false;
            boolean pinCodeValidate =  false;
            boolean phoneNumberValidate = false;
            boolean AgeValidate = false;

            boolean dateOfBirthValidate = false;


            if (shravu.getFirstName()!=null && !shravu.getFirstName().isEmpty()){
                firstNameValidate=true;
            }
            else {
                System.out.println("FirstName is valid");
            }
            if(shravu.getLastName()!=null && ! shravu.getLastName().isEmpty()){
                lastNameValidate=true;
            }else {
                System.out.println("lastName is valid");
            }
            if (shravu.getAddressName()!=null && !shravu.getAddressName().isEmpty()){
                addressNameValidate=true;
            }else {
                System.out.println("AddressName is valid");
            }
            if (shravu.getQualification()!=null && !shravu.getQualification().isEmpty()){
                QualificationValidate=true;
            }else {
                System.out.println("Qualification is valid");
            }
            if(shravu.getUserId()!=0){
                userIdValidate=true;
            }else {
                System.out.println("userId  is valid");
            }
            if(shravu.getGender()!=null && !shravu.getGender().isEmpty()){
                GenderValidate=true;
            }else{
                System.out.println("Gender is valid");
            }

    if(shravu.getCountry()!=null && !shravu.getCountry().isEmpty()){
        CountryValidate=true;
    }else{
        System.out.println("country is valid");
    }

    if(shravu.getState()!=null && !shravu.getState().isEmpty()){
        StateValidate=true;
    }else{
        System.out.println("State is valid");
    }


    if(shravu.getPassWord()!=null && !shravu.getPassWord().isEmpty()){
        passWordValidate=true;
    }else{
        System.out.println("password is valid");
    }


    if(shravu.getConfirmPwd()!=null && !shravu.getConfirmPwd().isEmpty()){
        confirmPwdValidate=true;
    }else{
        System.out.println("confirmPwd is valid");
    }


    if(shravu.getPhoneNumber()!=0){
        phoneNumberValidate=true;
    }else{
        System.out.println("phonenumber is valid");
    }

    if(shravu.getPinCode()!=null && !shravu.getPinCode().isEmpty()){
        pinCodeValidate=true;
    }else{
        System.out.println("pinCode is valid");
    }

    if(shravu.getAge()!=0){
        AgeValidate=true;
    }else{
        System.out.println("Age is valid");
    }


    if(shravu.getDateOfBirth()!=null && !shravu.getDateOfBirth().isEmpty()){
        dateOfBirthValidate=true;
    }else{
        System.out.println("dateofbirth is valid");
    }
            if (firstNameValidate && lastNameValidate && userIdValidate &&addressNameValidate && QualificationValidate && CountryValidate&& StateValidate&& confirmPwdValidate&& passWordValidate&& GenderValidate && shravuValidated && dateOfBirthValidate &&  pinCodeValidate && phoneNumberValidate && AgeValidate ) {
                this.shravu=shravu;
                shravuValidated=true;
            }
            return shravuValidated;
        }
    }




