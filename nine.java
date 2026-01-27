import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter the a: ");
        int a = hi.nextInt();
        System.out.println("Enter the b: ");
        int b = hi.nextInt();

       a = a+b;
       b = a-b;
       a = a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    
}
