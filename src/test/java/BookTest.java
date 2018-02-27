import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book(GenreType.HORROR);
    }

    @Test
    public void bookHasDescription(){
        book = new Book(GenreType.SCIFI);
        assertEquals("In a Galaxy far far away...", book.getGenreFromEnum());
    }

}
