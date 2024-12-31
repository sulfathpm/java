import java.util.*;

public class OddEvenMulti extends Thread{
    public void run(){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit");
        n=s.nextInt();
        try{
            for(int i=2;i<n;){
                System.out.println(i+" ");
                i=i+2;
                Thread.sleep(500);
            }
            try{
                for(int j=1;j<n;){
                    System.out.println(j+" ");
                    j=j+2;
                    Thread.sleep(500);
                }
            }finally{
                System.out.println("Main Thread completed");
            }
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
    public static void main(String[] args) {
        OddEvenMulti oe=new OddEvenMulti();
        oe.start();
    }
}
