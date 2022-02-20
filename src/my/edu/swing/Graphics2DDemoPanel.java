package my.edu.swing;

import javax.swing.*;
import java.awt.*;

public class Graphics2DDemoPanel extends JPanel {

    public Graphics2DDemoPanel(){

        this.setPreferredSize(new Dimension(500, 500));

    }

    public void paint(Graphics graphics){

        Graphics2D g2d = (Graphics2D) graphics;

        g2d.setStroke(new BasicStroke(5));
        g2d.setPaint(Color.green);
//        g2d.drawLine(0, 0, 500, 500);

//        g2d.setPaint(Color.blue);

//        g2d.drawRect(0, 0, 100, 200);
//        g2d.fillRect(0, 0, 100, 200);
//        g2d.setColor(Color.orange);
//        g2d.drawOval(100,100,100,100);
//        g2d.setColor(Color.pink);
//        g2d.fillOval(100,100,100,100);

        g2d.setPaint(Color.red);
//        g2d.drawArc(0,0, 100, 100, 180, 180);
        g2d.fillArc(0,0, 100, 100, 0, 180);
        g2d.setPaint(Color.white);
        g2d.fillArc(0,0, 100, 100, 180, 180);

        g2d.setColor(Color.yellow);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};

//        g2d.drawPolygon(xPoints, yPoints, 3);
        g2d.fillPolygon(xPoints, yPoints, 3);

        g2d.setColor(Color.magenta);
        g2d.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2d.drawString("You are a winner", 50, 50);
    }
}
