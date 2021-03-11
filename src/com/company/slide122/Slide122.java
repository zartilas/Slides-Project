package com.company.slide122;


public class Slide122 {

    public  void slide122() {
        System.out.println("string 1: Laos");
        System.out.println("string 2: Laos");
        String string1= new String();
        string1="Laos";
        String string2 = new String();
        string2="Laos";
        if (string1== string2){
            System.out.println("strings are the same with operator ==");
        }
        if (string1.equals(string2)) {
            System.out.println("strings are the same with method equals");
        }
        System.out.println("in both cases the strings are equal but each one works differently");
    }
}
