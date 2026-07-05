package Basic_Cheats;

public class Constbill {
    int unit;
    double finalbill;

    Constbill(int unit){
        this.unit = unit;
        finalbill = 0;
    }
//    public void show() {
//        System.out.println("The total unit is: "+unit);
//        System.out.println("The final bill is : "+ finalbill);
//    }
    int bill =0;
    public void showbill(){
        if(unit <= 100){
           bill = unit * 3;
        }
        else if(100 < unit && unit <= 200){
            bill = (100*3)+(unit-100) * 4;
        }
        else{
            bill = unit * 5;
        }
        finalbill = bill + 300;
        System.out.println("Total unit "+ unit);
        System.out.println("Final bill is "+ finalbill);
    }

    public static void main(String[] args) {
        Constbill C = new Constbill(150);

        C.showbill();
    }
}
