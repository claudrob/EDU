package my.edu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation2DPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 1;
    int y = 0;
    int x = 0;

    public Animation2DPanel(){

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLUE);
        enemy = new ImageIcon("enemy.png").getImage();
        backgroundImage = new ImageIcon("elephant.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();

    }


    public void paint(Graphics graphics){
       super.paint(graphics);
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.drawImage(backgroundImage, 0, 0, null);
        g2d.drawImage(enemy, x, y, null);

    }

    @Override
    public void actionPerformed(ActionEvent event){

        if(x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if(y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;




        repaint();

    }

}
