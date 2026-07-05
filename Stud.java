public class Stud {
    static int count = 0;
    String name;

    Stud(String name){
        this.name = name;
        count++;
    }
    void display() {
        System.out.println("Name: "+ name);
        System.out.println("count: "+ count );
        System.out.println();
    }

    public static void main(String[] args) {
        Stud s1 = new Stud("Rahul");
        Stud s2 = new Stud("Devesh");
        Stud s3 = new Stud("Amit");
        Stud s4 = new Stud("Ashish");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
