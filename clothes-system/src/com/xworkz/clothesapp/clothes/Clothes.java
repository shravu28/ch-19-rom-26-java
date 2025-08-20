package com.xworkz.clothesapp.clothes;

public class Clothes {


        static String fabric = "Cotton";
        static String size = "M";
        static String color = "White";
        static boolean isWashed = false;
        static String type = "Traditional";

        static String getFabric() { return fabric; }
        static String getSize() { return size; }
        static String getColor() { return color; }
        static boolean getIswashed() { return isWashed; }
        static String getType() { return type; }

        public static void clothes(){

            System.out.println("fabric: "+ getFabric());
            System.out.println("size: " + getSize());
            System.out.println("color:" + getColor());
            System.out.println("isWashed:"+ getIswashed ());
            System.out.println("type :"+ getType());



        }

}
