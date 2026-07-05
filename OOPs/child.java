package OOPs;


public class child {
    String name;
    int age;

    public void show(String name){
        System.out.println(name);
    }
    public void show(int age){
        System.out.println(age);
    }
    public void  show(String name, int age){
        System.out.println(name+" and age is = "+age);
    }
}

class right{
    public static void main(String[] args) {
        child c1 =  new child();
        c1.name = "Suryansh";
        c1.age = 29;


        child c2 = new child();
        c2 .name = "Prashant";
        c2.age = 24;

        child c3 = new child();
        c3.name = "Khalid Khan";
        c3.age = 19;

        c1.show(c1.name);
        c2.show(c2.name,c2.age);
        c3.show(c3.name, c3.age);


    }
}
