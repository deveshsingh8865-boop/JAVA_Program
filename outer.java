public class outer {
    static String name = "Devesh Singh";
    static class inner{
//        static int num = 459;
        static void show() {
            System.out.println("Name :"+name);
        }
    }
    static void showouter() {
        inner.show();
    }

    public static void main(String[] args) {
        outer.showouter();
        outer.inner.show();
    }
}
