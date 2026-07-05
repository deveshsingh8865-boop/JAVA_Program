import java.util.Scanner;

public class cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
        int person = sc.nextInt();
        int total =0;

        for(int i=1;i<=person;i++){
            int age = sc.nextInt();
            if(age<12){
                total = total + 100;
            }
            else if(age>=12 && age<=60){
                total = total +200;
            }
            else{
                total = total + 120;

            }
        }
        System.out.println(total);

    }
}

