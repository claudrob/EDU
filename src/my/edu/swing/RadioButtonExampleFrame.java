package my.edu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExampleFrame extends JFrame implements ActionListener {

    private JRadioButton pizzaButton;
    private JRadioButton hamburgerButton;
    private JRadioButton hotdogButton;

    public RadioButtonExampleFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == this.pizzaButton){
            System.out.println("Pizza button!");
        }
        else if(e.getSource() == this.hamburgerButton){
            System.out.println("HamburgerButton!");
        }
        else if(e.getSource() == hotdogButton){
            System.out.println("HotDogButton!");
        }

    }
}
