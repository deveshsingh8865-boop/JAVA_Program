package Map;
import java.util.HashMap;
public class map3 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rahul",1);
        map.put("dev",2);
        map.put("ashish",3);

        if(map.containsKey("ashish")){
            System.out.println(map.get("ashish"));
        }
        else{
            System.out.println("Not exist");
        }
    }
}
