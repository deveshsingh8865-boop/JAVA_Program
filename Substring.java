package Map;
import java.util.HashSet;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int length =0;
        for(int right =0;right<S.length();right++){
            while(set.contains(S.charAt(right))){
                set.remove(S.charAt(left));
                left++;
            }
            set.add(S.charAt(right));
            length = Math.max(length, right - left +1);
        }
        System.out.println(length);
    }
}
