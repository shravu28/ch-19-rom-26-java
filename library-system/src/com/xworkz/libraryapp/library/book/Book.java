package com.xworkz.libraryapp.library.book;

import com.xworkz.libraryapp.library.library.Library;
import com.xworkz.libraryapp.library.validator.LibraryValidator;
public class Book {

    Library library;

        public boolean addLibrary(Library library){
            boolean isLibraryAdded=false;

            LibraryValidator libraryValidator = new LibraryValidator();
            boolean isHospitalInfoAddedValid=libraryValidator.validHospitalInfo(library);

            if (isHospitalInfoAddedValid) {
                this.library = library;
                isLibraryAdded = true;
            }
            return isLibraryAdded;
        }


        public void getLibraryInfo(){
            System.out.println("The library info:"+library.getLibraryId());
            System.out.println("the library is:"+library.getLibraryName());
            System.out.println("The library is :"+library.getTotalBooks());
            System.out.println("The library is :"+library.getOpeningHours());
            System.out.println("The library is :"+library.getClosingHours());
            System.out.println("The library is :"+library.getStaffCount());

        }

    }






