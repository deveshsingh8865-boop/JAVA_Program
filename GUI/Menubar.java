package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menubar {
    public static void main(String[] args) {
        JFrame f = new JFrame("My second application");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3,1));
        f.setSize(600,600);
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        JButton b = new JButton("Add");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

            }
        });
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(t3);

        f.setVisible(true);

    }
}
