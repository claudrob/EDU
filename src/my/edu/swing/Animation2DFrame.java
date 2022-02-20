package my.edu.swing;

import javax.swing.*;

public class Animation2DFrame extends JFrame {

    private Animation2DPanel panel;

    public Animation2DFrame(){

        panel = new Animation2DPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

}
