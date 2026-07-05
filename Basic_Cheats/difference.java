package Basic_Cheats;

public class difference {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};

        int i,largest=0, large=a[0];

        for(i=0;i<5;i++){
            if(large < a[i]){
                large = a[i];
            }
            System.out.print("\t"+large+"\n");
            largest = large;
        }
        int smallest=0 ,s= a[0];

        for(i=0;i<5;i++){
            if(s > a[i]){
                s = a[i];
            }
            smallest = s;

        }
        int difference = 0;
        difference = largest - smallest;
        System.out.println(difference);

    }
}
