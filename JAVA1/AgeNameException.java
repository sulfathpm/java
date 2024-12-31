import java.util.*;

 class AgeNotWithinRangeExcepton extends Exception{
    private int a;
    AgeNotWithinRangeExcepton(int b){
        a=b;
    }
    public String toString(){
        return " You've entered an age limit not within the range of 15 and 21  : "+a;
    }
}
  class NameNotValidException extends Exception{
    private String a;
    NameNotValidException(String b){
        a=b;
    }
    public String toString(){
         return " You've entered invalid name "+a;
    }
}
public class AgeNameException {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       try{
            System.out.println("Enter name : ");
            String name=s.nextLine();
            if(!name.matches("[a-zA-z\\s]+")){
                System.out.println("Trying for an exception...");
                throw new NameNotValidException(name);
            }else{
                System.out.println("No exception.");
                System.out.println("Name entereed : "+name);
            }
            System.out.println("Enter Age : ");
            int age=s.nextInt();
            if(age<15 || age>21){
                System.out.println("trying for an exception...");
                throw new AgeNotWithinRangeExcepton(age);
            }else{
                System.out.println("No exception.");
                System.out.println("The age given is  : "+age);
            }
        }catch(NameNotValidException | AgeNotWithinRangeExcepton  e){
            System.out.println(e);
        }finally{
            s.close();
        }
    }
}
