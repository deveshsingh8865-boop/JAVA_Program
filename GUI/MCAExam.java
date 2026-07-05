package GUI;
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.RED;

public class MCAExam {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first Application");

        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("Cancel");
        JButton b3 = new JButton("Submit");
        JButton b4 = new JButton("Reset");
        JButton b5 = new JButton("Clear");
        f.setCursor(Cursor.W_RESIZE_CURSOR);
        f.setBackground(Color.cyan);
        f.setLayout(new BorderLayout());
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Toh Kese Hai Aap Log!");
        f.setSize(400,400);
        f.setVisible(true);

    }
}
