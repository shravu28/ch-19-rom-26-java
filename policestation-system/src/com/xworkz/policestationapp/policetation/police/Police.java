package com.xworkz.policestationapp.policetation.police;
import com.xworkz.policestationapp.policetation.policetation.PoliceStation;
import com.xworkz.policestationapp.policetation.validator.PoliceStationValidator;
public class Police {

        PoliceStation policeStation;

        public boolean addPoliceStation(PoliceStation policeStation){
            boolean isPoliceStationAdded=false;

            PoliceStationValidator policeStationValidator = new PoliceStationValidator();
            boolean isPoliceStationInfoAddedValid=policeStationValidator.validPoliceStationInfo(policeStation);

            if (isPoliceStationInfoAddedValid) {
                this.policeStation = policeStation;
                isPoliceStationAdded = true;
            }
            return isPoliceStationAdded;
        }


        public void getPoliceStationInfo(){


        }

    }





