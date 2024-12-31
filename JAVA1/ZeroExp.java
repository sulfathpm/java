import java.util.Scanner;

class ZeroException extends Exception{
    private int a;
    ZeroException(int b){
        a=b;
    }
    public String toString(){
        return "youve enetred zero .";
    }
    
}
public class ZeroExp {
    public static void main(String[] args) {
        int a,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit : ");
        n=s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number : "); 
             a=s.nextInt();
        try{
            if(a==0){
                System.out.println("tryin for an exception");
                throw new ZeroException(a);

            }else{
                System.out.println("the number is "+a);
            }
        }catch(ZeroException ze){
            System.out.println("Exception : "+ze);
        }
    }
    }
}
