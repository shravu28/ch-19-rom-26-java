package com.xworkz.radioapp.radio;
import com.xworkz.radioapp.radio.Radio;
public class RadioRunner {
    public static void main(String[] args) {
        Radio radio = new Radio();

        radio.setBrand("Indigo");
        radio.setVolume(100);
        radio.setFrequency(100.00);
        radio.setColor("black");

        String brand= radio.getBrand();
        int volume=radio.getVolume();
        double frequency=radio.getFrequency();
        String color=radio.getColor();


    }
}