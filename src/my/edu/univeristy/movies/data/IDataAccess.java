package my.edu.univeristy.movies.data;

import my.edu.univeristy.movies.domain.Movie;
import my.edu.univeristy.movies.exceptions.DataAccessException;
import my.edu.univeristy.movies.exceptions.ReadDataException;
import my.edu.univeristy.movies.exceptions.WriteDataException;

import java.util.List;

public interface IDataAccess {

    boolean exist(String name) throws DataAccessException;

    List<Movie> list() throws ReadDataException;

    void write(Movie movie, String fileName, boolean append) throws WriteDataException;

    String search(String fileName, String movieName) throws ReadDataException;

    void create(String fileName, String movieName) throws WriteDataException;

    void delete(String fileName, String movieName) throws WriteDataException;

}
