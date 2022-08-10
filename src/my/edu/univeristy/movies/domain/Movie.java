package my.edu.univeristy.movies.domain;

public class Movie {

    private String name;

    public Movie(){

    }

    public Movie(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Name: " + name;
    }
}
