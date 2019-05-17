package Chess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class IconDrag extends JLabel implements MouseListener, MouseMotionListener {

    ImageIcon icon;

    //constructor
    public IconDrag(ImageIcon icon){
    this.setIcon(icon);

    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println(mouseEvent.getSource());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
//        System.out.println("press");
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent){

        this.setLocation(mouseEvent.getXOnScreen(),mouseEvent.getYOnScreen());
//        System.out.println(mouseEvent.getX()+","+mouseEvent.getY());
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
