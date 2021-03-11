package com.company.slide124;

public class Slide124 {
    // Concatenates to String
    public static void concat1(String s1)
    {
        s1 = s1 + "Dog";
    }

    // Concatenates to StringBuilder
    public static void concat2(StringBuilder s2)
    {
        s2.append("IsAPet");
    }



    public static void slide124()
    {
        String animal = "Dog";
        concat1(animal);  // animal is not changed
        System.out.println("String: " + animal);

        StringBuilder animal2 = new StringBuilder("Dog");
        concat2(animal2); // animal2 is changed
        System.out.println("StringBuilder: " + animal2);

    }
}
