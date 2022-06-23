package my.edu.univeristy;

public final class Persona {

    public final static int PERSON_CONSTANT = 1;

    public String name;
    public String surname;

    public Persona(){}

    public Persona(String name){
        this.name = name;
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
