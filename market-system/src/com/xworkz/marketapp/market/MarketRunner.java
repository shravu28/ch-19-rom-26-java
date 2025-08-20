package com.xworkz.marketapp.market;
import com.xworkz.marketapp.market.Market;
public class MarketRunner {
    public static void main(String[] args) {
        Market market = new Market();
        market.setName("kr market");
        market.setLocation("Rajajinagar");
        market.setNumberOfShops();


        String name=market.getName();
        String location=market.getLocation();
        int numberOfShop=market.getNumberOfShops();

    }
}