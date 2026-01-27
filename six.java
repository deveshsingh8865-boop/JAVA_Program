import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = hi.nextInt();

        boolean isPrime = true;
        if(num <= 1){
            System.out.println("num is not a prime number!");
        }

        int i, flag=0;
        for(i=2;i<=num-1;i++){
            if(num%i==0){
                flag = 1;
                break;
            }
            
        }
        if(flag == 0){
            System.out.println("Is a prime number");
        }
        else{
            System.out.println("Is not a prime number");
        }
        
    }
}