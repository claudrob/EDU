package my.edu.univeristy;

public class ImplementationOracle implements IAccessData {

    @Override
    public void insert() {
        System.out.println("INSERT from Oracle");

    }

    @Override
    public void list() {
        System.out.println("List from Oracle");

    }

    @Override
    public void update() {

        System.out.println("UPDATE from Oracle");
    }

    @Override
    public void delete() {
        System.out.println("DELETE from Oracle");

    }
}
