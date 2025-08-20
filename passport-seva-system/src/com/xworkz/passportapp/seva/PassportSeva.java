package com.xworkz.passportapp.seva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSeva {

    PassportUser passportUser;

    public boolean createPassportUser(PassportUser passportUser) {
        boolean passportUserCreated = false;

        boolean cpvLoctionValid = false;
        boolean givenNameValid = false;
        boolean sureNameValid = false;
        boolean dobValid = false;
        boolean loginIdValid = false;
        boolean passWordValid = false;
        boolean confirmPasswordValid = false;
        boolean hintQuestionValid = false;
        boolean hintAnswerValid = false;
        boolean captchaValid = false;


        if (passportUser.getCpvLocation() != null) {
            cpvLoctionValid = true;
        } else {
            System.out.println("CPV Location is not valid");
        }

        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("Given Name is not valid");
        }

        if (passportUser.getSureName() != null) {
            sureNameValid = true;
        } else {
            System.out.println("Sure name is not valid");
        }



        if (passportUser.getLoginId() != null) {
            loginIdValid = true;
        } else {
            System.out.println("LoginId is not valid");
        }

        if (passportUser.getPassWord() != null) {
            passWordValid = true;
        } else {
            System.out.println("Password is not valid");
        }

        if (passportUser.getConfirmPassword() != null) {
            confirmPasswordValid = true;
        } else {
            System.out.println("Confirm Password is not valid");
        }

        if (passportUser.getHintQuestion() != null) {
            hintQuestionValid = true;
        } else {
            System.out.println("Hint question is not valid");
        }

        if (passportUser.getHintAnswer() != null) {
            hintAnswerValid = true;
        } else {
            System.out.println("Hint answer is not valid");
        }

        if (passportUser.getCaptcha() != null) {
            captchaValid = true;
        } else {
            System.out.println("Captcha is not valid");
        }

    if(cpvLoctionValid && givenNameValid && sureNameValid && loginIdValid && hintAnswerValid && hintQuestionValid && passWordValid &&  dobValid && confirmPasswordValid && captchaValid) {
        passportUserCreated = true;
        this.passportUser = passportUser;
    }
        return passportUserCreated;
    }
}
