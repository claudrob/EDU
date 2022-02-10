package my.edu.swing;

import javax.swing.*;

public class DragDropFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();

    public DragDropFrame(){
        this.setTitle("Drag & Drop Demo");
        this.add(dragPanel);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
