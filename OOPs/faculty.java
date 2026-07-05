package OOPs;

public class faculty {
    String name;
    int age;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    faculty(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
    faculty(faculty f2){
        this.name = f2.name;
        this.age = f2.age;
    }
    faculty() {

    }
}

class hi{
    public static void main(String[] args) {
        faculty f1 = new faculty();
        f1.name = "hbjd";
        f1.age = 86;

        faculty f2 = new faculty(f1);

        f2.show();
    }
}
