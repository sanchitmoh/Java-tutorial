package Arrays;

public class Multidimension {
    public static void main(String[] args) {

        int [][] matrix = new int[3][4];
        // Initializing the 2D array

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=(int)(Math.random()*100);// inhave type cast the double random value to int

                // Example initialization
            }
            System.out.println();




        }
        // this is enhanced for loop to iterate through the 2D array
        // Printing the 2D array
        System.out.println("2D Array:");
        for (int[] ints : matrix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();



        }
        System.out.println("Using enhanced for loop to print the 2D array:");
        for(int[] row: matrix){
            for(int element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

// drawback of the array are:-
// 1. Fixed Size: Arrays have a fixed size, which means you cannot change the size of an array after it is created.
// This can lead to wasted memory if the array is larger than needed or insufficient space if it is too small.
// 2. Homogeneous Data: Arrays can only store elements of the same data type, which limits their flexibility.
// 3. Inefficient Insertion/Deletion: Inserting or deleting elements in an array can be inefficient,
// as it may require shifting elements to maintain the order.
// 4. No Built-in Methods: Arrays do not have built-in methods for common operations like searching, sorting, or resizing