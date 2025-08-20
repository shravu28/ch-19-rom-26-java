package com.xworkz.store;

import com.xworkz.store.app.playstore.PlayStore;
import com.xworkz.store.app.app.Application;

public class Runner {
    public static void main(String[] args) {
        Application application=new Application();
        application.setAppId(1);
        application.setAppName("WhatsApp Messenger");
        application.setVersion("2.25.21.82");
        application.setUpdatedOn("4 Aug 2025");
        application.setDownloads(10000000000l);
        application.setReleasedOn("18 Oct 2010");
        application.setRequiredOs("Android 5.0 and up");
        application.setOfferedBy("WhatsApp LLC");

        PlayStore playStore=new PlayStore();
        boolean applicationAdded=playStore.addApplication(application);

        if(applicationAdded){
            playStore.getAppInfo();
        }
        else{
            System.out.println("Application not added");
        }
    }
}