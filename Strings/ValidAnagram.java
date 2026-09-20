package Strings;

import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters from first string
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Remove characters using second string
        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        System.out.println("Is Anagram: " + result);

        sc.close();
    }
}

