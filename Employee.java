import java.sql.SQLOutput;

public class Employee {
    int id;
    String name;

    static int count = 0;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
        count++;
    }
    static void show() {
        System.out.println("The Number of Employes is:"+count);
    }

    public static void main(String[] args) {
        Employee E = new Employee(1,"Ram Sharma");
        Employee D = new Employee(2, "Devesh Singh");
        Employee F = new Employee(3,"Ashish Sharma");
        Employee G = new Employee(4,"Prashant Sisodiya");
        Employee H = new Employee(5, "Khalid Khan");
        Employee I = new Employee(6, "Suryansh Kumar");

        System.out.println("The Total number of employees is :"+count);

    }

}
