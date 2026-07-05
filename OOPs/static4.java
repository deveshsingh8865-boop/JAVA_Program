package OOPs;

public class static4 {
    static class inner{
        public void show(){
            System.out.println("Inner class executed ");
        }
    }

    public static void main(String[] args) {
        static4.inner a = new static4.inner();
        a.show();
    }
}
