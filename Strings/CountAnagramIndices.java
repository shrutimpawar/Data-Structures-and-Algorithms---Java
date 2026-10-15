package Strings;
import java.util.*;
public class CountAnagramIndices {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        int freq[] = new int[26];

        if(m > n){

            return result;
        }

        for(int i = 0;i < m;i++){

            freq[p.charAt(i) - 'a']++;

        }

        int start = 0;

        for(int end = 0;end < m;end ++){

            freq[s.charAt(end) - 'a'] --;
        }

        if(allZeros(freq)){

            result.add(start);
        }

        for(int end = m;end < n;end++){

            freq[s.charAt(start) - 'a']++;
            start ++;

            freq[s.charAt(end) - 'a'] --;

            if(allZeros(freq)){

                result.add(start);

            }
        }

        return result;

    }

    public static boolean allZeros(int[] freq){

        for(int count : freq){

            if(count != 0){

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String 1 :");
        String s = sc.nextLine();

        System.out.println("Enter String 2: ");
        String p = sc.nextLine();

        List<Integer> ans = findAnagrams(s,p);

        System.out.println("Indices of Anagram : "+ ans);

        sc.close();
    }

}
