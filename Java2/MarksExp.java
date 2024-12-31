import java.util.*;
class MarksOutOfBoundException extends Exception{
    private int marks;
    MarksOutOfBoundException(int m){
        marks=m;
    }
    public String toString(){
        return "You've entered an invalid mark "+marks;
    }
}
public class MarksExp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit");
        int n=s.nextInt();
        try{
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the mark : ");
                int marks=s.nextInt();
                if(marks<0||marks>100){
                    System.out.println("Trying for an exception...");
                    throw new MarksOutOfBoundException(marks);
                }else{
                    System.out.println("No exception.\nThe marks is : "+marks);
                }
            }
        }catch(MarksOutOfBoundException me){
            System.out.println("Exception : "+me);
        }finally{
            s.close();
        }
    }
}
