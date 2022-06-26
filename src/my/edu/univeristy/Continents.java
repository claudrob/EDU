package my.edu.univeristy;

public enum Continents {

    AFRICA(53),
    EUROPE(46),
    ASIA(44),
    AMERICA(33),
    Antarctica(13),
    AUSTRALIA(1);


    private final int countries;


    Continents(int countries){
        this.countries = countries;
    }

    public int getCountries(){
        return countries;
    }

}
