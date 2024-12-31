import java.util.*;

class MultiThree extends Thread{
    public void run(){
        System.out.println("Multiplication table of 3 : ");
        try{
            for(int i=1;i<=10;i++){
                System.out.println(3*i);
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Multiplication table 3 exection cmpltd");

        }
    }
}

class MultiFive extends Thread {
    public void run(){
        System.out.println("Multiplication table of 5 : ");
        try{
            for(int i=1;i<=10;i++){
                System.out.println(5*i);
                Thread.sleep(500);

            }
        }catch(Exception e){
            System.out.println(e.getMessage());

        }finally{
            System.out.println("Multiplication table 5 exection cmpltd");

        }
    }
}

class MultiSeven extends Thread{
    public void run(){
        System.out.println("Multiplication table of 7 : ");
        try{
            for (int i = 1; i < 10; i++) {
                System.out.println(7*i);
                Thread.sleep(500);

            }
        }catch(Exception e){
            System.out.println(e.getMessage());

        }finally{
            System.out.println("Multiplication table 7 exection cmpltd");
  
        }
    }
}
public class Multiplication {
    public static void main(String[] args) {
        
    Thread t1=new Thread(new MultiThree());
    Thread t2=new Thread(new MultiFive());
    Thread t3=new Thread(new MultiSeven());
    t1.start();
    t2.start();
    t3.start();

    }
}
