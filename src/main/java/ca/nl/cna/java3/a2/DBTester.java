package ca.nl.cna.java3.a2;

import java.util.List;

public class DBTester {

    public static void main(String[] args) {
        System.out.println("Database Tester");

        List<Book> bookList = DBConnection.getAllBooks();

        for (Book book: bookList) {
            book.printBookInformation(System.out);
        }


    }

}
