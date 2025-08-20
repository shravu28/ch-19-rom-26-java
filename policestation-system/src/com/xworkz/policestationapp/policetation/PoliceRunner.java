package com.xworkz.policestationapp.policetation;

import com.xworkz.policestationapp.policetation.police.Police;
import com.xworkz.policestationapp.policetation.policetation.PoliceStation;
public class PoliceRunner {

        public static void main(String[] args) {
            PoliceStation policeStation = new PoliceStation();
            policeStation.setPoliceStationId(4);
            policeStation.setPoliceStationName(1);
            policeStation.setPoliceStationType("subInspector");
            policeStation.setPoliceStationLocation("rajajinagara policestation");
            policeStation.setNumberOfPolice("fifty members");

            Police police = new Police();
            boolean addPoliceStation = police.addPoliceStation(policeStation);


            System.out.println("The policeStation info:"+policeStation.getPoliceStationId());
            System.out.println("the policeStation is:"+policeStation.getPoliceStationName());
            System.out.println("The policeStation is :"+policeStation.getPoliceStationType());
            System.out.println("The policeStation is :"+policeStation.getPoliceStationLocation());
            System.out.println("The policeStation is :"+policeStation.getNumberOfPolice());

            if (addPoliceStation) {
                police.getPoliceStationInfo();
            } else {
            }
            System.out.println("PoliceStation is not added");
        }
    }



