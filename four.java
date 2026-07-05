package Map;
import java.util.HashSet;
public class four {
    public static void main(String[] args) {
        HashSet<Integer>  set = new HashSet<>();
        int a[] = {1,2,3};
        int b[] = {3,4,5};
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            set.add(b[j]);
        }
        System.out.println(set);
    }
}
