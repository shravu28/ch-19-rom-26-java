package com.xworkz.walkietalkieapp.walkietalkie;

public class WalkieTalkie {


        static  String model;
        static double frequency;
        static int batteryLife;
        static int range;
        static boolean encryption;

        static String getModel() { return model; }
        static double getFrequency() { return frequency; }
        static int getBatteryLife() { return batteryLife; }
        static int getRange() { return range; }
        static boolean getEncryption() { return encryption; }

        public static void walkietalkie(){

            System.out.println("model:"+getModel());
            System.out.println("frequency:"+getFrequency());
            System.out.println("batteryLife:"+getBatteryLife());
            System.out.println("range:"+getRange());
            System.out.println("encryption:"+getEncryption());

        }


}


