package Map;
import java.util.HashMap;
public class map6 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",100);
        map.put("B",200);
        map.put("C",300);
        map.put("D",400);
        map.put("E",500);

        System.out.println(map.size());
    }
}
