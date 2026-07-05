package Map;
import java.util.*;
public class one {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(12);
        set.add(14);
        set.add(16);
        System.out.println(set);

//        set.add(12);
//        System.out.println(set);
//        if(set.contains(12)){
//            System.out.println("Present in the set!");
//        }
//        else{
//            System.out.println("Not Present!");
//        }
        // remove element

//        set.remove(12);
//        System.out.println(set);
        // size

//        int a = set.size();
//        System.out.println("Size of set is ="+a);
        // iterate
        for(int val : set){
            System.out.println(val);
        }
        // clear

        set.clear();
        System.out.println(set);

    }
}
