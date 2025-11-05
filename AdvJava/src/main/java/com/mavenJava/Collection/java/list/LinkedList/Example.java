package com.mavenJava.Collection.java.list.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {


//java.util.Iterable interface-> Collection -> Arraylist, LinkedList, HashSet, TreeSet, etc.
        //LinkedList is a class that implements the List interface and extends the AbstractList class.
        //It is a part of the Java Collections Framework and is found in the java.util package.
        //LinkedList is a doubly linked list implementation of the List and Deque interfaces.
        //It allows for efficient insertion and deletion of elements at both ends of the list as well as in the middle.
        //Each element in a LinkedList is stored in a node that contains a reference to the previous and next nodes in the list.
        //This allows for efficient traversal of the list in both directions.

        //Some key features of LinkedList include:
        //Dynamic Size: LinkedList can grow and shrink dynamically as elements are added or removed.
        //Efficient Insertions/Deletions: Inserting or deleting elements at the beginning or end of the list is O(1) operation.
        //However, accessing elements by index is O(n) operation since it requires traversal from the head or tail.
        //Implements List and Deque Interfaces: LinkedList implements both List and Deque interfaces, allowing it to be used as a list or a double-ended queue.
        //Allows Duplicate Elements: LinkedList allows duplicate elements to be stored in the list.

        //Here is an example of how to use LinkedList in Java:

        List<String> list = new LinkedList<>();
        // this is syntax for creating a LinkedList in java where it uses genrics to specify the type of elements it will hold.

        // linkedList is the name of the LinkedList object being created.
        // linkedlist have many methods to manipulate the list like add, remove, get, size, etc.

        //list to add
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("LinkedList: " + list);//  we can use this or

        list.forEach(System.out::println);// this is another way to print the list using forEach method and method reference.
        System.out.println("Size of LinkedList: " + list.size());
        for( String s : list) {
            System.out.println(s);
        }

        // Acessing elements
        // .get() method is used to access the element at the specified index.

        System.out.println("First Element: " + list.getFirst()); // get method is used to access the element at the specified index.

        System.out.println("Last Element: " + list.getLast());
        // we can also use .peek() method to access the first element of the list without removing it.
        System.out.println("First Element using peek(): " + ((LinkedList<String>) list).peek());
        // we can also use .peekLast() method to access the last element of the list without removing it.
        System.out.println("Last Element using peekLast(): " + ((LinkedList<String>) list).peekLast());
        //we have casted the list to LinkedList to use the methods of LinkedList class.

        // Modifying elements
        list.set(1, "D"); // set method is used to modify the element at the specified index.



        //Removing elements
        list.remove("B");//if it is blank it will remove the first element
        System.out.println("LinkedList after removing B: " + list);
        list.removeLast();// it will remove the last element
    }

}