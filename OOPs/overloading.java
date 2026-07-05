package OOPs;


public class overloading {
    public void show(){
        System.out.println("Within overloading class!");
    }
    public void show(String S){
        System.out.println(S);
    }

    public static void main(String[] args) {
        overloading ob = new overloading();
        ob.show();
        ob.show("Welcome!");
    }

}
