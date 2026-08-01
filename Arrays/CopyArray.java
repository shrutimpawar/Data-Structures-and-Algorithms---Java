package Arrays;

import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        int copy[]=new int[n];

        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            copy[i]=arr[i];
        }

        System.out.println("Copied Elements : ");
        for(int num:copy){
            System.out.print(num+" ");
        }
    }
}