package com.company.slide191;

interface Something{
    void print();
}
public class Slide191 {

        public  void slide191(){

            new Something(){
                @Override
                public void print() {
                    System.out.println("Done.");
                }

                void test(){
                    System.out.println("Extending the interface.");
                    print();
                }
            }.test();
        }

}
