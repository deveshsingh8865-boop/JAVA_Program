public class zz1{
    public static String removevowels(String S){
        String result ="";
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);

            if(ch!='a' && ch!='A' && ch != 'e' && ch != 'E' && ch != 'i' && ch != 'I' && ch != 'O' && ch != 'o' && ch!='u' && ch!= 'U'){
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String S = "Devesh Singh";

        String output = removevowels(S);
        System.out.println("The String is : "+ S);
        System.out.println("After remove vowels String is: "+ output);
    }

}