import java.util.*;
class Strsrt{
    String[] s1;int n;
    public void ReadArr(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n=s.nextInt();
        s.nextLine();
        s1=new String[n];
        System.out.println("enter the String array elements : ");
        for(int i=0;i<n;i++){
            s1[i]=s.nextLine();
        }
    }
    public void DisplayArr(){
        System.out.println("String array elements are : ");
        for(int i=0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
    }
    public void SortArr() {
        Arrays.sort(s1); // Sorts the array in ascending order
        System.out.println("Sorted String Array is: ");
        for (String str : s1) {
            System.out.println(str);
        }
    }
}

class StringSort{
    public static void main(String ar[]){
       Strsrt ss=new Strsrt();
       ss.ReadArr();
       ss.DisplayArr();
       ss.SortArr(); 
    }
}
