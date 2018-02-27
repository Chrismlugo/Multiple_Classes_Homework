import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book);
        books.add(book);
        library = new Library(6,books);
    }

    @Test
    public void canCountBooks(){
        assertEquals(3, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
       library.add(book);
       assertEquals(4, library.countBooks());
    }

    @Test
    public void addIfUnderCapacity(){
        library.add(book);
        library.add(book);
        library.add(book);
        assertEquals(6, library.countBooks());
        library.add(book);
        assertEquals(6, library.countBooks());
    }


}
