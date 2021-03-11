package com.company.slide91;

public class Slide91 {
    //Global variables
    int userAge;

    String userName;

    //if the parameter has a variable, that variable is called method parameter variables.
    private void print(String voidName, int voidAge){

        //create local variables.
        // Local variables will be created once and after the end of
        //the method their value will be deleted.
        String name = voidName;
        int age = voidAge;

        userAge = age;
        userName = name;

        System.out.println("Name: " + userName + "\nAge:" + userAge);
    }

    public static void slide91(){
        //Instance variables.
        Slide91 bride = new Slide91();
        Slide91 groom = new Slide91();

        //every object has its own variables.
        // These variables are called Instance variables.
        //every object has unique variables.
        // Those variables are the global variables of a class.
        //Check out Gojkovic instagram ;)
        bride.print("Maria Gojkovic",23);
        groom.print("Vasileios Zartilas",22);
    }
}
