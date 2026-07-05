public class new1 extends Thread{
    int n;
    public new1(int n){
        this.n = n;
    }
    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(this.n + "X" + i + "=" + (this.n * i));
            }
        }
        catch(Exception e) {
            System.out.println("exception Arise!");
        }
    }

    public static void main(String[] args) {
        new1 ob1 = new new1(6);
        new1 ob2 = new new1(4);
        new1 ob3 = new new1(55);

        ob1.start();
        ob2.start();
        ob3.start();
    }
}
