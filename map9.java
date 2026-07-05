package Map;
import java.util.*;
public class map9 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        S = S.toLowerCase();
        for(char ch : S.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }

}
