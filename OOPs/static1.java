package OOPs;

public class static1 {
    int id;
    String name;

    static String college = "GLA University Mathura!";

    static1(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void show(){
        System.out.println(id +"  "+name+"  "+college);
    }

    public static void main(String[] args) {
        static1 A = new static1(101, "Devesh Singh");
        static1 B = new static1(102, "Ashish Sharma");

        A.show();
        B.show();

    }

}
