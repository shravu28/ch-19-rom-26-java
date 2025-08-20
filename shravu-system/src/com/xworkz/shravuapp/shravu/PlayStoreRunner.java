package com.xworkz.shravuapp.shravu;
import com.xworkz.shravuapp.shravu.playstore.PlayStore;
import com.xworkz.shravuapp.shravu.shravu.Shravu;
public class PlayStoreRunner {


        public static void main(String[] args) {
            Shravu shravu = new Shravu();
            shravu.setFirstName("shravana");
            shravu.setLastName("m s");
            shravu.setAddressName("Hassan");
            shravu.setQualification("BE");
            shravu.setCountry("india");
            shravu.setGender("female");
            shravu.setState("karnataka");
            shravu.setPhoneNumber(9900990077L);
            shravu.setPinCode("573110");
            shravu.setPassWord("shravu123");
            shravu.setConfirmPwd("shravu123");

            PlayStore playStore = new PlayStore();
            boolean ShravuAdded = playStore.addShravu(shravu);
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
            if (ShravuAdded) {
                playStore.getShravuInfo();
            } else {
            }
            System.out.println("shravu is not added");
        }
}


