package com.company.slide190;

public class Slide190 {

    class ExtendClass{
        ExtendClass(){
            System.out.println("Hello");
        }
    }
        public  void slide190(){

            ExtendClass obj = new ExtendClass(){
                {
                    System.out.println("Extending the class");
                }
            };
        }


}
