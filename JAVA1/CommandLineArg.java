import java.util.*;

 class NoArgumentException extends Exception{
    public NoArgumentException(String msg){
        super(msg);
    }
}
public class CommandLineArg {
    public static void main(String[] args) {
        try{
            if(args.length==0){
                System.out.println("Trying for an exception");
                throw new NoArgumentException("No command line argument provided");
            }else{
                System.out.println("command line argument: ");
                for(String ar: args){
                    System.out.println(ar);
                }
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
    
}
