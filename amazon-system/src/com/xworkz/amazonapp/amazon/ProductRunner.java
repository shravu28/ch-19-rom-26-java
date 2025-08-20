package com.xworkz.amazonapp.amazon;
import com.xworkz.amazonapp.amazon.product.Product;
import com.xworkz.amazonapp.amazon.amazon.Amazon;


public class ProductRunner {
    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        amazon.setFirstName("Shravu");
        amazon.setUserName("Shravana");
        amazon.setPhoneNumber("9900776655");
        amazon.setGender("female");
        amazon.setEmail("shravu@gmail.com");
        amazon.setPwd("shravu@1234");
        amazon.setPrice(99.00);

        Product product = new Product();
        boolean amazonAdded = product.addAmazon(amazon);

        if (amazonAdded){
            product.getProductInfo();
        }
        product.updateProductPrice(900.00);

    }
}


