package Arrays;

import java.util.*;

public class AnagramGroups {

     public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // Convert string into character array
            char[] chars = str.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert sorted characters back to String
            String key = new String(chars);

            // If key is not present, create a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add original string to the group
            map.get(key).add(str);
        }

        // Return all groups
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] strs = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }

        List<List<String>> result = groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");

        for (List<String> group : result) {
            System.out.println(group);
        }

        sc.close();
    }
    
}
