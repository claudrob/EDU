package my.edu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class KeyListenerFrame extends JFrame  implements KeyListener {

    private JLabel label;

    public KeyListenerFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);
        label = new JLabel();
        label.setBounds(0,0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(label);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent event){

        switch (event.getKeyChar()){
            case 'a': label.setLocation(label.getX() - 10, label.getY());
                break;
            case '.': label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 'e': label.setLocation(label.getX() , label.getY() + 10);
                break;
            case 'u': label.setLocation(label.getX() +  10, label.getY());
                break;
        }


    }

    @Override
    public void keyPressed(KeyEvent event){

        switch (event.getKeyCode()){
            case 37: label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 40: label.setLocation(label.getX() , label.getY() + 10);
                break;
            case 39: label.setLocation(label.getX() +  10, label.getY());
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent event){
        System.out.println("You released key char: " + event.getKeyChar());
        System.out.println("You released key code: " + event.getKeyCode());

    }


}
