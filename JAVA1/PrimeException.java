import java.util.*;

 class UserDefExp extends Exception{
    private int a;
    UserDefExp(int x){
        a=x;
    }
    public String toString(){
        return "You've entered a prime number "+a;
    }
}
public class PrimeException {
    public static boolean isPrime(int a) {
        if (a <= 1) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int i,a,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit : ");
        n=s.nextInt();
        for(i=0;i<n;i++){
            System.out.println("Enter the numbers  : ");
            a=s.nextInt();
            try {
                if(isPrime(a)){
                    System.out.println("Trying for an exception");
                    throw new UserDefExp(a);
                }else{
                    System.out.println("No Exception. ");
                    System.out.println("The value is : "+a);
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Generated Exception "+e);
            }
        }
    }
}