package com.company.Slide88;

public class Slide88 {
    public static class OuterClass{
        private static String msg = "GeeksForGeeks";

        // Static nested class
        public static class NestedStaticClass{

            // Only static members of Outer class is directly accessible in nested
            // static class
            public void printMessage() {

                // Try making 'message' a non-static variable, there will be
                // compiler error
                System.out.println("Message from nested static class: " + msg);
            }
        }

        // non-static nested class - also called Inner class
        public class InnerClass{

            // Both static and non-static members of Outer class are accessible in
            // this Inner class
            public void display(){
                System.out.println("Message from non-static nested class: "+ msg);
            }
        }
    }

        // How to create instance of static and non static nested class?
        public void slide88(){

            // create instance of nested Static class
            OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();

            // call non static method of nested static class
            printer.printMessage();

            // In order to create instance of Inner class we need an Outer class
            // instance. Let us create Outer class instance for creating
            // non-static nested class
            OuterClass outerCall = new OuterClass();
            OuterClass.InnerClass inner  = outerCall.new InnerClass();

            // calling non-static method of Inner class
            inner.display();

            // we can also combine above steps in one step to create instance of
            // Inner class
            OuterClass.InnerClass innerCall = new OuterClass().new InnerClass();

            // similarly we can now call Inner class method
            innerCall.display();
        }


}
