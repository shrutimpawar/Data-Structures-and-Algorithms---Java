package Strings;
import java.util.*;

public class StringDuplicatesRemoval {

    String removeDuplicates(String str){

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){

            if(set.add(ch)){

                sb.append(ch);

            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();

        StringDuplicatesRemoval sdr = new StringDuplicatesRemoval();
        String ans = sdr.removeDuplicates(str);

        System.out.println("String After Removal of Duplicates : "+ans);

        sc.close();
    }
    
}
