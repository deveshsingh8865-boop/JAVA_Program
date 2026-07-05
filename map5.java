package Map;

import java.util.*;

public class map5 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",250);
        map.put("B",500);
        map.put("C",750);
        map.put("D",1000);
        System.out.println(map);
        map.remove("A");
        System.out.println(map);
    }
}
