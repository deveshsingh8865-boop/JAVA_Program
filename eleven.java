import java.util.Scanner;

public class eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divisor: ");
        int a = sc.nextInt();
        System.out.println("Enter the divider:");
        int b = sc.nextInt();

        int hcf = 1, i;
        int limit;
        int LCM ;
        if(a<b){
            limit = a;
        }else{
            limit = b;
        }

        for(i=1; i<=limit;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
            
        }
        
        LCM = (a * b) / hcf;
        System.out.println("HCF ="+ hcf);
        System.out.println("LCM = "+LCM);
    }
}
