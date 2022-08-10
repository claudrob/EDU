package my.edu.univeristy.movies.business;

import my.edu.univeristy.movies.data.DataAccessImpl;
import my.edu.univeristy.movies.data.IDataAccess;
import my.edu.univeristy.movies.domain.Movie;
import my.edu.univeristy.movies.exceptions.DataAccessException;
import my.edu.univeristy.movies.exceptions.ReadDataException;

import java.util.List;

public class MovieCatalogImpl implements MovieCatalog{

    private final IDataAccess dataAccess;

    public MovieCatalogImpl(){
        this.dataAccess = new DataAccessImpl();

    }

    @Override
    public void addMovie(String movieName) {
        Movie movie = new Movie(movieName);
        boolean append = false;
        try {
            append = dataAccess.exist(RESOURCE_NAME);
            dataAccess.write(movie, RESOURCE_NAME, append);
        }catch(DataAccessException exception){
            exception.printStackTrace();
        }

    }

    @Override
    public void listMovies() {

        try {
            List<Movie> movieList = dataAccess.list(RESOURCE_NAME);
//            System.out.println("movieList = " + movieList);
            for(Movie movie : movieList){
                System.out.println("movie = " + movie);
            }
        }catch (ReadDataException exception){
            System.out.println("Erroc");
            exception.printStackTrace();
        }

    }

    @Override
    public void searchMovie(String movieName) {
        String result = null;

        try {
            result = this.dataAccess.search(RESOURCE_NAME, movieName);

        } catch (ReadDataException e) {
            e.printStackTrace();
        }
        System.out.println("SearchMovie result = " + result);

    }

    @Override
    public void initiateMoviesCatalogue() {


        try {
            if(this.dataAccess.exist(RESOURCE_NAME)){
                dataAccess.delete(RESOURCE_NAME);

            }
            dataAccess.create(RESOURCE_NAME);

        } catch (DataAccessException e) {
            System.out.println("Error initializing the movie catalogue.");
            e.printStackTrace();
        }

    }
}
