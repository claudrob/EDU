package my.edu.swing;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {

    public static void main(String [] args){
        String appleStr = JOptionPane.showInputDialog(null, "Enter the number of apples");
        int apples = Integer.parseInt(appleStr);

        String orangeStr = JOptionPane.showInputDialog(null, "Enter the number of oranges: ");
        int oranges = Integer.parseInt(orangeStr);

        int totalFruit = apples + oranges;
        JOptionPane.showMessageDialog(null, "The total number of fruits: " + totalFruit);

        System.exit(0);
    }


}
