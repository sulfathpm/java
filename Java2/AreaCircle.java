import java.util.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class AreaCircle extends JFrame implements ActionListener{
    JTextField text1,text2;
    JButton  btn;
    AreaCircle(){
        setSize(300,300);
        setLayout(new FlowLayout());
        setTitle("Area of circle ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text1=new JTextField(10);
        add(text1);
        text2=new JTextField(10);
        add(text2);
        text2.setEditable(false);
        btn=new JButton("Area");
        add(btn);
        setVisible(true);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        int a=Integer.parseInt(text1.getText());
        double b=a*3.14*a;
        if(ae.getSource()==btn){
            text2.setText(String.valueOf(b));
        }
    }
    public static void main(String[] args) {
        new AreaCircle();
    }
}
