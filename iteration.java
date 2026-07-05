package Map;

public class iteration {
    public static void main(String[] args) {
        int arr[] = {10,15,89,56};
        for(int i=0;i<4;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int val : arr){
            System.out.println(val);
        }
    }
}
