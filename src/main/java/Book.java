public class Book {
    private GenreType genre;

    public Book(GenreType genre){
        this.genre = genre;
    }

    public String getGenreFromEnum(){
        return this.genre.getGenre();
    }



}

