package com.xworkz.passportapp.user;

public class PassportUser {

    private String givenName;
    private String sureName;
    private String email;
    private String cpvLocation;
    private int dob;
    private String loginId;
    private String passWord;
    private String confirmPassword;
    private String hintQuestion;
    private String hintAnswer;
    private  String captcha;
    private boolean isEmailLoginSame;



public String getGivenName(){
    return givenName;
}


   public void setGivenName(String givenName){
    this.givenName = givenName;
   }



    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getEmail(){
    return email;
    }

    public void setEmail(String email){
    this.email=email;
    }

    public String getCpvLocation() {
        return cpvLocation;
    }

    public void setCpvLocation(String cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getHintQuestion() {
        return hintQuestion;
    }

    public void setHintQuestion(String hintQuestion) {
        this.hintQuestion = hintQuestion;
    }

    public String getHintAnswer() {
        return hintAnswer;
    }

    public void setHintAnswer(String hintAnswer) {
        this.hintAnswer = hintAnswer;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public boolean getIsEmailLoginSame(){
    return isEmailLoginSame;
    }

    public void setEmailLoginSame(boolean isEmailLoginSame){
    this.isEmailLoginSame=isEmailLoginSame;
    }



}
