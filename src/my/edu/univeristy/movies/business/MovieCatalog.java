package my.edu.univeristy.movies.business;

public interface MovieCatalog {

    String RESOURCE_NAME = "data/movies.txt";

    void addMovie(String movieName);

    void listMovies();

    void searchMovie(String search);

    void initiateMoviesCatalogue();

}
