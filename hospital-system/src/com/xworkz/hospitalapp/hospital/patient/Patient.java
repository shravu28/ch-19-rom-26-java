package com.xworkz.hospitalapp.hospital.patient;

import com.xworkz.hospitalapp.hospital.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.validator.HospitalValidator;

public class Patient {


    Hospital hospital;

        public boolean addHospital(Hospital hospital){
            boolean isHospitalAdded=false;

            HospitalValidator hospitalValidator = new HospitalValidator();
            boolean isHospitalInfoAddedValid=hospitalValidator.validHospitalInfo(hospital);

            if (isHospitalInfoAddedValid) {
                this.hospital = hospital;
                isHospitalAdded = true;
            }
            return isHospitalAdded;
        }


        public void getHospitalInfo(){
            System.out.println("The hospital info:"+hospital.getHospitalId());
            System.out.println("the hospital is:"+hospital.getHospitalName());
            System.out.println("The hospital is :"+hospital.getHospitalType());
            System.out.println("The hospital is :"+hospital.getHospitalLocation());
            System.out.println("The hospital is :"+hospital.getNumberOfDoctors());

        }

    }



