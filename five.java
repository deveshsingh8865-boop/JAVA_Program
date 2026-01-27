import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = hi.nextInt();

        if(num%2 == 0) {
            System.out.println(num+" The number is even");
        }
        else{
            System.out.println(num+" The number is odd!");
        }
    }
    
}
