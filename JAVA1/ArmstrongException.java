import java.util.*;

 class ArmstrongExp extends Exception{
    private int a;
    ArmstrongExp(int b){
        a=b;
    }
    public String toString(){
        return "You've entered an armstrong number "+a;
    }

}
 class ArmstrongException {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
   
    System.out.print("Enter the limit : ");
    int k=s.nextInt();
    for(int i=0;i<k;i++){
    System.out.println("Enter the number : ");
    int n=s.nextInt();
    int sum=0;

    int x=n;
    while(n>0){
        int d=n%10;
        sum+=d*d*d;
        n=n/10;
    }
        try{
            if(sum==x){
                System.out.println("Trying for an exception...");
                throw new ArmstrongExp(x);
            }else{
                System.out.println("No exception.");
                System.out.println("the number is  : "+x);
            }
        }catch(ArmstrongExp ae){
            System.out.println("Exception : "+ae);
        }
    
    }

 }
    
}
