package Chess;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class chessPiece extends JLabel implements MouseMotionListener, MouseListener {

    public chessPiece(ImageIcon icon){
        this.setIcon(icon);
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

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
    public void mouseDragged(MouseEvent mouseEvent) {

        this.setLocation(mouseEvent.getXOnScreen(),mouseEvent.getYOnScreen());

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
