package com.xworkz.flipkartapp;

public class FlipkartUser {
    private String firstName;
    private String userName;
    private String phoneNumber;
    private String verifyPhoneNumber;
    private  String gender;
    private String dateOfBirth;
    private boolean isPrivacyAndTerms;
    private String email;
    private String pwd;
    private String confirmPwd;

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

    public String getVerifyPhoneNumber() {
        return verifyPhoneNumber;
    }
    public void setVerifyPhoneNumber(String number){
        this.phoneNumber=phoneNumber;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String female){
        System.out.println(female);
        this.gender=gender;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String s){
        this.dateOfBirth=dateOfBirth;
    }
    public boolean getIsPrivacyAndTerms(){
        return isPrivacyAndTerms;
    }
    public void setIsPrivacyAndTerms(boolean b){
        this.isPrivacyAndTerms=isPrivacyAndTerms;
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
    public String getConfirmPwd(){
        return confirmPwd=confirmPwd;
    }
    public void setConfirmPwd(String s){
        this.confirmPwd=confirmPwd;
    }
}