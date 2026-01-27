import java.util.Scanner;

public class forteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        int i, fact=1;
        if(num<0){
            System.out.println("Factorial is not possible in this condition:");
        }else{
            for(i=1;i<=num;i++){
                fact = fact*i;
            }
            System.out.println(fact);
        }
    }
    
}
