public class NN extends Thread{
    int n;
    public NN(int n){
        this.n = n;
    }
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println(this.n + "X" + i + "=" + (this.n * i));
            }
        }
        catch(Exception e){
            System.out.println("Exception Arise!");
        }
    }
}
class NN1 extends Thread{
    int n;
    public NN1(int n){
        this.n = n;
    }
    public void run(){
        try{
            for(int i=1;i<=this.n;i+=2){
                System.out.println("ODD Number series = "+i);
            }
        }
        catch(Exception e){
            System.out.println("Exception Arise!");
        }
    }
}
class NN2{
    public static void main(String[] args) {
        NN ob1 = new NN(3);
        NN ob2 = new NN(7);
        NN1 ob3 = new NN1(50);
        ob1.start();
        ob2.start();
        ob3.start();
    }
}
