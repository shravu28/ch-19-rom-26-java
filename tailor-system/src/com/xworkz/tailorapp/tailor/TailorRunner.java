package com.xworkz.tailorapp.tailor;
import com.xworkz.tailorapp.tailor.Tailor;
public class TailorRunner {
    public static void main(String[] args) {
        Tailor tailor = new Tailor();
        tailor.setName();
        tailor.setExperienceYears();
        tailor.setSpecialty();
        tailor.setPendingOrders();

        String name=tailor.getName();
        int experienceYears=tailor.getExperienceYears();
        String specialty=tailor.getSpecialty();
        int pendingOrders=tailor.getPendingOrders();


    }
}