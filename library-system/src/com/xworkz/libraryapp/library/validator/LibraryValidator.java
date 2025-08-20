package com.xworkz.libraryapp.library.validator;
import com.xworkz.libraryapp.library.library.Library;
public class LibraryValidator {

        Library library;
        public boolean validHospitalInfo(Library library){
boolean libraryValidated = false;
            boolean libraryIdValidate = false;
            boolean totalBooksValidate = false;
            boolean libraryNameValidate = false;
            boolean openingHoursValidate = false;
            boolean closingHoursValidate = false;
            boolean staffCountValidate = false;

            if (library.getLibraryId()!=0){
                libraryIdValidate=true;
            }
            else {
                System.out.println("LibraryId is valid");
            }
            if(library.getTotalBooks()!=0){
                totalBooksValidate=true;
            }else {
                System.out.println("TotalBooks is valid");
            }
            if (library.getLibraryName()!=null && !library.getLibraryName().isEmpty()){
                libraryNameValidate=true;
            }else {
                System.out.println("LibraryName is valid");
            }
            if (library.getClosingHours()!=null && !library.getClosingHours().isEmpty()){
                closingHoursValidate=true;
            }else {
                System.out.println("ClosingHours is valid");
            }

            if (library.getOpeningHours()!=null && !library.getOpeningHours().isEmpty()){
                openingHoursValidate=true;
            }else {
                System.out.println("Opening Hours is valid");
            }

            if (library.getStaffCount()!=0){
                staffCountValidate=true;

            }else {
                System.out.println("staffCount is valid");
            }

            if (libraryIdValidate && totalBooksValidate && libraryNameValidate && closingHoursValidate &&openingHoursValidate && staffCountValidate){
                this.library=library;
                libraryValidated=true;
            }
            return libraryValidated;
        }
    }



