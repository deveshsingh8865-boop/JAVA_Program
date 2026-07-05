package Map;
import java.util.HashSet;
public class nine {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = {2,5,4,8,9,5,4,1};
        for(int num : a){
            if(set.contains(num)){
                System.out.println("True");
                break;
            }
            else{
                set.add(num);
            }
        }
    }
}
