package com.xworkz.policestationapp.policetation.validator;
import com.xworkz.policestationapp.policetation.policetation.PoliceStation;
public class PoliceStationValidator {

        PoliceStation policeStation;
        public boolean validPoliceStationInfo(PoliceStation policeStation){
            boolean policeStationValidated = false;
            boolean policeStationIdValidate = false;
            boolean policeStationNameValidate = false;
            boolean policeStationTypeValidate = false;
            boolean policeStationLocationValidate = false;
            boolean numberOfPoliceValidate = false;

            if (policeStation.getPoliceStationId()!=0){
                policeStationIdValidate=true;
            }
            else {
                System.out.println("policeStationId is valid");
            }
            if(policeStation.getPoliceStationName()!=0){
                policeStationNameValidate=true;
            }else {
                System.out.println("HospitalName is valid");
            }
            if (policeStation.getPoliceStationType()!=null && !policeStation.getPoliceStationType().isEmpty()){
                policeStationTypeValidate=true;
            }else {
                System.out.println("policeStationType is valid");
            }
            if (policeStation.getPoliceStationLocation()!=null && !policeStation.getPoliceStationLocation().isEmpty()){
                policeStationLocationValidate=true;
            }else {
                System.out.println("HospitalLocation is valid");
            }
            if (policeStation.getNumberOfPolice()!=null && !policeStation.getNumberOfPolice().isEmpty()){
                numberOfPoliceValidate=true;
            }else {
                System.out.println("NumberOfDoctors  is valid");
            }
            if (policeStationIdValidate && policeStationNameValidate && policeStationTypeValidate&&policeStationLocationValidate && numberOfPoliceValidate){
                this.policeStation=policeStation;
                policeStationValidated=true;
            }
            return policeStationValidated;
        }
    }



