import java.util.*;
 class LowerCase extends Thread {
    public void run(){
        try{
            for(char ch='a';ch<='z';ch++){
                System.out.println(ch);
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }finally{
            System.out.println("Lowercase letter generation completed");
        }
    }
}
 class UpperCase extends Thread {
    public void run(){
        try{
            for(char ch='A';ch<='Z';ch++){
                System.out.println("     "+ch);
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }finally{
            System.out.println("Uppercase letter generation completed");
        }
    }
}
public class LowerUpper extends Thread {
    public static void main(String ar[]){
        UpperCase uc=new UpperCase();
        LowerCase lc=new LowerCase();
        uc.start();
        lc.start();
    }
}