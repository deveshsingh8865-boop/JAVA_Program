public class Bank {
    int accno;
    String name;
    double balance;

    Bank(int accno, String name){
        this.accno = accno;
        this.name = name;
        this.balance =0;
    }
    Bank(int accno, String name, double balance){
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
    void display(){
        System.out.println(accno+ "     "+name+"     "+balance);
    }

    public static void main(String[] args) {
        Bank ob1 = new Bank(272781114,"Devesh",0);
        Bank ob2 = new Bank(123456789,"FDGDHF");
        Bank ob3 = new Bank(1245,"XYZ",999999);
        System.out.println(ob1.accno+"  "+ob1.name);
        System.out.println(ob2.accno+"  "+ob2.name+"    ");
        System.out.println(ob3.accno+"  "+ob3.name+"    "+ob3.balance);
    }

}
