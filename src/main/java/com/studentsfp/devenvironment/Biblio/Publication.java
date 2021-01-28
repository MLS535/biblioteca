package com.studentsfp.devenvironment.Biblio;

import java.util.List;

public class Publication {
   private String isbnn;
   private String title;
   private Integer yearOfPublication;
   private List<Book> addBookList;

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public List<Book> getAddBookList() {
        return addBookList;
    }

    public void setAddBookList(List<Book> addBookList) {
        this.addBookList = addBookList;
    }

    public Publication(String isbn, String titulo, Integer yearOfPublication){
        this.isbnn=isbn;
        this.yearOfPublication=yearOfPublication;
        this.title=titulo;
    }

    public Publication() {

    }


    public String getIsbnn() {
        return isbnn;
    }

    public void setIsbnn(String isbnn) {
        this.isbnn = isbnn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
