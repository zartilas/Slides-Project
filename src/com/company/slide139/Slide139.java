package com.company.slide139;

import java.util.Scanner;

public class Slide139 {

    public static void slide139() {
        System.out.println("choose one of this numbers:5 or 10");
        Scanner scan = new Scanner(System.in);
        int x;
        x = scan.nextInt();
        //operator ?:
        int y=(x>5)? 0 :5;
        System.out.println("to be 10 you need more:");
        System.out.println(y);
        System.out.println("In computer programming, ?: is a ternary operator that part of the syntax for a basic conditional expression. It's commonly referred to as a conditional operator if.   " );
        System.out.println("we can to the same comparing numbers with if");
        int f=x;
        int t;
        if (f>5){
            t=0;
        }
        else {
            t=5;
        }
        System.out.println("to be 10 you need more:");
        System.out.println(t);
    }
}
