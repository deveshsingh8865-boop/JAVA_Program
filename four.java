import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter the armstrong number: ");
        int num = hi.nextInt();

        int originalnum = num;
        int digit;
        int sum = 0;

        while(num > 0) {
            digit = num % 10;
            sum = sum +(digit * digit * digit);
            num = num/10;

        }
        if(sum == originalnum) {
            System.out.println(sum+" That is a armstrong number!");
        }
        else{
            System.out.println(sum+ " That is not a armstrong number");
        }
    }
}
