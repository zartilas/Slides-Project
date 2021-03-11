package com.company.slide100;
interface Interface {
}
public class Slide100 implements Interface{

        public  void slide100() {
            Interface objCall = new Slide100();
            System.out.println(objCall instanceof Slide100);
            System.out.println("The java instanceof operator is used to test whether the object is an instance of the specified type (class or interface).");
            // Will print true.
        }

}
