package Strings;
import java.util.*;
public class CountWords {

    static int countWordsString(String s){


        if(s.trim().isEmpty()){

            return 0;

        }

        String parts[] = s.trim().split("\\s+");

        return parts.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        System.out.println("Word Count : "+ countWordsString(str));

        sc.close();
        
    }
    
}
