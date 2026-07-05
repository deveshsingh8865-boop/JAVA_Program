import java.util.Scanner;

public class matrix1 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);
        int[][] matrix= new int[3][3];

        int[] row = new int[3];
        int[] column = new int[3];

        System.out.println("Enter the 9 Element: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = hi.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(row[i]==1 );
            }
        }
    }
}
