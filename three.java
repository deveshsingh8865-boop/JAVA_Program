import java.util.Scanner;


public class three {
    public static void main(String[] args) {
        int a , originalnum, reverse  = 0, remainder;
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter the plaindrome number: ");
        a = hi.nextInt();

        originalnum = a;

        while(a!=0){
            remainder = a%10;
            reverse = reverse * 10 + remainder;
            a = a/10;
        }

        if(originalnum == reverse) {
            System.out.println("The number"+originalnum+" is palindrome!!");
        }
        else{
            System.out.println("The number"+originalnum+" is not a palindrome number!, okay. So try another number.");
        }
    }
}
