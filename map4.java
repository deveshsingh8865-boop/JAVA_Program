package Map;
import java.util.*;
public class map4 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",15);
        map.put("B",30);
        map.put("C",45);
        map.put("D",60);
        Scanner sc = new Scanner(System.in);
        String key = sc.next();

        if(map.containsKey(key)){
            System.out.println("Value of "+key+" is = "+map.get(key));
        }
        else{
            System.out.println("Key is not exist in the map!");
        }
    }
}
