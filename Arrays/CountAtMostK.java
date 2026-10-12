package Arrays;

import java.util.*;

public class CountAtMostK {

    static long getCountAtMostK(int[] arr,int k){

        long count = 0;
        int start = 0;

        if(k < 0){
            return 0;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int end = 0;end < arr.length;end++){

            map.put(arr[end],map.getOrDefault(arr[end],0)+1);

            while(map.size() > k){

                map.put(arr[start],map.get(arr[start]) - 1);

                if(map.get(arr[start]) == 0){
                    map.remove(arr[start]);
                }

                start ++;
            }
            count += end -start + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < size;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter No of Distinct Values: ");
        int k = sc.nextInt();

        long ans =  getCountAtMostK(arr, k);
        System.out.println("Count of At Most K distinct values: "+ ans);

        sc.close();
    }
    
}
