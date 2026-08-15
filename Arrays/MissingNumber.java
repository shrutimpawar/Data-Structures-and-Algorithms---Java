package Arrays;
import java.util.*;
public class MissingNumber {

    public int missingNumbers(int nums[]){

        int xorSum = 0;

        for(int num : nums){

            xorSum = xorSum ^ num;
        }

        for(int i = 0;i <= nums.length;i++){

            xorSum = xorSum ^ i;
        }

        return xorSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range : ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter " + n + " Array Elements from 0 to " + n + " : ");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MissingNumber obj = new MissingNumber();

        int result = obj.missingNumbers(nums);

        System.out.println("Missing Number : " + result);

        sc.close();
    }
}