package Strings;
import java.util.*;
public class CountPS {

    public int psCount(String s){

        if(s == null || s.length() == 0){

            return 0;

        }

        int count = 0;

        for(int i = 0; i < s.length();i++){

            count += expand(s,i-1,i+1);
            count += expand(s,i,i+1);
        }
        return count;
    }

    public int expand(String s,int left ,int right){

        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){

            count ++;
            left --;
            right ++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        CountPS lsb = new CountPS();

        System.out.println("Palindrome length >= 2 count: "+ lsb.psCount(str));

        sc.close();
        
    }
}
