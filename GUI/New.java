package GUI;

import javax.swing.*;
import java.awt.*;

public class New {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first application");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3,1));
        f.setSize(400,400);
        JTextField t = new JTextField(10);
        JPasswordField p = new JPasswordField(10);
        JTextArea ta = new JTextArea(3,1);
        JScrollPane g = new JScrollPane(ta);
        f.add(t);
        f.add(p);
        f.add(ta);
        f.setVisible(true);
    }
}
