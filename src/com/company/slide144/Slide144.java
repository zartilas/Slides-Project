package com.company.slide144;

import java.util.Scanner;

public class Slide144 {

    public static void slide144(){
        Scanner scan = new Scanner(System.in);
        System.out.println("give a number (1-10):");
        int x;
        x = scan.nextInt();
        System.out.println("we will check if the umber is bigger than 5 with if");
        //if statement
        if (x>=5) {
            System.out.println("the number is bigger than number 5");
            // block of code to be executed if the condition is true
        } else {
            System.out.println("the number is from 5 and under");
            // block of code to be executed if the condition is false
        }
        System.out.println("Use if to specify a block of code to be executed, if a specified condition is true and use else to specify a block of code to be executed, if the same condition is false");
        System.out.println("now we will check days with switch cases " );
        System.out.println("Give a name of day (Monday to Sunday):");
        String y;
        y=scan.next();
        // switch statement
        switch (y) {
            case "Monday":
                System.out.println("day after weekend,school day ");
                break;
            // code block
            case "Tuesday" : case "Wednesday":  case "Thursday":
                System.out.println("school day");
                break;
            // code block
            case "Friday":
                System.out.println("day before weekend,school day");
                break;
            // code block
            case "Saturday":
                System.out.println("first day of the weekend");
                break;
            // code block
            case "Sunday":
                System.out.println("second day of weekend");
                break;
            // code block
            // below is default statement, used when none of the cases is true.
            // No break is needed in the default case.
            default :
                System.out.println("Give one name of days(Monday-Sunday");
        }
        System.out.println("Use switch to specify many alternative blocks of code to be executed");
        System.out.println("Also cases of switch can be one of them: string,int,sort,char,byte,enum");
    }
}
