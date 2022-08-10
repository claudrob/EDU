package my.edu.univeristy.movies;

import my.edu.univeristy.movies.business.MovieCatalog;
import my.edu.univeristy.movies.business.MovieCatalogImpl;

import java.util.Scanner;

public class MovieCatalogueView {
    public static void main(String[] args) {
        var option = -1;

        var scanner = new Scanner(System.in);
        MovieCatalog movieCatalog = new MovieCatalogImpl();

        while(option != 0){

            System.out.println("Select option:");
            System.out.println("1. Initiate movie catalogue.");
            System.out.println("2. Add Movie.");
            System.out.println("3. List movies.");
            System.out.println("4. Search movie.");
            System.out.println("0. Exit.");

            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                        movieCatalog.initiateMoviesCatalogue();
                        break;
                case 2:
                    System.out.println("Enter the name of the movie");
                    String movieName = scanner.nextLine();
                        movieCatalog.addMovie(movieName);
                        break;
                case 3:
                    movieCatalog.listMovies();
                    break;
                case 4:
                    System.out.println("Enter the name of the movie to search:");
                    String movie = scanner.nextLine();
                    movieCatalog.searchMovie(movie);
                    break;
                case 0:
                    System.out.println("Hasta la vista");
                    break;
                default:
                    System.out.println("Could not identify the option");

            }

        }
    }
}
