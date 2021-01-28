package com.studentsfp.devenvironment;

import com.studentsfp.devenvironment.Biblio.Publication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class BiblioTest {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Test
    void testTitle(){
        String title="El quijote";
        Publication book= new Publication();
        book.setTitle(title);
        String innerTitle=book.getTitle();
        Assert.isTrue(innerTitle.equals(title), "El set de libro no funciona");
    }
}
