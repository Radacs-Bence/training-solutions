package iofilestest.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @TempDir
    Path temporaryFolder;


    @Test
    void addTest() {
        Library library = new Library();
        library.add(new Book("a", "b"));
        assertEquals("a", library.getBooks().get(0).getAuthor());
        assertEquals("b", library.getBooks().get(0).getTitle());
    }

    @Test
    void saveBooksTest()throws IllegalArgumentException {
        Library library = new Library();
        library.add(new Book("a", "b"));
        Path file = temporaryFolder.resolve("library.txt");
        library.saveBooks(file);
        assertTrue(Files.exists(temporaryFolder.resolve("library.txt")));

    }

    @Test
    void loadBooksTest() {

        Library librarySave = new Library();
        librarySave.add(new Book("a", "b"));
        Path file = temporaryFolder.resolve("library.txt");
        librarySave.saveBooks(file);

        Library libraryLoad = new Library();
        libraryLoad.loadBooks(file);

        assertEquals("a", libraryLoad.getBooks().get(0).getAuthor());
        assertEquals("b", libraryLoad.getBooks().get(0).getTitle());

    }
}