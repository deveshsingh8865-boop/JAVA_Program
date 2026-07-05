package Basic_Cheats;

public class pattern3 {
    public static void main(String[] args) {

        for(int i= 1;i<=5;i++){
            int j;
            for(j = 5;j>= i;j--){
                System.out.print("-");
            }
            int k;
            for(k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("-");
            }
            int n=5;
            for(int k=9;k>=1;k-=2){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
