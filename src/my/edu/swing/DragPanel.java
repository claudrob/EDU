package my.edu.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("smile.png");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;

    public DragPanel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }

    public void paintComponent(Graphics graphics){

        super.paintComponent(graphics);
        image.paintIcon(this, graphics, (int) imageCorner.getX(), (int) imageCorner.getY());

    }

    private class ClickListener extends MouseAdapter{

        public void mousePressed(MouseEvent event){
            prevPt = event.getPoint();

        }

    }

    private class DragListener extends MouseMotionAdapter{

        public void mouseDragged(MouseEvent event){

            Point currentPT = event.getPoint();
            imageCorner.translate(
                    (int) (currentPT.getX() - prevPt.getX()),
                    (int) (currentPT.getY() - prevPt.getY())
            );
            prevPt = currentPT;
            repaint();

        }

    }

}
