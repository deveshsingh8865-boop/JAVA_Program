package Basic_Cheats;

public class stock {
    public static void main(String[] args) {
        int a[] = {25,10,7,5,8,11,9};
        int max= a[0];
        int min = a[0];

        for(int i=0;i<a.length;i++){

            if(min > a[i]){
                min = a[i];

            }
            if(max < a[i] ){
                max = a[i];

            }
        }
        System.out.println("Buy the stock at"+min);
        System.out.println("Sell the stock at"+max);

        int diff = max - min;
        System.out.println("The profit in stock trading  = "+diff);
    }
}
