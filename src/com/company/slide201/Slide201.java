package com.company.slide201;

public class Slide201 {
    class anonymous{
        int something;
        void print(){
            System.out.println("Thanks Word");
        }
    }

        public void slide201(){

            new anonymous(){
                {
                    something = 10;
                    System.out.println("Using anonymous class.");
                }
            }.print();
        }

}
