package OOPs;

public class Student {
    String name;
    int id;
    int age;

    public void show(){
        System.out.println(this.name = name);
        System.out.println(this.id = id);
        System.out.println(this.age= age);
    }

}
class hello{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Devesh Singh";
        s1.id = 1001;
        s1.age = 23;

        Student s2 = new Student();
        s2.name = "Ashish";
        s2.id = 1002;
        s2.age= 23;


        s1.show();
        s2.show();
    }
}
