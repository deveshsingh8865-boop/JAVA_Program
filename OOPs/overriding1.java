package OOPs;

public class overriding1 extends overriding{
    public void show(){
        System.out.println("Within overriding1 show! ");
    }

    public static void main(String[] args) {
        overriding1 O = new overriding1();
        O.show();

    }

}
