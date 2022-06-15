package my.edu.univeristy;

import java.util.Date;

public class Client extends SuperPerson{
    private int clientId;
    private Date registerDate;
    private boolean vip;
    private static int clientIdCounter;

    public Client(){
        this.clientId = ++Client.clientIdCounter;
    }

    public Client( Date registerDate, boolean vip) {
        this();
        this.registerDate = registerDate;
        this.vip = vip;
    }

    public Client(String name,  Date registerDate, boolean vip) {
        this();
        //super(name);
        this.name = name;
        this.clientId = clientId;
        this.registerDate = registerDate;
        this.vip = vip;
    }

    public Client(String name, char gender, int age, String address,  Date registerDate, boolean vip) {
        this();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        // super(name, gender, age, address);
        this.clientId = clientId;
        this.registerDate = registerDate;
        this.vip = vip;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public void imprimir(){
        super.imprimir();
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", registerDate=" + registerDate +
                ", vip=" + vip +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
