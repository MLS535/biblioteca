package com.studentsfp.devenvironment.controller;

import com.studentsfp.devenvironment.Biblio.BiblioHelper;
import com.studentsfp.devenvironment.Biblio.Publication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class RestBiblioController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/openAddBook")
    public Publication getTitle(@RequestParam(value = "isbn", defaultValue = "456285s") String isbn,
                           @RequestParam(value = "title", defaultValue = "Quijote") String title,
                           @RequestParam(value = "Year", defaultValue = "1999") Integer yearOfPublication) {
        Publication publi = BiblioHelper.initAddBook(isbn, title, yearOfPublication);
        return publi;
    }
}
