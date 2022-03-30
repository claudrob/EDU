package my.edu.swing;



import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {

//        JOptionPane.showMessageDialog(null,
//                "This is some useless info",
//                "This is the Plain Message!",
//                JOptionPane.PLAIN_MESSAGE);


//        JOptionPane.showMessageDialog(null,
//                "This is some useless info",
//                "This is the Information Message!",
//                JOptionPane.INFORMATION_MESSAGE);
//
//
//        JOptionPane.showMessageDialog(null,
//                "This is some useless info",
//                "This is the title!",
//                JOptionPane.QUESTION_MESSAGE);
//
//        JOptionPane.showMessageDialog(null,
//                "This is some useless info",
//                "This is the Warning Message",
//                JOptionPane.WARNING_MESSAGE);



//        JOptionPane.showMessageDialog(null,
//                "Call Tech support now",
//                "This is the title!",
//                JOptionPane.ERROR_MESSAGE);
//

//        int x = JOptionPane.showConfirmDialog(null,
//                "Do you even code?",
//                "Coder or not",
//                JOptionPane.YES_NO_CANCEL_OPTION);

//        System.out.println("response = " + x);

//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello: " + name);

        String [] responses = {"No, you're awesome!", "Thank you!", "*blush*"};
        JOptionPane.showOptionDialog(null,
                "You are awesome!",
                "Secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                responses,
                    0);

    }

}
