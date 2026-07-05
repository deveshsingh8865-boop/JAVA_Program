package Map;
import java.util.*;
public class map10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        S = S.toLowerCase();
        for(char ch : S.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        for( char ch : S.toCharArray()){
            if(map.get(ch) == 1){
                System.out.println("First Non-Repeating character ="+ch);
                return;
            }

        }
        System.out.println("No non-repeating character found!");

    }
}
