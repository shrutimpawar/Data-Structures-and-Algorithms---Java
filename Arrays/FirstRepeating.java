package Arrays;

import java.util.*;

public class FirstRepeating {

    public static int findFirstRepeating(int[] nums){

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : nums){

            freq.put(num,freq.getOrDefault(num,0) + 1);

        }

        for(int i : nums){

            if(freq.get(i) > 1){

                return i;
            }
        }

        return -1;
    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Array Elements : ");
        for(int i = 0; i< size;i++){

            arr[i] = sc.nextInt();

        }


        int ans = findFirstRepeating(arr);
        System.out.println("First Repeating Elements : "+ans); 

    }
    
}


