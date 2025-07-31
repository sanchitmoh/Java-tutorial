package Arrays.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMethod {
    public static void main(String[] args) {

        int []arr1=new int[5];
        int []arr2=new int[5];

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 elements for first array:");
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter 5 elements for second array:");
        for(int i=0;i<5;i++){
            arr2[i]=sc.nextInt();
        }
    //     System.out.println("Elements of first array:");
        for(int arr1Element: arr1) {
            System.out.print(arr1Element + " ");
        }
        System.out.println();
    //     System.out.println("Elements of second array:");
        for(int arr2Element: arr2) {
            System.out.print(arr2Element + " ");
        }
        //this is used to compare two arrays
        System.out.println("\nAre both arrays equal? " + (Arrays.compare(arr1, arr2)));

        // compare method returns 0 if both arrays are equal, a negative number if the first array is less than the second,
        // and a positive number if the first array is greater than the second.

        // working of compare method:
        // 1. It compares the elements of both arrays one by one.
        // 2. If it finds a pair of elements that are not equal,
        // it returns the difference between the first pair of unequal elements.
        // 3. If all elements are equal, it returns 0.


    }
}

