package Sortings.Selection;

public class Main {
    public static void main(String[] args) {

        int[]arr={64,25,12,22,11};
        Selection selection=new Selection();
        Selection.Sort(arr);

        System.out.println("Sorted array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
