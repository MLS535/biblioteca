package com.studentsfp.devenvironment.Biblio;

import java.util.ArrayList;
import java.util.List;

public class BiblioHelper {
    public static Publication initAddBook(String isbn, String title, Integer yearOfPublication) {
        Publication publi = new Publication();
        publi.setIsbnn(isbn);
        publi.setTitle(title);
        publi.setYearOfPublication(yearOfPublication);
        List<Book> addBookList = new ArrayList<>();
        Book book=new Book();
        addBookList.add(book);
        return publi;
    }
}
