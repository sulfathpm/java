import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;;
public class Op extends JFrame implements ActionListener{
    JTextField text1,text2,text3;
    JButton btn1,btn2,btn3,btn4;
    Op(){
        setTitle("Operations");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300,300);
        text1=new JTextField(10);
        add(text1);
        text2=new JTextField(10);
        add(text2);
        text3=new JTextField(10);
        add(text3);
        text3.setEditable(false);
        btn1=new JButton("Sum");
        add(btn1);
        btn2=new JButton("Subtract");
        add(btn2);
        btn3=new JButton("Multiply");
        add(btn3);
        btn4=new JButton("Divide");
        add(btn4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        int a=Integer.parseInt(text1.getText());
        int b=Integer.parseInt(text2.getText());
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        if(ae.getSource()==btn1){
            text3.setText(String.valueOf(c));
        }
        if(ae.getSource()==btn2){
            text3.setText(String.valueOf(d));
        }
        if(ae.getSource()==btn3){
            text3.setText(String.valueOf(e));
        }
        if(ae.getSource()==btn4){
            text3.setText(String.valueOf(f));
        }

    }
    public static void main(String[] args) {
        Op op=new Op();
    }
}
