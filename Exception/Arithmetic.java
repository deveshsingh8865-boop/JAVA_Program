package Exception;

import java.util.Scanner;
class UnexpectedException extends RuntimeException {
    public UnexpectedException(String s){
        super(s);
    }
}
public class Arithmetic{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c;
        try {
            if(a == 0 && b != 0)
                throw new UnexpectedException("Number is Zero");
            else if(a != 0 && b == 0)
                throw new ArithmeticException("Denominator is zero");
            else if(a == 0 && b == 0)
                throw new ArrayIndexOutOfBoundsException("Both are zero");
            else {
                c = a / b;
                System.out.println("Division is ="+c);
            }
        }
        catch(UnexpectedException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program finished");
        }
    }
    
}
