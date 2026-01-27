import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        int year = hi.nextInt();
        if(year%4==0){
            System.out.println("Year is LEAP ");
        }
        else{
            System.out.println("Year is not LEAP ");
        }

    }
    
}
