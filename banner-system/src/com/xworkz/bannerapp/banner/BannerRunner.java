package com.xworkz.bannerapp.banner;
import com.xworkz.bannerapp.banner.Banner;
public class BannerRunner {

        public static void main(String[] args) {

            System.out.println("main started");
            Banner banner = new Banner();
            banner.setBannerId(1);
            banner.setBannerName("fiber");
            banner.setPrice(100.00);
            int bannerId = banner.getBannerId();
            String bannerName=banner.getBannerName();
            double price=banner.getPrice();
            System.out.println("main ended");
        }
    }