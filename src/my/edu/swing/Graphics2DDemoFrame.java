package my.edu.swing;

import javax.swing.*;
import java.awt.*;

public class Graphics2DDemoFrame extends JFrame {

    private Graphics2DDemoPanel panel;

    public Graphics2DDemoFrame(){

        panel = new Graphics2DDemoPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setSize(500, 500);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }





}
