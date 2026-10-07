package Arrays;

import java.util.*;

public class JobAllocation {

    static boolean isPossible(int[] jobs,int k,long maxWork){

        int assignee = 1;
        long currentWork = 0;

        for(int i = 0; i< jobs.length;i++){

            if(currentWork + jobs[i] <= maxWork){

                currentWork += jobs[i];

            }else{

                assignee ++;
                if(assignee > k || jobs[i] > maxWork){

                    return false;

                }else{

                    currentWork = 0;
                    currentWork += jobs[i];
                }
            }
        }

        return true;

    }

    public int allocateJobs(int[] arr,int k,int t){

        long start = 0;
        long ans = -1;
        long sum = 0;

        for(int i = 0; i < arr.length;i++){

            sum += arr[i];
        }

        long end = sum;

        while(start <= end){

            long mid = start + (end - start)/2;

            if(isPossible(arr, k, mid)){

                ans = mid;
                end = mid - 1;

            }else{

                start = mid + 1;

            }
        }

        return (int) (ans * t);

    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter Array Elements : ");

        for(int i = 0;i <arr.length;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("Enter number of Assignees : ");
        int k = sc.nextInt();

        System.out.println("Enter Time taken : ");
        int t = sc.nextInt();

        JobAllocation obj = new JobAllocation();
        int ans = obj.allocateJobs(arr,k,t);

        System.out.println("Minimum time required to complete the task : "+ans);

        sc.close();
    }
    
}
