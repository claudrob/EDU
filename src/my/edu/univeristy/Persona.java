package my.edu.univeristy;

public final class Persona {

    public final static int PERSON_CONSTANT = 1;

    private final int personaId;
    private static int personaCounter;

    static {
        System.out.println("Executing Static Code Block");
        ++Persona.personaCounter;

    }

    {
        System.out.println("Executing Non-Static Block");
        this.personaId = Persona.personaCounter++;
    }

    public String name;
    public String surname;

    public Persona(){
        System.out.println("Constructor Persona()");
    }

    public Persona(String name){
        this.name = name;
    }

    public int getPersonaId() {
        return personaId;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
