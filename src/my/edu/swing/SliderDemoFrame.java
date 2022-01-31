package my.edu.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemoFrame implements ChangeListener
{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    public SliderDemoFrame(){

        frame = new JFrame("Slider Demo");


        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420, 420);
        frame.setVisible(true);


    }

    public void stateChanged(ChangeEvent event){

    }


}
