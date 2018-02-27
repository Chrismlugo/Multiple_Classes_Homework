import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int countBooks(){
        return this.books.size();
    }

    public void addBook(Book book){
        if(countBooks() < this.capacity) {
            books.add(book);
        }

    }

    public Book removeBook() {
        return this.books.remove(0);
    }


}
