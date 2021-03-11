package com.company.slide133;

import java.util.ArrayList;

public class Slide133 {

    public static void slide133() {
        ArrayList<String> List= new ArrayList<>();
        List.add("basketball");
        List.add("volleyball");
        List.add("handball");
        List.add("football");
        int i = 0;
        for (String element : List){
            //you can't add and remove to list with for-each
            //List.add("swimming");
            //List.remove("basketball");
            element = "cycling";
            List.set(i,element);
            i++;
        }
        System.out.println(List);
        System.out.println("With for-each loop you can only edit something from list");

    }
}
