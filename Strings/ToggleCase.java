package Strings;
import java.sql.Savepoint;
import java.util.*;
public class ToggleCase {

    static String toggle(String s){

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);

            }else if(Character.isUpperCase(ch)){

                ch = Character.toLowerCase(ch);

            }

            sb.append (ch);
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        System.out.println("Toggled String : "+ toggle(str));

        sc.close();
        
    }
    
}
