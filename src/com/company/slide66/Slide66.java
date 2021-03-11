package com.company.slide66;
class Geek
{
    //Class Geeks is having Default access modifier
    void display()
    {
        System.out.println("Hello World!");
    }
}
class A{
    //A class contains private data member and private method. We can't accessing these private members from outside the class.
    private int data= 32;
    private void print(){System.out.println("Hello Alepis");}
}

public class Slide66 extends Addition{

    public void slide66(){

        Slide66 objCall = new Slide66();
        System.out.println(objCall.addTwoNumbers(0, 5));
        Add addCall = new Add();
        System.out.println(addCall.addTwoNumbers(10, 132));
        Geek geekCall = new Geek();
        geekCall.display();

    }

}

