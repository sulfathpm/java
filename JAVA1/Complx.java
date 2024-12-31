import java.util.*;
class Complex {
    Scanner s=new Scanner(System.in);
    private double x,y;
    public Complex(){
        this.x=0;
        this.y=0;
    }
    Complex(double a,double b){
        x=a;
        y=b;
    }
    void readComplex(){
        System.out.println("Enter the real and imaginary part : ");
        x=s.nextDouble();
        y=s.nextDouble();
    }
    void dispComplex(){
        System.out.println("The complex number is  : "+x+" + i "+y);

    }
    public static Complex add(Complex c1,Complex c2){
        return new Complex(c1.x+c2.x,c1.y+c2.y);
    }
    public static Complex Product(Complex c1,Complex c2){
        double real=c1.x*c2.x-c1.y*c2.y;
        double img=c1.x*c2.y+c1.y*c2.x;
        return new Complex(real, img);
    }
}
public class Complx {
public static void main(String[] args) {
    Complex c1=new Complex();
    Complex c2=new Complex();
    System.out.println("first complex number : ");
    c1.readComplex();
    System.out.println("Second complex number : ");
    c2.readComplex();
    System.out.println("first complex number : ");
    c1.dispComplex();
    System.out.println("Second complex number : ");
    c2.dispComplex();
    System.out.println("addition of complex numbers : ");
    Complex addc=Complex.add(c1,c2);
    addc.dispComplex();
    System.out.println("Product of Complex numbers : ");
    Complex mul=Complex.Product(c1, c2);
    mul.dispComplex();
}
    
}
