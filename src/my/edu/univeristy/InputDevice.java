package my.edu.univeristy;

public class InputDevice {

    private String inputType;
    private String make;

    public InputDevice(String inputType, String make){
        this.inputType = inputType;
        this.make = make;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "InputDevice{" +
                "inputType='" + inputType + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
