package Map;

import java.util.Scanner;
import java.util.HashSet;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        S = S.toLowerCase();
        for(char ch : S.toCharArray()){

            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        if(set.size() == 26){
            System.out.println("String is a Pangram");
        }
        else{
            System.out.println("String is not a Pangram");
        }

    }
}
