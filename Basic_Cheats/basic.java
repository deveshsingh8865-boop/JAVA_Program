package Basic_Cheats;

public class basic {
    public static void main(String[] args) {
        int i,j;
        for( i = 1;i <= 5;i++) {
            for( j = 5 ;j >= i;j--){
                System.out.print("-");
            }
            for(int k =1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
