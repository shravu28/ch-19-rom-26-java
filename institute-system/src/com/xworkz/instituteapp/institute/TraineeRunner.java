package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.institute.Trainee.Trainee;
import com.xworkz.instituteapp.institute.institute.Institute;

public class TraineeRunner {

        public static void main(String[] args) {
            Institute institute = new Institute();
            institute.setInstituteId(4);
            institute.setInstituteName(1);
            institute.setInstituteType("xworkz ");
            institute.setInstituteLocation("rajajinagar");
            institute.setNumberOfInstitute("Seven members trainers");

            Trainee trainee = new Trainee();
            boolean addedInstitute = trainee.addInstitute(institute);
            if (trainee.addInstitute(institute)) {
                trainee.getInstituteInfo();
            } else {
            }
            System.out.println("institute is not added");
        }
    }



