public class findmissing {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            int k=0;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    k=1;
                }
            }
            if(k==0){
                return ;
            }
        }
    }
}
