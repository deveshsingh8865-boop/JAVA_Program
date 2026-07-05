package Basic_Cheats;
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("-");
            }
            for(int k = i;k>= 1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
