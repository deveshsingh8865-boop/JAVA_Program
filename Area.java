public class Area {
    int length;
    int breath;
    double radius;
    int side;

    Area(int length , int breath){
        this.length = length;
        this.breath = breath;
    }
    Area(double radius){
        this.radius = radius;
    }
    Area(int side){
        this.side = side;
    }
    public void show(){
        System.out.println(length+" "+breath);
    }
//    public void display() {
//        System.out.println(radius);
//
//    }
    public void showall() {
        System.out.println(radius);
        System.out.println(side);

    }

     public static void main(String[] args) {
        Area rect = new Area(13,15);
        System.out.println("The area of Rectangle is :"+rect.length * rect.breath);
        Area cir = new Area(8.0);
        System.out.println("The area of circle is "+ 3.14 * cir.radius * cir.radius);
        Area sqr = new Area(20);
        System.out.println("The area of Square is : "+sqr.side*sqr.side);
    }
}
