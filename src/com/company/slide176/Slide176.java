package com.company.slide176;

public class Slide176 {

    class human {
        String name;
        int age;
    }

    class student extends human{
        String am;
        {
            System.out.println("Student:");
        }

        student(String onoma, int ilikia, String arithmosMitroou){
            this.am = arithmosMitroou;
            this.name = onoma;
            this.age = ilikia;
        }

    }
    /*I have try the other methods. Object class, super class cannot call methods or even variables of e.g student class.
     *Only with the student class can be called.
     */
        public  void slide176(){
            //
            new student("Kokos",22,"P17000"){
                void print(){
                    System.out.println("Name: "+name+"\nAge: "+age+"\nAm: "+am);
                }
            }.print();

        }
}
