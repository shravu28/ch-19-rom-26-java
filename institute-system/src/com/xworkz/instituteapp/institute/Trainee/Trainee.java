package com.xworkz.instituteapp.institute.Trainee;
import com.xworkz.instituteapp.institute.institute.Institute;
import com.xworkz.instituteapp.institute.validator.InstituteValidator;
public class Trainee {

        Institute institute;

        public boolean addInstitute(Institute institute){
            boolean isInstituteAdded=false;

            InstituteValidator instituteValidator = new InstituteValidator();
            boolean isInstituteInfoAddedValid=instituteValidator.validHospitalInfo(institute);

            if (isInstituteInfoAddedValid) {
                this.institute = institute;
                isInstituteAdded = true;
            }
            return isInstituteAdded;
        }


        public void getInstituteInfo(){
            System.out.println("The institute info:"+institute.getInstituteId());
            System.out.println("the institute is :"+institute.getInstituteName());
            System.out.println("The institute is :"+institute.getInstituteType());
            System.out.println("The institute is :"+institute.getInstituteLocation());
            System.out.println("The institute is :"+institute.getNumberOfInstitute());

        }

    }





