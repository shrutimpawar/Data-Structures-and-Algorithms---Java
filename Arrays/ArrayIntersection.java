package Arrays;

import java.util.*;

public class ArrayIntersection {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Arrays size : ");
        int size = sc.nextInt();


        int arr1[] = new int[size];
        System.out.println("Enter Elements of Array 1 : ");
        for(int i = 0 ;i< size;i++){

            arr1[i] = sc.nextInt();

        }

        int arr2[] = new int[size];
        System.out.println("Enter Elemets of Array 2 : ");
        for(int i=0;i< size;i++){

            arr2[i] = sc.nextInt();

        }

        System.out.println("IntersectingElements are : ");
        for(int i = 0; i< size;i++){

            for(int j = 0;j < size;j++){

                if(arr1[i] == arr2[j]){

                    System.out.print(arr1[i] + " ");
                    break;  // to avoid repetation

                }
            }
        }

        sc.close();
    }
    
}
