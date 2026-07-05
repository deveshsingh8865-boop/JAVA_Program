package Map;
import java.util.HashSet;
public class ten {
    public static int findMissing (int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {3,2,5};
        System.out.println("Missing Element is = "+findMissing(a));
    }
}
