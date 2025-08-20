package com.xworkz.shravuapp.shravu.playstore;
import com.xworkz.shravuapp.shravu.shravu.Shravu;
import com.xworkz.shravuapp.shravu.validator.ShravuValidator;
public class PlayStore {


        Shravu shravu;
        public boolean addShravu(Shravu shravu){
            boolean isShravuAdded=false;

            ShravuValidator shravuValidator = new ShravuValidator();
            boolean isShravuInfoAddedValid=shravuValidator.validShravuInfo(shravu);

            if (isShravuInfoAddedValid) {
                this.shravu = shravu;
                isShravuAdded = true;
            }
            return isShravuAdded;
        }


        public void getShravuInfo(){
            System.out.println("The shravu info:"+shravu.getFirstName());
            System.out.println("the shravu is:"+shravu.getLastName());
            System.out.println("The shravu is :"+shravu.getUserId());
            System.out.println("The shravu is :"+shravu.getQualification());
            System.out.println("The shravu is :"+shravu.getGender());
            System.out.println("The shravu is :"+shravu.getCountry());
            System.out.println("The shravu is :"+shravu.getState());
            System.out.println("The shravu is :"+shravu.getPassWord());
            System.out.println("The shravu is :"+shravu.getConfirmPwd());
            System.out.println("The shravu is :"+shravu.getDateOfBirth());
            System.out.println("The shravu is :"+shravu.getAge());
            System.out.println("The shravu is :"+shravu.getPinCode());
            System.out.println("The shravu is :"+shravu.getAddressName());


        }

    }




