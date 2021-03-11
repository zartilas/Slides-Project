package com.company.slide21;

public class Slide21 {

    public void slide21(){
        // creating an Integer Object
        Integer number = Integer.valueOf(10);

        // unboxing the Object
        int unboxingNum = number;

        System.out.println("Value of Number 1 (object number):" + number);
        System.out.println("Value of Number 2 (unboxing the object number):" + unboxingNum);

        //Autoboxing of char
        Character A = 'a';
        System.out.println("Value of A (autoboxing of char):" +A);
    }
}
