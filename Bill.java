import java.util.Scanner;
public class Bill {

    public static void main(String[] args) {
        Scanner oo = new Scanner(System.in);
        int unit = oo.nextInt();
        double bill=0;

        if(unit == 100){
            bill = unit * 5;

        }
        else if(unit <= 200){
            bill = (100*5) + (unit-100)*7;
        }
        else if(unit <= 300) {
            bill = (100*5)+(200*7)+(unit-200)*10;
        }
        else{
            bill = (100*5) + (200*7) + (300*10) +(unit-300)*15;
        }
        bill = bill +50;

        if(bill > 1000){
            bill = bill + (bill * 5/100);
        }
        System.out.println("The Electricity bill is :"+bill);
    }
}
