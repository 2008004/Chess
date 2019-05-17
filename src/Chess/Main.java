package Chess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Main {

    int mouseX;
    int mouseY;


    public static void main(String args[]) {
        //main
//        ImageIcon i = new ImageIcon("C:\\Users\\2008004\\Downloads\\download.jfif");
//        IconDrag iconDrag = new IconDrag(i);
//        IconDrag iconDrag1 = new IconDrag(i);

        JFrame frame = new JFrame("test");
        GridLayout gridLayout = new GridLayout(8, 8);
        frame.setLayout(gridLayout);

//        frame.add(new JLabel("teest"));
//        iconDrag.setBorder(BorderFactory.createLineBorder(Color.BLACK));

//        frame.add(iconDrag);
//        iconDrag.addMouseListener(iconDrag);
//        iconDrag.addMouseMotionListener(iconDrag);
//        frame.addMouseMotionListener(iconDrag);

        String tileColor = "white";
        int counter = 0;
        for (int i = 0; i < 64; i++) {
            if (tileColor == "white" && counter != 8) {
                JPanel p = new JPanel();
                p.setBackground(Color.WHITE);
                p.setSize(60, 60);
                frame.add(p);
                tileColor = "black";
                counter++;
            } else if (tileColor == "white" && counter == 8) {
                JPanel p = new JPanel();
                p.setBackground(Color.BLACK);
                p.setSize(60, 60);
                frame.add(p);
                counter = 1;
            } else if (tileColor == "black" && counter != 8) {
                JPanel p = new JPanel();
                p.setBackground(Color.BLACK);
                p.setSize(60, 60);
                frame.add(p);
                tileColor = "white";
                counter++;
            } else if (tileColor == "black" && counter == 8) {
                JPanel p = new JPanel();
                p.setBackground(Color.WHITE);
                p.setSize(60, 60);
                frame.add(p);
                counter = 1;
            }
        }

        

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
