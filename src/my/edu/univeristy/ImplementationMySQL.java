package my.edu.univeristy;

public class ImplementationMySQL implements IAccessData{

    @Override
    public void insert() {
        System.out.println("Insert via MySQL");

    }

    @Override
    public void list() {

        System.out.println("List via MySQL");
    }

    @Override
    public void update() {

        System.out.println("Update via MySQL");
    }

    @Override
    public void delete() {

        System.out.println("Delete via MySQL");
    }
}
