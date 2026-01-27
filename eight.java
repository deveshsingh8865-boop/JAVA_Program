import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner  hi = new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int num = hi.nextInt();

       int i, fact = 1;
       if(num < 0){
        System.out.println("The Factorial is not possible: ");
       }
       else{
        for(i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+"is = "+fact);
       }

    }
    
}
