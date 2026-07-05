package Loops;

public class four {
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        int maxProfit = 0;
        int min = price[0];
        int buyDay = 0;
        int sellDay= 0;
        for(int i=1;i<price.length;i++){
            if(min > price[i]){
                min = price[i];
                buyDay = i;
            }
            int profit = price[i] - min;

            if(profit > maxProfit){
                maxProfit = profit;
                sellDay = i;
            }
        }
        System.out.println("BuyDay "+buyDay);
        System.out.println("Buy the stock at "+min);
        System.out.println("Sell Day = "+sellDay);
        System.out.println("Max Profit: "+maxProfit);
    }
}
