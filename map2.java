package Map;
import java.util.HashMap;
public class map2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",12);
        map.put("C",14);
        map.put("D",16);
        map.put("E",18);

        System.out.println(map);
        map.put("A",100);
        map.put("B",25);
        System.out.println(map);
    }
}
