import java.util.*;
abstract class Figure {
    int length,breadth,height;
    abstract void area();
    void Measure(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    void dispMeasure(){
        System.out.println("Length : "+length+"\nBreadth : "+breadth+"\nHeight : "+height);
    }
}
class Triangle extends Figure {
    void area(){
        System.out.println("Area of Triangle : "+ (0.5*breadth*height));
    }  
}

class Rectangle extends Figure {
    void area(){
        System.out.println("Area of Rectangle : "+(length*breadth));
    }
    
}
public class Fig {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.Measure(4, 5, 0);
        r.dispMeasure();
        r.area();
        Triangle t=new Triangle();
        t.Measure(10, 0, 3);
        t.dispMeasure();
        t.area();
    }
    
}