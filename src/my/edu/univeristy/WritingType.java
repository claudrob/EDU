package my.edu.univeristy;

public enum WritingType {
    CLASIC("Hand writing"),
    MODERN("Digital writing");

    private final String description;

    private WritingType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}
