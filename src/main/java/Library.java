import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity, ArrayList<Book> books){
        this.capacity = capacity;
        this.books = books;
    }

    public int countBooks(){
        return this.books.size();
    }

    public void add(Book book){
        if(this.books.size() < this.capacity) {
            books.add(book);
        }
    }


}
