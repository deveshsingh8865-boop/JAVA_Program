package Map;
import java.util.HashSet;
public class seven {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = {100,4,200,1,3,2};
        int count =0;
        for(int num : a){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if (!set.contains(num - 1)) {
                int currentNum =  num;
                count = 1;
                while(set.contains(currentNum + 1)){
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        System.out.println("Longest Sequence length = "+longest);
    }
}
