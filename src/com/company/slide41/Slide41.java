package com.company.slide41;

public class Slide41 {
    static class cars{
        cars (){
            System.out.println("Lexus and Fiat are Cars");
        }
    }
    static class birds{
        birds(){
            System.out.println("Parrot is a bird");
        }
        static class Parrots{
            Parrots(){
                System.out.println("Parrot can have many difference colors");
            }
        }
    }

   public void slide41(){
        new cars();
        new birds();
        new birds.Parrots();
    }
}
