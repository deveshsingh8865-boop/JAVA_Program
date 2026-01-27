import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int  digit, rev = 0;
        while(num>0){
            digit = num%10;
            rev = digit +rev*10;
            num = num/10;
        }
        System.out.println(rev);
    }
    
}

