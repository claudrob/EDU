package my.edu.corejava;

import javax.swing.JOptionPane;


public class GUIExample {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(
                JOptionPane.showInputDialog("What is your height?")
        );
        JOptionPane.showMessageDialog(null, "Your are " + height + " cms tall.");

    }

}
