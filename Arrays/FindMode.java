package Arrays;

import java.util.*;

public class FindMode {

    static void findMode(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int mode = arr[0];
        int maxCount = 0;

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > maxCount) {
                maxCount = map.get(num);
                mode = num;
            }
        }

        System.out.println("Mode = " + mode);
        System.out.println("Frequency = " + maxCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findMode(arr);

        sc.close();
    }
}