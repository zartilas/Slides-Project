package com.company.slide110;

public class Slide110 {
    //the below methods are an overloading of the method print.
    //each one of them are being used for different things, but all of them have the same name.
    private static void print(){

        System.out.println("Ntampouginete Pamen Kala");
    }

    private static void print(String name){

        System.out.println("Ntampouginete Pamen Kala, "+name);
    }

    private static void print(String name, String surname){
        System.out.println("Ntampouginete Pamen Kala, "+name+" "+surname);
    }
    public static void slide110(){

        //calling the methods
        print();
        print("Nikos");
        print("Nikos","Nikou");
    }
}
