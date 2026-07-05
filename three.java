package Loops;

import java.util.*;

public class three {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String S1 = sc.next();

        S = S.toLowerCase();
        S1 = S1.toLowerCase();

        for(char ch : S.toCharArray()){
            set.add(ch);
        }
        for(char ch : S1.toCharArray()){
            if(set.contains(ch)){
                System.out.println("true");
                break;
            }
            set.add(ch);
        }
        System.out.println(set);


    }
}
