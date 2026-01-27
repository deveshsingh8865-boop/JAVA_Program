import java.util.Scanner;

public class oneq {
    public static void main(String[] args) {

        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.print("Enter third number: ");
        c = sc.nextInt();

        // Logic to sort numbers in ascending order
        if (a <= b && a <= c) {
            if (b <= c)
                System.out.println("Ascending order: " + a + " " + b + " " + c);
            else
                System.out.println("Ascending order: " + a + " " + c + " " + b);
        }
        else if (b <= a && b <= c) {
            if (a <= c)
                System.out.println("Ascending order: " + b + " " + a + " " + c);
            else
                System.out.println("Ascending order: " + b + " " + c + " " + a);
        }
        else {
            if (a <= b)
                System.out.println("Ascending order: " + c + " " + a + " " + b);
            else
                System.out.println("Ascending order: " + c + " " + b + " " + a);
        }
    }
}
