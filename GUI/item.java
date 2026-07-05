package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class item implements ItemListener {
    JFrame f;
    JRadioButton b1,b2;
    JTextField t;
    JPanel p;
    ButtonGroup g;
    public item(){
        f = new JFrame("Radio Button");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setLayout(new GridLayout(2,1));
        p = new JPanel(new GridLayout(1,2));
        t = new JTextField(10);
        g = new ButtonGroup();
        b1 = new JRadioButton("Male");
        b2 = new JRadioButton("Female");
        b1.addItemListener(this);
        g.add(b1);
        g.add(b2);
        p.add(b1);
        p.add(b2);
        f.add(p);
        f.add(t);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getStateChange()==ItemEvent.SELECTED){
            t.setText("Male");
        }
        if(e.getStateChange()==ItemEvent.DESELECTED){
            t.setText("Female");
        }
    }

    static void main(String[] args) {
        new item();
    }
}
