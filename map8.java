package Map;
import java.util.*;
public class map8 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a[] = {1,2,2,3,3,3,4,5,6,8,3,1,4};
        for(int num : a){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

    }
}
