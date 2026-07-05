package Map;
import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);
        //Search contains
//        if (set.contains(1)) {
//            System.out.println("Set Contains!");
//        }
//        if(!set.contains(6)){
//            System.out.println("Does not contains!");
//        }
//
//        // delete
//        set.remove(2);
//        if(!set.contains(2)){
//            System.out.println("Does not contain 2 - we delete 2");
//        }
        // size
        System.out.println("Size of set is : "+set.size());

        //Print all elements
        System.out.println(set);
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
