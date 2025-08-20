package com.xworkz.libraryapp.library;
import com.xworkz.libraryapp.library.book.Book;
import com.xworkz.libraryapp.library.library.Library;

public class BookRunner {


        public static void main(String[] args) {
            Library library = new Library();
            library.setLibraryId(4);
            library.setTotalBooks(1);
            library.setLibraryName("knowledge resource centre");
            library.setOpeningHours("nine");
            library.setClosingHours("Six");
            library.setStaffCount(5);

            Book book = new Book();
            boolean theatreAdded = book.addLibrary(library);
            if (theatreAdded) {
                book.getLibraryInfo();
            } else {
            }
            System.out.println("Theatre is not added");
        }
    }



