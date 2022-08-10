package my.edu.univeristy.movies.data;

import my.edu.univeristy.movies.domain.Movie;
import my.edu.univeristy.movies.exceptions.DataAccessException;
import my.edu.univeristy.movies.exceptions.ReadDataException;
import my.edu.univeristy.movies.exceptions.WriteDataException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DataAccessImpl implements IDataAccess {
    @Override
    public boolean exist(String fileName) throws DataAccessException {

        File file = new File(fileName);
        return file.exists();

    }

    @Override
    public List<Movie> list(String fileName) throws ReadDataException {
        List<Movie> movieList = new ArrayList<Movie>();
        File file = new File(fileName);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String input = bufferedReader.readLine();
            while (input != null){

                if(!input.trim().equals(""))
                    movieList.add(new Movie(input));

                input = bufferedReader.readLine();
            }
            bufferedReader.close();

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
            throw new ReadDataException("Could not find the file: " + ex.getMessage());
        }
        catch (IOException ex){
            ex.printStackTrace();
            throw new ReadDataException("Could not access the file." + ex.getMessage());
        }
        return movieList;

    }

    @Override
    public void write(Movie movie, String fileName, boolean append) throws WriteDataException {

        File file = new File(fileName);
        try {

            PrintWriter printWriter = new PrintWriter(new FileWriter(file, append));
            printWriter.println(movie.getName());
            printWriter.close();

        }catch (IOException exception){
            throw new WriteDataException(exception.getMessage());
        }


    }

    @Override
    public String search(String fileName, String movieName) throws ReadDataException {
        File file = new File(fileName);
        String theMovie = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String input = bufferedReader.readLine();
            int index = 1;
            while (input != null){

                if(input.trim().toLowerCase().equals(movieName.toLowerCase())) {
                    theMovie = index + " " + input;
                    break;
                }

                index++;

                input = bufferedReader.readLine();
            }
            bufferedReader.close();

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
            throw new ReadDataException("Could not find the file: " + ex.getMessage());
        }
        catch (IOException ex){
            ex.printStackTrace();
            throw new ReadDataException("Could not access the file." + ex.getMessage());
        }
        return theMovie;
    }

    @Override
    public void create(String fileName) throws DataAccessException {
        File file = new File(fileName);

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file));
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new DataAccessException("Exception in creating file: " + e.getMessage());
        }


    }

    @Override
    public void delete(String fileName)  {
        File file = new File(fileName);
        if(file.exists())
            file.delete();
        System.out.println("Deleted file: " + fileName);




    }
}
