import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("ENter the number: ");
        int a = sc.nextInt();

        int i;
        for(i=1;i<=10;i++){
            System.out.println(a+"x"+i+"="+a*i);
        }
    }
    
}
