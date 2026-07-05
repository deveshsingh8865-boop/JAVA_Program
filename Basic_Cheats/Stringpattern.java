package Basic_Cheats;

import java.util.Scanner;

public class Stringpattern {
    public static int countoccur(String text, String pattern){
        int count =0, j;


        for(int i=0;i<text.length() - pattern.length();i++){
            for(j=0;j<pattern.length();j++){
                if(text.charAt(i+j)  != pattern.charAt(j)){
                    break;
                }
            }
            if(j == pattern.length()){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "hello yr hello buddy, hello babu, hello everyone";
        String pattern = "hello";

        int result = countoccur(text, pattern);
        System.out.println(text);
        System.out.println(pattern);
        System.out.println(result);
    }
}
