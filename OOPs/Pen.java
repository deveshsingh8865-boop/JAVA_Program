package OOPs;

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something:");
    }

    public void color() {
        System.out.println(this.color = color);
        System.out.println(this.type = type);
    }
}
class oops {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.color = "Red";
        p.type = "Gel Pen";

        Pen p1 = new Pen();
        p1.color = "Black";
        p1.type = "Bol Point";

        Pen p2 = new Pen();
        p2.color = "Green";
        p2.type = "Fountain Pen";

        p.color();
        p1.color();
        p2.color();
    }
}
