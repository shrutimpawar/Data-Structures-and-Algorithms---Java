
package Arrays;

import java.util.*;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleNumber(nums);

        System.out.println("Single Number = " + result);

        sc.close();
    }
}

