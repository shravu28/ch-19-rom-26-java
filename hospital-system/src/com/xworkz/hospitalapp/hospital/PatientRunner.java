package com.xworkz.hospitalapp.hospital;
import com.xworkz.hospitalapp.hospital.patient.Patient;
import com.xworkz.hospitalapp.hospital.hospital.Hospital;


public class PatientRunner {


        public static void main(String[] args) {
            Hospital hospital = new Hospital();
            hospital.setHospitalId(4);
            hospital.setHospitalName(1);
            hospital.setHospitalType("HAL main ward");
            hospital.setHospitalLocation("marathahalli HAL main gate");
            hospital.setNumberOfDoctors("Seven members doctors");

            Patient patient = new Patient();
            boolean theatreAdded = patient.addHospital(hospital);
            if (theatreAdded) {
                patient.getHospitalInfo();
            } else {
            }
            System.out.println("Theatre is not added");
        }
    }

