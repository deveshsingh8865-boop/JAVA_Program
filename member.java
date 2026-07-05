public class member {
    static class inner {
        static int num = 452;
        static void show(){
            System.out.println("Inside static variable execeuted!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Number:"+member.inner.num);

        member.inner.show();
    }
}
