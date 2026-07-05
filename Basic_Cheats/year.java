package Basic_Cheats;

import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        int a = hi.nextInt();
        if(a % 4 == 0) {
            System.out.println("that year is leap year!!");
        }
        else{
            System.out.println("Yrr ye leap year nhi hai!!");
        }
    }
}

