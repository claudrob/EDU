package my.edu.univeristy;

public class Monitor {

    private final int monitorID;
    private String make;
    private double size;
    private static int monitorCounter;

    public Monitor(){
        this.monitorID = ++Monitor.monitorCounter;
    }

    public int getMonitorID() {
        return monitorID;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Monitor(String make, double size){
        this();
        this.make = make;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "monitorID=" + monitorID +
                ", make='" + make + '\'' +
                ", size=" + size +
                '}';
    }
}
