package com.xworkz.networkapp;

import com.xworkz.networkapp.airtel.AirtelNetwork;

public class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        AirtelNetwork airtelNetwork = new AirtelNetwork();

        airtelNetwork.networkId = 1;
        airtelNetwork.networkRange="high";
        airtelNetwork.prize=2000.00;
        airtelNetwork.logicalValue=true;


        System.out.println("The airtel network id"+airtelNetwork.networkId);
        System.out.println("The airtel network range"+airtelNetwork.networkRange);
        System.out.println("The airtel network range"+airtelNetwork.prize);
        System.out.println("The airtel network range"+airtelNetwork.logicalValue);
        System.out.println("main ended");
    }
}
