package com.xworkz.wireapp.wire;
import com.xworkz.wireapp.wire.Wire;

public class WireRunner {
    public static void main(String[] args) {

        System.out.println("main started");
        Wire wire=new Wire();

        wire.setWireId(1);
        wire.setWireName("fiber");
        wire.setWireBrand("finolex");
        wire.setPrice(100.00);
        wire.setLength(10);



        int wireId = wire.getWireId();
        String wireName=wire.getWireName();
        String wireBrand=wire.getWireBrand();
        double price=wire.getPrice();
        int length=wire.getLength();
        System.out.println("main ended");
    }
}