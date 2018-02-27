import java.util.ArrayList;

public class Borrower {
    private int libraryCard;
    private ArrayList<Book> collection;

    public Borrower(int libraryCard){
        this.libraryCard = libraryCard;
        this.collection = new ArrayList<>();
    }

    public int countCollection(){
        return this.collection.size();
    }


    public void takeBook(Library library) {
        if (countCollection() < this.libraryCard) {
            Book book = library.removeBook();
            collection.add(book);
        }

    }


}
