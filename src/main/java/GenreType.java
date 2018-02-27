public enum GenreType {
    SCIFI("In a Galaxy far far away..."),
    HORROR("very scary spooky stuff"),
    CRIME("There's been a murder");

    private final String genre;

    GenreType(String genre){
        this.genre = genre;
    }

    public String getGenre(){
        return this.genre;
    }
}
