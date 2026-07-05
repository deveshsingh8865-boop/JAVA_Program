package OOPs;

public class Mobile {
    String name;
    int Price;

    public void details(){
        System.out.println("Mobiles are costly:");
    }

    public void show(){
        System.out.println(this.name = name);
        System.out.println(this.Price = Price);
    }
}
class Android {
    public static void main(String[] args) {
        Mobile M1 = new Mobile();
        M1.name = "Samsung";
        M1.Price = 59000;

        Mobile M2 = new Mobile();
        M2.name = "I phone";
        M2.Price = 79000;

        M1.show();
        M2.show();
    }
}
