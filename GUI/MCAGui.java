package GUI;

import javax.swing.*;
import java.awt.*;

public class MCAGui {
    public static void main(String[] args) {
        JFrame f = new JFrame("My second application");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3,1));
        f.setSize(400,400);
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);
        f.add(r1);
        f.add(r2);
        JCheckBox c1 = new JCheckBox("Cricket");
        JCheckBox c2 = new JCheckBox("Sleeping");


    }
}
