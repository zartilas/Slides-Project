package com.company.slide173;

public class Slide173 {

    public class Pet{
        //Overridden method
        public void eat()
        {
            System.out.println("Pet is eating");
        }
    }
    class Dog extends Pet {
        //Overriding method
        public void eat() {
            System.out.println("Dog is eating");
        }

    }

    public void slide173() {
        Dog objCall = new Dog();
        //This will call the child class version of eat()
        objCall.eat();
        System.out.println(" The Dog class extends Pet class. Both the classes have a common method void eat(). Dog class is giving its own implementation to the eat() method or in other words it is overriding the eat() method.");
        System.out.println("The purpose of Method Overriding is clear here. Child class wants to give its own implementation so that when it calls this method, it prints Dog is eating instead of Pet is eating.");

    }
}
