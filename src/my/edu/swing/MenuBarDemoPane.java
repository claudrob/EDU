package my.edu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLOutput;

public class MenuBarDemoPane extends JFrame implements ActionListener {

    private JMenuItem loadItem;
    private JMenuItem saveItem;
    private JMenuItem exitItem;

    public MenuBarDemoPane(){



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu(("Edit"));
        JMenu helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(event.getSource() == loadItem){
            System.out.println("**load item**");

        }
        else if(event.getSource() == saveItem){
            System.out.println("**Save Item** ");
        }
        else if(event.getSource() == exitItem){
            System.out.println("** Exit Time");
            System.exit(0);

        }

    }

}
