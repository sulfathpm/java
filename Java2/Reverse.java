import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Reverse extends JFrame implements ActionListener{
    JTextField txt1,txt2;
    JButton btn;
    Reverse(){
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Reverse");
        setLayout(new FlowLayout());
        txt1=new JTextField(10);
        txt2=new JTextField(10);
        add(txt1);
        add(txt2);
        txt2.setEditable(false);
        btn=new JButton("Reverse ");
        add(btn);
        setVisible(true);
        btn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        int a=Integer.parseInt(txt1.getText());
        int sum=0;
        while (a>0) {
            int d=a%10;
            sum=sum*10+d;
            a=a/10;
        }
        int b=sum;
        if(ae.getSource()==btn){
            txt2.setText(String.valueOf(b));
        }
    }
    public static void main(String[] args) {
        Reverse foo = new Reverse();
        
    }
}
