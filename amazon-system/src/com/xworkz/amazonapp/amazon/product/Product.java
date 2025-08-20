package com.xworkz.amazonapp.amazon.product;
import com.xworkz.amazonapp.amazon.amazon.Amazon;
import com.xworkz.amazonapp.amazon.validator.AmazonValidator;

public class Product {

    Amazon amazon;

    public boolean addAmazon(Amazon amazon) {
        boolean isAmazonAdded = false;

        AmazonValidator amazonValidator = new AmazonValidator();
        boolean isAmazonInfoAddedValid = amazonValidator.validAmazonInfo(amazon);

        if (isAmazonInfoAddedValid) {
            this.amazon = amazon;
            isAmazonAdded = true;
        }
        return isAmazonAdded;
    }

    public boolean updateProductPrice(double price) {
        boolean isPriceUpdated = false;
        if (price > 0) {
            amazon.setPrice(price);
            isPriceUpdated = true;
        }
        return isPriceUpdated;
    }
    public void getProductInfo() {

        System.out.println("The amazon info:" + amazon.getFirstName());
        System.out.println("the amazon is:" + amazon.getUserName());
        System.out.println("The amazon is :" + amazon.getPhoneNumber());
        System.out.println("Gender: " + amazon.getGender());
        System.out.println("The amazon is :" + amazon.getEmail());
        System.out.println("The amazon is :" + amazon.getPwd());
        System.out.println("price: " + amazon.getPrice());
    }
}








