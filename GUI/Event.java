package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.ref.Cleaner;

public class Event {
    public static void main(String[] args) {
        JFrame f = new JFrame("My second application");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(9,1));
        f.setSize(400,400);
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JTextField t3 = new JTextField(10);
        JButton b1 = new JButton("Add");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int c = Integer.parseInt(t2.getText());
                int d = a+c;
                t3.setText(" "+d);
            }
        });
        JButton b2 = new JButton("Sub");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int c = Integer.parseInt(t2.getText());
                int d = a-c;
                t3.setText(" "+d);
            }
        });
        JButton b3 = new JButton("Multiply");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int c = Integer.parseInt(t2.getText());
                int d = a*c;
                t3.setText(" "+d);
            }
        });
        JButton b4 = new JButton("Divide");
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int c = Integer.parseInt(t2.getText());
                int d = a/c;
                t3.setText(" "+d);
            }
        });
        JButton b5 = new JButton("Clear");
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t3.setText("");
            }
        });
        JButton b6 = new JButton("Exit");
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        t3.setEditable(false);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(t3);

        f.setVisible(true);
    }
}
