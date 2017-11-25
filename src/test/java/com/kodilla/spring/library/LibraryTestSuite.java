package com.kodilla.spring.library;

import org.junit.Test;


public class LibraryTestSuite {
    @Test
    public void testLoadFromDb() {
        //Given
        /*ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");*/

        LibraryDbController libraryDbController = new LibraryDbController();
        Library library = new Library(libraryDbController);
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    public void testSaveToDb() {
        //Given
       /* ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);*/
        LibraryDbController libraryDbController = new LibraryDbController();
        Library library = new Library(libraryDbController);
        //When
        library.saveToDb();
        //Then
        //do nothing
    }
}