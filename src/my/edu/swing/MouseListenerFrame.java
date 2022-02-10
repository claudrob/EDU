package my.edu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerFrame extends JFrame implements MouseListener {

    JLabel label;

    public MouseListenerFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        this.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You RELEASED the mouse");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        System.out.println("You ENTERED the mouse");
        label.setBackground(Color.blue);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You EXITED the mouse");
        label.setBackground(Color.red);
    }
}
