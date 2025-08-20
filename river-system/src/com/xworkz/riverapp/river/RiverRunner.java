package com.xworkz.riverapp.river;
import com.xworkz.riverapp.river.River;
public class RiverRunner {
    public static void main(String[] args) {
        River river = new River();
        river.setName();
        river.setLength();
        river.setDestination();

        String name= river.getName();
        int length= river.getLength();
        String destination= river.getDestination();
    }
}