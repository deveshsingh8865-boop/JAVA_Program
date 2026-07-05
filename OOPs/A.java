package OOPs;

interface A{
    public void show();
}
interface B{
    public void show1();
}
interface C{
    public void show2();
}
interface D{
    public void show3();
}
class E implements A ,B,C,D{
    public void show(){
        System.out.println("within A");
    }
    public void show1(){
        System.out.println("Within B");
    }
    public void show2(){
        System.out.println("C");
    }
    public void show3(){
        System.out.println("D");
    }
    public void display(){
        System.out.println("All interface are in E class! ");
    }

    public static void main(String[] args) {
        E e = new E();
        e.show();
        e.show1();
        e.show2();
        e.show3();
        e.display();
    }
}