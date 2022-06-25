package my.edu.univeristy;

public class KeyBoard extends InputDevice{

    private int keyBoardID;
    private static int keyBoardCounter;

    public KeyBoard(String inputType, String make){
        super(inputType, make);
        keyBoardID = ++KeyBoard.keyBoardCounter;

    }

    @Override
    public String toString() {
        return super.toString() + " KeyBoard{" +
                "keyBoardID=" + keyBoardID +
                '}';
    }
}
