import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(6);
        book = new Book(GenreType.CRIME);
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
       library.addBook(book);
       assertEquals(1, library.countBooks());
    }

    @Test
    public void addIfUnderCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(6, library.countBooks());
        library.addBook(book);
        assertEquals(6, library.countBooks());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        Book removed =  library.removeBook();
        assertNotNull(removed);
        assertEquals(0, library.countBooks());
    }
}
