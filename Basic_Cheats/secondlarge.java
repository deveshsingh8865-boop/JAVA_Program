package Basic_Cheats;

public class secondlarge {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int l =a[0], s=a[0];

        for(int i=0;i<5;i++){
            if(l < a[i]){
                s = l;
                l = a[i];
            }
        }
        System.out.println("Second largest number is:"+s);
    }
}
