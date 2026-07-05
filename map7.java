package Map;
import java.util.*;
public class map7 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        map.put(4,400);
        map.put(5,500);

        for(int num : map.keySet()){
            System.out.println(num+"---> "+map.get(num));
        }
    }
}
