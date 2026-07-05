package Map;

import java.util.HashSet;

public class two {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//        int a[] = {1,2,2,3,4,4,5};
//        for(int i=0;i<a.length;i++){
//            set.add(a[i]);
//        }
//        System.out.println(set);
        HashSet<Integer> set = new HashSet<>();
        int a[] = {5,5,6,7,7,8};
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);
        int b = set.size();
        System.out.println("Size of set is = "+b);
    }
}
