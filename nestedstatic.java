public class nestedstatic {
    static String correctuser = "Admin";
    static String correctpass = "12345";

    static class validator{
        static void validate(String user, String pass){
            if(user.equals(correctuser) && pass.equals(correctpass)){
                System.out.println("Login Successfully!");
            }
            else{
                System.out.println("Invalid username or password!");
            }

        }
    }

    public static void main(String[] args) {
        nestedstatic.validator.validate("Admin","19845");
    }
}
