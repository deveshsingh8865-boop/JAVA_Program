package Map;
import java.util.HashSet;
public class three {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = {1,2,3,5};
        int b[] = {5,30,9};

        for(int num : a){
            set.add(num);
        }

        boolean found = false;
        for(int num : b){
            if(set.contains(num)){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
