package Basic_Cheats;

public class vowels {
    public static String removeVowels(String S){
        String result = "";

        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch!='a' && ch!='A' && ch != 'e' && ch!= 'E' && ch!='i' && ch!='I' && ch!='o' && ch!='O' && ch!='u' && ch!='U' ){
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String S = "Hello Duniya Kesi hoo Tum!";

        String output = removeVowels(S);

        System.out.println("The original String is :"+S);
        System.out.println("After remove vowels in String than result is: "+ output);
    }
}
