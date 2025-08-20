package com.xworkz.goldapp.gold;

public class Gold {

        static double weight = 5.5;
        static int purity = 3;
        static String form = "MS Gold";
        static double marketValue = 50000;
        static boolean isHallmarked = false;

        static double getWeight() { return weight; }
        static int getPurity() { return purity; }
        static String getForm() { return form; }
        static double getMarketValue() { return marketValue; }
        static  boolean getIsHallmarked() { return isHallmarked; }


        public static void gold(){

            System.out.println("weight:"+getWeight());
            System.out.println("purity:"+getPurity());
            System.out.println("form:"+getForm());
            System.out.println("marketValue:"+getMarketValue());
            System.out.println("isHallmarked:"+getIsHallmarked());

        }
    }

