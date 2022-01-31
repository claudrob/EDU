package my.edu.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class MyFrame extends JFrame {

    MyFrame(){


        ImageIcon image = new ImageIcon("MyImage.png");

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        JLabel label = new JLabel();
        label.setText("Claud - Do your code!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label.setIconTextGap(-25);
        label.setOpaque(true);
        label.setSize(300,300);
        label.setBorder(border);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(0,0,1000,750);



        //        JFrame frame = new JFrame();
        this.setTitle("My JFrame Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,1000);
//        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
//        ImageIcon image = new ImageIcon("logo.png");
//        this.setIconImage(image);
        this.getContentPane().setBackground(Color.GREEN);
        this.getContentPane().setBackground(new Color(0x123456));
        this.add(label);

        this.pack();
    }
}
