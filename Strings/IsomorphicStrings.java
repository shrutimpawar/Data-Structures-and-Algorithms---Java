package Strings;
import java.util.*;
public class IsomorphicStrings {

    public boolean isIsomorphic(String s,String t){

        if(s.length() != t.length()){

            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i = 0; i < s.length();i++){

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1[ch1] != 0 && map1[ch1] != ch2){

                return false;

            }

            if(map2[ch2] != 0 && map2[ch2] != ch1){

                return false;

            }

            map1[ch1] = ch2;
            map2[ch2] = ch1;

        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter String S :");
        String s = sc.nextLine();

        System.out.println("Enter String T: ");
        String t = sc.nextLine();

        IsomorphicStrings is = new IsomorphicStrings();

        System.out.println("Are Strings Isomorfic : "+is.isIsomorphic(s, t));
        sc.close();
    }
    
}
