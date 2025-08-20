package com.xworkz.libraryapp.library.library;

public class Library {



        private   int libraryId;

        public int getLibraryId() {
            return libraryId;
        }

        public void setLibraryId(int libraryId) {
            this.libraryId = libraryId;
        }

        private int totalBooks;

        public int getTotalBooks() {
            return totalBooks;
        }

        public void setTotalBooks(int totalBooks) {
            this.totalBooks = totalBooks;
        }

        private   String libraryName;

        public String getLibraryName() {
            return libraryName;
        }

        public void setLibraryName(String libraryName) {
            this.libraryName = libraryName;
        }


        private  String openingHours;

        public String getOpeningHours() {
            return openingHours;
        }

        public void setOpeningHours(String openingHours) {
            this.openingHours = openingHours;
        }

        private String closingHours;

        public String getClosingHours() {
            return closingHours;
        }

        public void setClosingHours(String closingHours) {
            this.closingHours = closingHours;

        }
            private int staffCount;

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }
}




