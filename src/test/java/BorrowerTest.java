import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
        public void before(){
        borrower = new Borrower(5);
        library = new Library(10);
        book = new Book(GenreType.HORROR);

    }

    @Test
    public void canCountCollection(){
        assertEquals(0, borrower.countCollection());
    }


    @Test
    public void canBorrowBook(){
         library.addBook(book);
         borrower.takeBook(library);
         assertEquals(0, library.countBooks());
         assertEquals(1, borrower.countCollection());

    }

    @Test
    public void cantBorrowOverLimit(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        borrower.takeBook(library);
        borrower.takeBook(library);
        borrower.takeBook(library);
        borrower.takeBook(library);
        borrower.takeBook(library);
        assertEquals(5, borrower.countCollection());
        borrower.takeBook(library);
        assertEquals(5, borrower.countCollection());
    }


}
