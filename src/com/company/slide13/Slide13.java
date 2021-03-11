package com.company.slide13;

import java.util.Scanner;

public class Slide13 {

            Scanner scan = new Scanner(System.in);
            public void slide13() {

                System.out.println("How can you assign a char (for example D) to a variable?\n"
                                    + "1. with double quotes\n"
                                    + "2. with single quotes\n"
                                    + "choose 1 or 2: "
                );
                int num;
                num = scan.nextInt();
                System.out.println("Enter a char");
                char userChar;
                userChar = scan.next().charAt(0);
                if (num == 1) {
                    System.out.println("WRONG ANSWER. FOR CHAR VARIABLES WE USE SINGLE QUOTES");
                } else if (num == 2) {
                    System.out.println("Your char is " + userChar);
                }
            }

}