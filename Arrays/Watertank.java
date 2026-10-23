// Problem: Water Tank Monitoring
// Difficulty: Medium
// Language: Java 8
// Problem Statement
// A city is designing a water storage system using n vertical barriers. Each barrier has a height represented by an integer array heights, where heights[i] is the height of the i-th barrier.

// You must select two barriers that, together with the ground, form a container capable of holding water.

// The amount of water the container can hold depends on:
// - Width: The distance between the two selected barriers.
// - Height: The height of the shorter barrier.
// Your task is to find the maximum amount of water that can be stored between any two barriers.
// Input Format
// - An integer n, representing the number of barriers.
// - An array heights of n integers, representing the height of each barrier.
// Output Format
// Return a single integer representing the maximum amount of water that can be stored.
// Constraints
// - \(2 \le n \le 10^5\)
// - \(0 \le heights[i] \le 10^4\)
// Example 1
// Input
// heights = [1, 8, 6, 2, 5, 4, 8, 3, 7]


// Output
// 49

package Arrays;
import java.util.*;
public class Watertank {

    public static int maxWater(int[] heights) {

        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while(left < right){

            int minHeight = Math.min(heights[left],heights[right]);

            int width = right - left;

            int area = minHeight * width;

            maxArea = Math.max(area,maxArea);

            if(heights[left] < heights[right]){

                left ++;

            }else{

                right --;
            }

        }

        return maxArea;
    }

    
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of heights:");
    int n = sc.nextInt();

    int[] heights = new int[n];

    System.out.println("Enter the heights:");
    for (int i = 0; i < n; i++) {
        heights[i] = sc.nextInt();
    }

    int result = maxWater(heights);

    System.out.println("Maximum water area = " + result);

    sc.close();
}

    
}
