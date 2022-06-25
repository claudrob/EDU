package my.edu.univeristy;

public class Mouse extends InputDevice{

    private int mouseId;
    private static int mouseCounter;

    public Mouse(String inputType, String make){
        super(inputType, make);
        mouseId = ++Mouse.mouseCounter;
    }

    @Override
    public String toString() {
        return super.toString() + "Mouse{" +
                "mouseId=" + mouseId +
                '}';
    }
}
