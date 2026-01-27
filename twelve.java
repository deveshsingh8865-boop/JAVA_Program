import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = hi.nextInt();

        int i,sum = 0,digit;
        for(i=0;i<=a; i++){
            digit = a%10;
            sum = sum + digit;
            a = a/10;
        }
        System.out.println(sum);
        
        
        
    }
    
}
