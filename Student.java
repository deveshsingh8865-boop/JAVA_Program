public class Student {
    String name;
    int id;
    int rollno;

    Student(String name){
        this.name = name;
    }
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    Student(String name, int id, int rollno){
        this.name = name;
        this.id = id;
        this.rollno = rollno;
    }


    public static void main(String[] args) {
        Student s1 = new Student("bjhj");
        Student s2 = new Student("Devesh Singh",101);
        Student s3 = new Student("Rahul",201,50);
        Student s4 = new Student("Hello World");;
        System.out.println(s2.name+"\t"+s2.id);
        System.out.println(s3.name+"\t"+s3.id+"\t"+s3.rollno);

    }
}
