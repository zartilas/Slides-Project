package com.company.slide127;

import java.util.ArrayList;

public class Slide127 {

        public static void slide127() {
            // Creating ArrayList of type "String"
            ArrayList<String> obj = new ArrayList<String>();

            //This is how we add elements to an ArrayList
            obj.add("Alex");
            obj.add("Con");
            obj.add("Paul");
            obj.add("Estel");
            obj.add("Peter");

            // Displaying elements
            System.out.println("Original ArrayList:");
            for(String str:obj)
                System.out.println(str);

            // Add element at the specific index

            obj.add(0, "Mary");
            obj.add(1, "Justin");

            // Displaying elements
            System.out.println("ArrayList after add operation:");
            for(String str:obj)
                System.out.println(str);

            //Remove elements from ArrayList like this
            obj.remove("Peter");
            obj.remove("Paul");

            // Displaying elements
            System.out.println("ArrayList after remove operation:");
            for(String str:obj)
                System.out.println(str);

            // Edit element from ArrayList
            obj.set(2, "Tom");

            // Displaying elements
            System.out.println("ArrayList after edit operation:");
            for(String str:obj)
                System.out.println(str);


            //Remove element from the specified index
            obj.remove(1); //Removes Second element from the List

            // Displaying elements
            System.out.println("Final ArrayList:");
            for(String str:obj)
                System.out.println(str);
        }
}
