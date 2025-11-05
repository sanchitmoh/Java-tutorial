package Sortings.Bubble;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // we will take input array from user
        //intialize the array
        int[] arr={64, 34, 25, 12, 22, 11, 90};
        //  arr=new int[]{64, 34, 25, 12, 22, 11, 90};
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the size of the array:");
       // int size = sc.nextInt();
      //  arr = new int[size];
        // create the array
      //  System.out.println("Enter the elements of the array:");
      //  for (int i = 0; i < size; i++) {
          //  arr[i] = sc.nextInt();
      //  }





        System.out.println("Unsorted array:");

        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

        Bubble.bubble(arr);
        System.out.println("Sorted array:");
        for(int num:arr){
            System.out.print(num+" ");
        }

        System.out.println("The array is sorted using Bubble Sort Algorithm");

         int result =BinarySearch.binary(arr,22);
         if (result == -1) {
             System.out.println("Element not found in the array");
         } else {
             System.out.println("Element found at index: " + result);
         }


    }
}
