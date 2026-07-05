import java.util.Scanner;

public class Parkingbill {
    static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.println("Enter the number of hour: ");
        int hour = hr.nextInt();
        double bill =0;

        if(hour == 24){
            System.out.println("The bill for one day is : 500");
        }
        else if(hour > 24 || hour < 1){
            System.out.println("Invalid Input!");
        }
        else if(hour <= 2){
            bill = 20 * hour;
            System.out.println("Bill for First two hours :"+bill);
        }
        else if(hour >= 3 && hour <= 5){
            bill = 40+(30 *(hour-2) );
            System.out.println("The next 3 to 5 hours bill is: "+bill);
        }
        else{
            bill = 40 + 90 + (50*(hour-5));
            System.out.println("The 5 hour above parking bill is :"+bill);
        }

    }
}
