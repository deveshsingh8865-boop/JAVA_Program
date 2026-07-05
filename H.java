public class H extends Thread{
    int n;
    public H(int n){
        this.n = n;
    }
    public void run(){
        try{
            for(int i=1;i<=100;i++){
                if(i%7==0){
                    System.out.println("number series ="+i);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception Arise!");
        }
    }
}
class H1 extends Thread{
    int n;
    public H1(int n){
        this.n = n;
    }
    public void run(){
        try{
            for(int i=1;i<=50;i++){
                if(i%5==0){
                    System.out.println("A no. series = "+i);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception Arise!");
        }
    }
}
class H2 extends Thread{
    int n;
    public H2(int n){
        this.n =n;
    }
    public void run(){
        for(int i=1;i<=this.n;i++){
            int digit = this.n % 10;

        }
    }
}
