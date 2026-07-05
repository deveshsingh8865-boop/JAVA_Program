public class transaction {
    public static void main(String[] args) {
        int a[] = {1000,-200,300,-500,700,-100};
        int i;
        int max = a[0];
        int sum = 0;
        for(i=0;i<a.length;i++){
            sum = sum + a[i];
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
