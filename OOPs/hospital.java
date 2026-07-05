package OOPs;

public class hospital {
    public static void main(String[] args) {
       long totalborrow = 0;
       long totalpaid = 0;
       long dailypay = 1;

       int day;
       for(day = 1;totalpaid < totalborrow || day == 1;day++){
           totalborrow =  totalborrow + 15000;
           totalpaid = totalpaid + dailypay;

           System.out.println(day);
           System.out.println(totalborrow);
           System.out.println(totalpaid);
           System.out.println();

           dailypay = dailypay * 3;
       }
        System.out.println((day-1));
    }
}
