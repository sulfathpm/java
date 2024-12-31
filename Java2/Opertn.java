import java.util.Scanner;

import operations.*;
public class Opertn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Op op=new Op();
        while (true) {
            System.out.println("1.Add\n2.Subtarct\nEnter your choice.. : ");
            int ch=s.nextInt();
            switch (ch) {
                case 1: System.out.println("Enter the numbers to add : ");
                        int a=s.nextInt();
                        int b=s.nextInt();
                        System.out.println("Result : "+op.add(a,b));
                        break;
                case 2: System.out.println("Enter the numbers to Subtract : ");
                        int x=s.nextInt();
                        int y=s.nextInt();
                        System.out.println("Result : "+op.subtract(x,y));
                        break;
            
                default: System.out.println("invalid choice.Choose between 1-2 : ");
                        System.exit(0);
                         
            }
        }
    }
}
