public class initialize {
    static String name;
    static int num;
    static{
        name= "DeveshSingh";
        num = 125;

        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Show the Name: "+ name);
        System.out.println("Value of num: "+ num);

    }
}
