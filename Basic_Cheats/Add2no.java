package Basic_Cheats;

import java.util.Scanner;

public class Add2no {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first no: ");
        int a  = sc.nextInt();
        System.out.println("Enter the second no: ");
        int b = sc.nextInt();
        System.out.println("Enter the third no: ");
        int c = sc.nextInt();

        int sum = a+b+c;
        System.out.println("the Sum of these numbers: "+sum);


    }
}
