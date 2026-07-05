//package GUI;
//import java.awt.GridLayout;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.awt.event.*;
//
//public abstract class MCAMath implements ItemListener {
//    Frame f;
//    Checkbox r1, r2;
//    TextArea a;
//    CheckboxGroup g;
//
//    public MCAMath(){
//        JFrame f = new JFrame("My Frame!");
//        f.setSize(400,400);
//        g = new CheckboxGroup();
//        r1 = new Checkbox("Male", g,true);
//        r2 = new Checkbox("Female,g , false");
//        r1.addItemListener(this);
//        r2.addItemListener(this);
//        a = new TextArea(3,30);
//        f.setLayout((new GridLayout(3,1)));
//        f.add(r1);
//        f.add(r2);
//        f.add(a);
//        f.setVisible(true);
//    }
//    public void itemStateChanged(ItemEvent e){
//        if(e.getStateChange()== Item)
//    }
//
//    public static void main(String[] args) {
//        new MCAMath();
//    }
//}
