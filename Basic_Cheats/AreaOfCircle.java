package Basic_Cheats;

import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        double a = 3.14 * r*r;
        System.out.println("Area of Circle is: "+a);
    }
}
