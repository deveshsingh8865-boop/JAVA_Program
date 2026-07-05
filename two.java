package Loops;

import java.util.HashSet;

public class two {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int a[] = {1,1,2,2};
        for(int num : a){
            set.add(num);
        }
        System.out.println("Array -->"+set);
    }
}
