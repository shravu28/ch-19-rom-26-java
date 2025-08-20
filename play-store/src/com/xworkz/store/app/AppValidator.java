package com.xworkz.store.validator;

import com.xworkz.store.app.app.Application;

public class AppValidator {
    Application application = new Application();

    public boolean validateApplicationInfo(Application application) {
        boolean appValidator = false;
        boolean appIdValid = false;
        boolean appNameValid = false;
        boolean versionValid = false;
        boolean updateOnValid = false;
        boolean downloadsValid = false;
        boolean requiredOsValid = false;
        boolean offeredByValid = false;
        boolean releasedOnValid = false;


        if (application.getAppId() > 0) {
            appIdValid = true;
        } else {
            System.out.println("Id is not valid");
        }
        if (application.getAppName() != null && !application.getAppName().isEmpty()) {
            appNameValid = true;
        } else {
            System.out.println("App name is not valid");
        }
        if (application.getVersion() != null && !application.getVersion().isEmpty()) {
            versionValid = true;
        } else {
            System.out.println("Version is not valid");
        }
        if (application.getDownloads() != 0) {
            downloadsValid = true;
        } else {
            System.out.println("Downloads are not valid");
        }
        if (application.getUpdatedOn() != null && !application.getUpdatedOn().isEmpty()) {
            updateOnValid = true;
        } else {
            System.out.println("Update On is not valid");
        }
        if (application.getRequiredOs() != null && !application.getRequiredOs().isEmpty()) {
            requiredOsValid = true;
        } else {
            System.out.println("Required OS is not valid");
        }
        if (application.getOfferedBy() != null && !application.getOfferedBy().isEmpty()) {
            offeredByValid = true;
        } else {
            System.out.println("offered by is not valid");
        }
        if (application.getReleasedOn() != null && !application.getReleasedOn().isEmpty()) {
            releasedOnValid = true;
        } else {
            System.out.println("Released on is not valid");
        }
        if (appIdValid && appNameValid && versionValid && updateOnValid && releasedOnValid && requiredOsValid && offeredByValid && downloadsValid) {
            this.application = application;
            appValidator = true;
        }
        return appValidator;
    }


}