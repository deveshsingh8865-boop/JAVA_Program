package Map;
import java.util.HashSet;
public class eight {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = {8,7,2,5,3,1};
        int target = 10;
        for(int num : a){
            set.add(num);
            int req = target - num;
            if(set.contains(req)){
                System.out.println("True");
            }
        }
    }
}
