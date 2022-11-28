package movies;

public class Movie {
    private String title;

    private String genre;

    private int rating;

    //Getters and Setters

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //Constructors

    public Movie(){

    }

    public Movie(String title, String genre, int rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    //Methods

    public void playIt(Movie movie){
        System.out.printf("Playing the movie: %s %nRating: %s/5%nGenre: %s%n ", movie.getTitle(), movie.getRating(), movie.getGenre());
    }



}//End of Movie Class
