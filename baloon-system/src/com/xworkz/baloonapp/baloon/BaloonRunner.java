package com.xworkz.baloonapp.baloon;
import com.xworkz.baloonapp.baloon.Baloon;
public class BaloonRunner {

        public static void main(String[] args) {

            System.out.println("main started");
            Baloon baloon = new Baloon();

            baloon.setBaloonName("fiber");
            baloon.setPrice(100.00);

            String baloonName=baloon.getBaloonName();
            double price=baloon.getPrice();
            System.out.println("main ended");
        }
    }
