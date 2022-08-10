package my.edu.univeristy.movies.data;

import my.edu.univeristy.movies.domain.Movie;
import my.edu.univeristy.movies.exceptions.DataAccessException;
import my.edu.univeristy.movies.exceptions.ReadDataException;
import my.edu.univeristy.movies.exceptions.WriteDataException;

import java.util.List;

public class DataAccessImpl implements IDataAccess {
    @Override
    public boolean exist(String name) throws DataAccessException {
        return false;
    }

    @Override
    public List<Movie> list() throws ReadDataException {
        return null;
    }

    @Override
    public void write(Movie movie, String fileName, boolean append) throws WriteDataException {

    }

    @Override
    public String search(String fileName, String movieName) throws ReadDataException {
        return null;
    }

    @Override
    public void create(String fileName, String movieName) throws WriteDataException {

    }

    @Override
    public void delete(String fileName, String movieName) throws WriteDataException {

    }
}
