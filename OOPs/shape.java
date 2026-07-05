package OOPs;

public class shape {
    String color;
}
class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

class kk{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "blue";
        t1.area(8,2);

        EquilateralTriangle T1 =  new EquilateralTriangle();
        T1.color = "Purple";
        T1.area(12,6);

        Circle C = new Circle();
        C.color = "Black";
        C.area(5);
    }
}