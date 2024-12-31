import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class AddNum extends JFrame implements ActionListener{
    JTextField text,text1,sum;
    JButton btn;
    AddNum(){
        setTitle("Sum of two numbers");
        setLayout(new FlowLayout());
        text=new JTextField(10);
        add(text);
        text1=new JTextField(10);
        add(text1);
        sum=new JTextField(10);
        sum.setEditable(false);
        add(sum);
        btn=new JButton("Sum");
        add(btn);
        this.setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        btn.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        int a=Integer.parseInt(text.getText());
        int b=Integer.parseInt(text1.getText());
        int c=a+b;
        if(ae.getSource()==btn){
            sum.setText(String.valueOf(c));
        }
    }
    public static void main(String[] args) {
        AddNum st=new AddNum();
    }
}

