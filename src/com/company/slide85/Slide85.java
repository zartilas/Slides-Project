package com.company.slide85;

import java.util.Scanner;

public class Slide85 {
    //final class
    final class Car {

        public void move() {
            System.out.println("Moving on road");
        }
    }

    class Bike {
        //final method
        final void MountainBike() {
            System.out.println("A mountain bike or mountain bicycle (abbreviated MTB) is a bicycle designed for off-road cycling");
        }
    }

    class Derived extends Bike {
    }

        public void slide85() {
            Car carCall = new Car();
            carCall.move();
            Bike bikeCall = new Derived();
            bikeCall.MountainBike();
            Scanner userInput = new Scanner(System.in);
            System.out.println("Give a number 1-10:");
            int num = userInput.nextInt();
            //final variable
            final int UserPrintNum = num;
            System.out.println("Your number is " +UserPrintNum);
            System.out.println("Variables marked as final can’t be reassigned. Once a final variable is initialized, it can’t be altered.");

        }
}
