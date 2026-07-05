import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int  digit, a ;


        while(num<=1){
            count++;
            num = num /10;

        }
        while(num<=1){
            digit = num %10;
            num =  num /10;
            a = digit *(int)Math.pow(10,count);
            System.out.println(a);

        }

    }
}
