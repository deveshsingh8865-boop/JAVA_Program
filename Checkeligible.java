import java.util.Scanner;

public class Checkeligible{
    static void checkeligibilitiy(int marks){
        if(marks>=40){
            System.out.println("Student is ELigible ");
        }
        else{
            System.out.println("Student is not eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter the marks:");
        int m = sc.nextInt();

        Checkeligible.checkeligibilitiy(m);

    }
}