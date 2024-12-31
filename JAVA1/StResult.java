import java.util.*;
interface Sports{
    void getSportMark();
    void putSportMark();
}
class Student{
    int rno;
    String name;
    void getData(int rno,String name){
        this.rno=rno;
        this.name=name;
       
    }
    void putData(){
        System.out.println("Roll no : "+rno+"\n Name : "+name);
    }
}
class Test extends Student{
    public int m1,m2;
    void getMark(int m1,int m2){
        this.m1=m1;
        this.m2=m2;
    }
    void putMark(){
        System.out.println("Mark 1 : "+m1+"\n Mark 2 : "+m2);
    }
}
class Result extends Test implements Sports{
       private int sportMark;

   public void getSportMark(){
                Scanner s=new Scanner(System.in);

        System.out.println("Enter sport mark :");
         sportMark=s.nextInt();
    }
   public void putSportMark(){
        putMark();
        System.out.println("Sport mark : "+sportMark);
        System.out.println("Total mark : "+(sportMark+m1+m2));
    }
}
public class StResult
{
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter roll no :");
        int rno=s.nextInt();
        s.nextLine(); 
        System.out.println("Enter name : ");
        String name=s.nextLine();
        System.out.println("enter mark 1 : ");
        int m1=s.nextInt();
        System.out.println("enter mark 2 : ");
        int m2=s.nextInt();
	    Result r=new Result();
        r.getData(rno,name);
        r.getMark(m1,m2);
	    r.getSportMark();
        r.putData();
        r.putSportMark();
        
	}
}
