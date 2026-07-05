public class Addition {
    int one;
    int two;
    float a;
    float b;
    double first;
    double second;

    Addition(int one, int two){
        this.one = one;
        this.two = two;
    }

    Addition(double first, double second){
        this.first = first;
        this.second= second;
    }
     public Addition(float a, float b){
        this.a =a;
        this.b = b;
    }

    public void show(){
        System.out.println(one+" "+two);
    }
    public void show1() {
        System.out.println(a+"  "+b);
    }
    public void show2() {
        System.out.println(first+"      "+second );
    }

    public static void main(String[] args) {
        Addition addint = new Addition(54,45);
        int ll =  addint.one + addint.two;
        System.out.println("The Addition of integers is:"+ll);
        Addition addfloat = new Addition(12.26f,45.2f);
        float aa = addfloat.a + addfloat.b;
        System.out.println("The Addition of float is:"+aa);
        Addition adddouble = new Addition(12.54 , 968.22);
        double tt = adddouble.first + adddouble.second;
        System.out.println("The Addition of two double value is:"+tt);
    }
}