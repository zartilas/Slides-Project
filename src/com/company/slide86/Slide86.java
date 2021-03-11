package com.company.slide86;

public class Slide86 {
    //create 2 static classes.
    static class ClassOuter{
        static class NestedClass{
            static void print(){
                System.out.println("Hello! NestedClass in ClassOuter");
            }

            void PrintName(){
                System.out.println("Hello, world! My name is Zartilas");
            }
        }
    }

    public static void slide86(){

        //to call a non-static method we have to create an object.
        ClassOuter.NestedClass objCall = new ClassOuter.NestedClass();
        objCall.PrintName();

        //to call the static print method
        ClassOuter.NestedClass.print();

    }
}
