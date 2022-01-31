package my.edu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XYZFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    XYZFrame(){

        label = new JLabel();

        button = new JButton();
        button.setBounds(200, 100, 250, 100);
        button.setText("I'm a button");
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setFocusable(false);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createLineBorder(Color.green,5));
//        button.addActionListener(this);
        button.addActionListener(e -> System.out.println("Booooo!"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == button){
            System.out.println("Boo!");
        }
    }

}
