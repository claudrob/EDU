package my.edu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExampleFrame extends JFrame implements ActionListener {


    private JButton button;
    private JCheckBox checkBox;

    CheckBoxExampleFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("submit");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));

        this.add(checkBox);
        this.add(button);

        this.pack();
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == button){
            System.out.println(checkBox.isSelected());

        }

    }
}
