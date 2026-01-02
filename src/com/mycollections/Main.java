/**
 *  Java program to iterate elements of PriorityQueue.
 */

package com.mycollections;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a PriorityQueue instance.
        PriorityQueue<String> myQueue = new PriorityQueue<>();

        // Adding elements to myQueue
        myQueue.add("Snowman");
        myQueue.add("Santa");
        myQueue.add("St. Nickolaus");
        myQueue.add("Spiderman");
        myQueue.add("Batman");

        // Creating iterator of the myQueue.
        Iterator iterator = myQueue.iterator();

        // Iterating through the all elements of the myQueue
        while (iterator.hasNext()) {

            // Printing element of myQueue to console
            System.out.println(iterator.next());

        }
    }
}