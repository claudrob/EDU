package my.edu.univeristy.movies;

import my.edu.univeristy.movies.data.DataAccessImpl;
import my.edu.univeristy.movies.data.IDataAccess;
import my.edu.univeristy.movies.domain.Movie;
import my.edu.univeristy.movies.exceptions.DataAccessException;

import java.util.List;

public class FinalLabMovies {

    public static void main(String[] args) {

        testDataAccess();

    }

    public static void testDataAccess(){

        IDataAccess dataAccess = new DataAccessImpl();
        String fileName = "data/movies.txt";
        try {
            boolean fileExist = dataAccess.exist(fileName);
            System.out.println("testDataAccess: fileExist = " + fileExist);

            System.out.println("Testing list:");
            List<Movie> movieList = dataAccess.list(fileName);
            System.out.println("movieList = " + movieList);

            System.out.println("Adding movie:");
            dataAccess.write(new Movie("Fast and Furious"), fileName, true);

            System.out.println("Testing list:");
            movieList = dataAccess.list(fileName);
            System.out.println("movieList = " + movieList);

            System.out.println("Test search");
            String result = dataAccess.search(fileName, "Superman");
            System.out.println("Search result = " + result);


        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}
