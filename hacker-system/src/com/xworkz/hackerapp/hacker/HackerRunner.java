package com.xworkz.hackerapp.hacker;
import com.xworkz.hackerapp.hacker.Hacker;
public class HackerRunner {


        public static void main(String[] args) {

            System.out.println("main started");
            Hacker chats = new Hacker();
            Hacker hacker = null;
            hacker.setHackerId(1);
            hacker.setHackerName("fiber");
            hacker.setPrice(100.00);
            int hackerId = chats.getHackerId();
            String hackerName=chats.getHackerName();
            double price=chats.getPrice();
            System.out.println("main ended");
        }
    }


