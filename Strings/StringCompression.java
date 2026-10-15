package Strings;
import java.util.*;
public class StringCompression {

    public String compress(String s){

        if(s == null || s.length() == 0){
            return "";
        }

        StringBuilder result = new StringBuilder();
        int i = 0;

        while( i < s.length()){

            char ch = s.charAt(i);
            int count = 0;

            while( i < s.length() && s.charAt(i) == ch){

                count ++;
                i ++;
            }
            result.append(ch);

            if(count > 1){

                result.append(count);

            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        StringCompression c = new StringCompression();

        System.out.println("Compressed String is: "+ c.compress(str));

        sc.close();
        
    }
    
}
