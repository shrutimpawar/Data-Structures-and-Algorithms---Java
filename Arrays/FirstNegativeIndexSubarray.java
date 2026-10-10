package Arrays;

import java.util.*;

public class FirstNegativeIndexSubarray {

    static List<Integer> firstNegativeIndex(int[] arr,int k){

        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < arr.length;i++){

            if(arr[i] < 0){

                dq.addLast(i);

            }

            int start = i - k + 1;

            while(!dq.isEmpty() && dq.peekFirst() < start){

                dq.removeLast();

            }

            if( i >= k - 1){

                if(dq.isEmpty()){

                    ans.add(0);

                }else{

                    ans.add(arr[dq.peekFirst()]);

                }
            }
        }

        return ans;

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

        System.out.println("Enter the size of Window : ");
        int k = sc.nextInt();

        List<Integer>ans =  firstNegativeIndex(arr, k);
        System.out.println("Length of longest SubArray of given sum is : "+ ans);

        sc.close();
    }
    
}
