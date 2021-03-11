package com.company.slide184;

import java.util.ArrayList;
import java.util.List;

public class Slide184 {
    public static void slide184(){

        //
        List myList = new ArrayList();
        myList.add("String");
        myList.add(10.10);
        myList.add(20);
        myList.add(false);

        String str = (String) myList.get(0);
        int number = (int) myList.get(2);
        double doubleNum = (double) myList.get(1);
        boolean bool = (boolean) myList.get(3);


    }

}
