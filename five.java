package Map;
import java.util.HashSet;
public class five {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = {1,2,3,4,5};
        int b[] = {5,4,7,8,6,2};
        HashSet<Integer> result = new HashSet<>();
        for(int num : a){
            set.add(num);
        }
        for(int num : b){

            if(set.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);

    }
}
