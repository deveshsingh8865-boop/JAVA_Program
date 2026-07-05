package Loops;

public class one {
    public static void main(String[] args) {

        int num [] = {2,7,11,15};
        int target = 9;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i] + num[j] == target){
                    System.out.println("Found at index: ="+"["+i+","+j+"]");
                }
            }
        }
    }
}
