package my.edu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserPanel extends JFrame  implements ActionListener {

    private JButton button;
    private JLabel label;

    public ColorChooserPanel(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("Some text");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        this.add(button);
        this.add(label);


        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == button){

            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.BLACK);
//            label.setForeground(color);
            label.setBackground(color);
        }

    }

}
