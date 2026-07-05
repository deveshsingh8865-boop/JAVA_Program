public class array {
    public static void show(int a[]){

        for(int i:a)
            System.out.println(i);
    }
    public static void change(int a[]){
        for(int i=0;i<4;i++){
            if(a[i]%7==0)
                a[i]*=7;
            else
                a[i]-=7;

        }
    }

    public static void main(String[] args) {
        int a[] = {100,70,300,350};
        System.out.println("Before Update ");
        show(a);
        change(a);
        System.out.println("After Update");
        show(a);
    }
}
