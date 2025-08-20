package com.xworkz.instituteapp.institute.validator;
import com.xworkz.instituteapp.institute.institute.Institute;


public class InstituteValidator {

        Institute institute;
        public boolean validHospitalInfo(Institute institute){
            boolean instituteValidated = false;
            boolean instituteIdValidate = false;
            boolean instituteNameValidate = false;
            boolean instituteTypeValidate = false;
            boolean instituteLocationValidate = false;
            boolean numberOfInstituteValidate = false;

            if (institute.getInstituteId()!=0){
                instituteIdValidate=true;
            }
            else {
                System.out.println("instituteId is valid");
            }
            if(institute.getInstituteName()!=0){
                instituteNameValidate=true;
            }else {
                System.out.println("instituteName is valid");
            }
            if (institute.getInstituteType()!=null && !institute.getInstituteType().isEmpty()){
                instituteTypeValidate=true;
            }else {
                System.out.println("instituteType is valid");
            }
            if (institute.getInstituteLocation()!=null && !institute.getInstituteLocation().isEmpty()){
                instituteLocationValidate=true;
            }else {
                System.out.println("InstituteLocation is valid");
            }
            if (institute.getNumberOfInstitute()!=null && !institute.getNumberOfInstitute().isEmpty()){
                numberOfInstituteValidate=true;
            }else {
                System.out.println("NumberOfInstitute  is valid");
            }
            if (instituteIdValidate && instituteNameValidate && instituteTypeValidate &&instituteLocationValidate && numberOfInstituteValidate){
                this.institute=institute;
                instituteValidated=true;
            }
            return instituteValidated;
        }
    }



