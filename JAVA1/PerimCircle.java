import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PerimCircle extends JFrame implements ActionListener{
    JTextField text1,text2;
    JButton btn;
    PerimCircle(){
        setTitle("Perimeter of circle : ");
        setLayout(new FlowLayout());
        text1=new JTextField(10);
        add(text1);
        text2=new JTextField(10);
        add(text2);
        text2.setEditable(false);
        btn=new JButton("Perimeter");
        add(btn);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        int a=Integer.parseInt(text1.getText());
        double b=a*2*3.14;
        if(ae.getSource()==btn){
            text2.setText(String.valueOf(b));
        }
    }
    public static void main(String[] args) {
        PerimCircle pc=new PerimCircle();
    }
}
