package OOPs;

public class Constructor {
    int id;
    String name;
    Constructor (){
        id= 0;
        name = "Unknown";
    }
    Constructor(int id){
        this.id = id;
    }

    Constructor(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Id of student is: "+id);
        System.out.println("Name of student is: "+name);
    }

    public static void main(String[] args) {
        Constructor C1 = new Constructor();
        Constructor C2 = new Constructor(100);
        Constructor C3 = new Constructor(1001, "Devesh Singh");
        C1.display();
        C2.display();
        C3.display();


    }
}
