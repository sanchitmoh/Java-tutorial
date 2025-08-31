package Arrays.aarayasObject;
import java.util.Arrays;
import Arrays.aarayasObject.Student;

import static javax.print.attribute.standard.MediaSizeName.A;

public class StudMain {
    public static void main(String[] args) {

        Student st= new Student("John", 101, 20);
        Student st1= new Student("Alice", 102, 22);
        Student st2= new Student("Bob", 103, 21);
        // Creating an array of Student objects
        // and initializing it with the Student objects created above
            // This array can hold 3 Student objects
        Student [] students = new Student[3];
        students[0] = st;
        students[1] = st1;
        students[2] = st2;
        // Displaying the details of each student

        for(Student student : students) {
            System.out.println("Name: " + student.name + ", Roll No: " + student.rollNo + ", Age: " + student.age);
        }
        int marks[] = new int[3];
        marks[0] = 85;
        marks[1] = 90;

        marks[2] = 78;

         Arrays.sort(marks); // Sorting the marks array
        System.out.println("Sorted Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " "); // Displaying the sorted marks array
        }


        Arrays.fill(marks, 0, 2, 100);
        System.out.println();
        System.out.println("Afterr filling ");
        for(int ma:marks){
            System.out.println(ma+" ");
            // Filling the first two elements of the marks array with 100);// Displaying the sorted marks array
        }
    }
}
