package com.xworkz.adopterapp;

import com.xworkz.adopterapp.adopter.Adopter;

public class AdopterRunner {
    public static void main(String[] args) {
        Adopter adopter = new Adopter();
        adopter.setAdopterBrand("sony");
        adopter.setAdopterId(2);
        adopter.setPrize("thousand rupees");

        String adopterBrand = adopter.getAdopterBrand();
        int adopterId= adopter.getAdopterId();
        String prize=adopter.getPrize();

        System.out.println("brand:"+adopterBrand);
        System.out.println("id:"+adopterId);
        System.out.println("prize:"+prize);
    }
}
