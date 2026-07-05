package OOPs;

public class methover {

    void add(int a, int b){
        System.out.println((a+b));
    }
    void add(int a, int b, int c){
        System.out.println((a+b+c));
    }
    void add(double a, double b){
        System.out.println((a+b));
    }

    public static void main(String[] args) {
        methover m = new methover();
        m.add(4,5);
        m.add(12,45,78);
        m.add(45.56,58.9);

    }
}
