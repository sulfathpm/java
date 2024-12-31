import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;

public class NegPos extends JFrame implements ActionListener{
    JTextField text1,text2;
    JButton btn;
    NegPos(){
        setSize(300,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Negative or positive number ?");
        text1=new JTextField(10);
        add(text1);
        text2=new JTextField(10);
        add(text2);
        text2.setEditable(false);
        btn=new JButton("Check");
        add(btn);
        setVisible(true);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        int a=Integer.parseInt(text1.getText());
        if(a>=0){
             text2.setText("Postitive");
        }else{
             text2.setText("Negative");
        }
       
    }
public static void main(String[] args) {
    new NegPos();
}
}


