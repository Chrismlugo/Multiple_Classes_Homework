import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public int countCollection(){
        return this.collection.size();
    }


    public void takeBook(Library library){
        Book book = library.removeBook();
        collection.add(book);
    }


}
