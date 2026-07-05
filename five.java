package Loops;

public class five {
    public static void main(String[] args) {
        int num[] = {0,1,0,3,12};
        int j = 0;

        for(int i=0;i<num.length;i++){
            if(num[i]!=0){
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                j++;
            }
        }
        for(int n : num){
            System.out.print(n+" ");
        }
    }
}
