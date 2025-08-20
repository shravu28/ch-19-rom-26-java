package com.xworkz.store.app.playstore;

import com.xworkz.store.app.app.Application;
import com.xworkz.store.validator.AppValidator;



public class PlayStore {
    Application application;
    public boolean addApplication(Application application){
        boolean isApplicationAdded=false;
        boolean isApplicationInfoAddedValid=false;



        AppValidator appValidator=new AppValidator();
        isApplicationInfoAddedValid=appValidator.validateApplicationInfo(application);

        if(isApplicationInfoAddedValid){
            this.application=application;
            isApplicationAdded=true;
        }
        return isApplicationAdded;

    }
    public void getAppInfo(){
        System.out.println("App Id: "+application.getAppId());
        System.out.println("App Name: "+application.getAppName());
        System.out.println("Version: "+application.getVersion());
        System.out.println("Update On: "+application.getUpdatedOn());
        System.out.println("Required OS :"+application.getRequiredOs());
        System.out.println("Downloads: "+application.getDownloads());
        System.out.println("Released On "+application.getReleasedOn());
        System.out.println("Offered by: "+application.getOfferedBy());

    }
}