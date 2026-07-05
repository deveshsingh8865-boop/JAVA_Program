package Map;

import java.util.HashSet;
import java.util.Scanner;

public class happySet {
    private static int sumOfSquare(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit * digit;
            n= n/10;
        }
        return sum;
    }

    public static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n = sumOfSquare(n);
        }
        return true;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isHappy(num)){
            System.out.println(num+" Is happy number!");
        }
        else{
            System.out.println(num+" Is not happy number!");
        }

    }
}
