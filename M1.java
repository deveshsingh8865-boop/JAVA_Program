public class M1 extends Thread{
    int n;
    public M1(int n){
        this.n = n;
    }
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(this.n + "X" + i + "=" + (this.n * i));
            }
        }
        catch (Exception e) {
            System.out.println("Exception Arise!");
        }
    }
}
class M2 extends Thread{
    int n;
    public M2(int n){
        this.n = n;
    }
    public void run(){
        try{
            for(int i=1;i<=this.n;i+=2){
                System.out.println("ODD values = "+i);
            }
        }
        catch (Exception e){
            System.out.println("Exception Arise:");
        }
    }
}
class M3{
    public static void main(String[] args) {
        M1 ob1 = new M1(4);
        M2 ob2 = new M2(100);
        ob1.start();
        ob2.start();
    }
}
