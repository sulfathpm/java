import java.util.*;
class UserDefExp extends Exception{
    private int a;
    UserDefExp(int b){
        a=b;
    }
    public String toString(){
        return "\nYou've entered a negative number "+a;
    }
}
public class NegativeExp {
    public static void main(String[] args) {
        int a,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit : ");
        n=s.nextInt();
        for (int j = 0; j < n; j++) {
            System.out.println("Enter the number : ");
            a=s.nextInt();
            try {
                if (a<0) {
                    System.out.println("Trying for an exception");
                    throw new UserDefExp(a);
                }else{
                    System.out.println("No exception");
                    System.out.println("The number is : "+a);
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Genretaed exception "+e);
            }
        }
    }
}
