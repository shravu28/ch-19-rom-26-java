package com.xworkz.amazonapp.amazon.amazon;

public class Amazon {

        private String firstName;
        private String userName;
        private String phoneNumber;
        private  String gender;
        private String email;
        private String pwd;
        private double price;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getUserName(){
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }


        public String getGender(){
            return gender;
        }
        public void setGender(String female){
            System.out.println(female);
            this.gender=gender;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String mail){
            this.email=email;
        }
        public String getPwd() {
            return pwd = pwd;
        }
        public void setPwd(String s){
            this.pwd=pwd;
        }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}




