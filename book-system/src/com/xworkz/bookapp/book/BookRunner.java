package com.xworkz.bookapp.book;
import com.xworkz.bookapp.book.Book;
public class BookRunner {


        public static void main(String[] args) {

            System.out.println("main started");
            Book book = new Book();
            book.setBookId(1);
            book.setBookName("fiber");
            book.setPrice(100.00);
            int bookId = book.getBookId();
            String bookName=book.getBookName();
            double price=book.getPrice();
            System.out.println("main ended");
        }
    }