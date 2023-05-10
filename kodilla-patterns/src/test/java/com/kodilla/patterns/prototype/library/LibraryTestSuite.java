package com.kodilla.patterns.prototype.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    private static final Library library = new Library("Library_1");

    @Test
    void testGetBooksDeepCloning() {
        //Given
        Book b1 = new Book("Book1",
                "Author1", LocalDate.of(2021, 1, 8));
        Book b2 = new Book("Book2",
                "Author2", LocalDate.of(2022, 1, 8));
        Book b3 = new Book("Book3",
                "Author3", LocalDate.of(2023, 1, 8));

        library.getBooks().add(b1);
        library.getBooks().add(b2);
        library.getBooks().add(b3);

        Library deepClonedLib = null;
        try {
            deepClonedLib = library.deepCopy();
            deepClonedLib.setName("Library_DeepCloned");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library shallowClonedLib = null;
        try {
            shallowClonedLib = library.shallowCopy();
            shallowClonedLib.setName("Library_ShallowCloned");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(b1);

        //Then
        assertEquals(2, library.getBooks().size());
        assertEquals(2, shallowClonedLib.getBooks().size());
        assertEquals(3, deepClonedLib.getBooks().size());
    }

}
