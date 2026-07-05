public class changno {
    void show() {
        System.out.println("No argument");
    }

    void show(int a){
        System.out.println("One argument:"+a);
    }

    void show(int a, int b){
        System.out.println("Two Arguments:"+a+" "+b);
    }

    public static void main(String[] args) {
        changno d = new changno();
        d.show();
        d.show(158);
        d.show(124,265);
    }
}
