public class zz {
    int a;
    String b;
     zz(int a,  String b){
         this.a = a;
         this.b = b;

     }

     public void show(){
         System.out.println(a);
         System.out.println(b);
     }

    public static void main(String[] args) {
        zz a= new zz(45, "vty");
        a.show();
    }
}
