package com.xworkz.hospitalapp.hospital.validator;
import com.xworkz.hospitalapp.hospital.hospital.Hospital;
public class HospitalValidator {


    Hospital hospital;
        public boolean validHospitalInfo(Hospital hospital){
           boolean hospitalValidated = false;
            boolean hospitalIdValidate = false;
            boolean hospitalNameValidate = false;
            boolean hospitalTypeValidate = false;
            boolean hospitalLocationValidate = false;
            boolean numberOfDoctorsValidate = false;

            if (hospital.getHospitalId()!=0){
                hospitalIdValidate=true;
            }
            else {
                System.out.println("hospitalId is valid");
            }
            if(hospital.getHospitalName()!=0){
                hospitalNameValidate=true;
            }else {
                System.out.println("HospitalName is valid");
            }
            if (hospital.getHospitalType()!=null && !hospital.getHospitalType().isEmpty()){
                hospitalTypeValidate=true;
            }else {
                System.out.println("HospitalType is valid");
            }
            if (hospital.getHospitalLocation()!=null && !hospital.getHospitalLocation().isEmpty()){
                hospitalLocationValidate=true;
            }else {
                System.out.println("HospitalLocation is valid");
            }
            if (hospital.getNumberOfDoctors()!=null && !hospital.getNumberOfDoctors().isEmpty()){
                numberOfDoctorsValidate=true;
            }else {
                System.out.println("NumberOfDoctors  is valid");
            }
            if (hospitalIdValidate && hospitalNameValidate && hospitalTypeValidate &&hospitalLocationValidate && numberOfDoctorsValidate){
                this.hospital=hospital;
                hospitalValidated=true;
            }
            return hospitalValidated;
        }
    }

