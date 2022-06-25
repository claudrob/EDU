package my.edu.test;

import my.edu.univeristy.*;

public class PCWorldTest {

    public static void main(String[] args) {

        Computer computer1 = new Computer("Dell", new Monitor("Dell", 22.0),
            new KeyBoard("KeyBoard", "Dell"),
                new Mouse("Mouse", "Dell"));
        Computer computer2 = new Computer("Dell", new Monitor("Dell", 22.0),
            new KeyBoard("KeyBoard", "Dell"),
                new Mouse("Mouse", "Dell"));
        Computer computer3 = new Computer("Dell", new Monitor("Dell", 22.0),
            new KeyBoard("KeyBoard", "Dell"),
                new Mouse("Mouse", "Dell"));
        Computer computer4 = new Computer("Dell", new Monitor("Dell", 22.0),
            new KeyBoard("KeyBoard", "Dell"),
                new Mouse("Mouse", "Dell"));

        ComputerOrder computerOrder = new ComputerOrder();
        computerOrder.addComputer(computer1);
        computerOrder.addComputer(computer2);
        computerOrder.addComputer(computer3);
        computerOrder.addComputer(computer4);

        computerOrder.showOrder();

    }

}
