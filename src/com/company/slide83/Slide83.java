package com.company.slide83;

public class Slide83 {
    abstract class Bike{
        Bike(){
            System.out.println("Bike is created");
        }
        //abstract method
        abstract void run();
        void changeGear(){
            System.out.println("Gear changed");
        }
    }
    //Creating a Child class which inherits Abstract class
    class Honda extends Bike{
        void run(){
            System.out.println("Running safely.");
        }
    }
    //abstract class with no-abstract methods
    abstract class Car{
        Car(){
            System.out.println("Audi");

        }
        void ChangeCar(){
            System.out.println("I want to change audi car with nissan car");
        }

    }
    class CarChange extends Car{
    }
    //
    public void slide83(){
        Bike objCall = new Honda();
        objCall.run();
        objCall.changeGear();
        Car objCallCar =new CarChange();
        objCallCar.ChangeCar();
    }


}
