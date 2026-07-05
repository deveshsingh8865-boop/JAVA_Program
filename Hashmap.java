package Map;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //insertion

        map.put("India",130);
        map.put("USA",40);
        map.put("China",160);
        map.put("Russia",130);

        System.out.println(map);
        map.put("India",150);
        System.out.println(map);

        // search
//        if(map.containsKey("SriLanka")){
//            System.out.println("Present in the list");
//        }
//        else{
//            System.out.println("not present in the list");
//        }
//        System.out.println(map.get("China")); // key exist
//        System.out.println(map.get("Indonesia")); // Key is not exist

//        for(Map.Entry<String, Integer> e :  map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        Set<String>keys = map.keySet();
//        for(String key : keys){
//            System.out.println(key + " "+map.get(key));
//        }


    }
}
