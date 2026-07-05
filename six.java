package Map;
import java.util.HashSet;
public class six {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = {10,5,3,4,3,5,6};
        for(int num: a){
            if(!set.contains(num)){

                System.out.println("First repeating element = "+num);

            }
//            if(!set.contains(num)){
//                System.out.println("Non Repeating element= "+num);
//                break;
//            }
            set.add(num);

        }
    }
}
