package com.company.slide5;

public class Slide5 {

    public int num1 = 666;
    public int num2 = 69;

    //Method Addition
    public void AdditionNum(int num1,int num2) {
        int addNum = num1 + num2;
        System.out.println("Num1 + Num2 = " + addNum);
    }
    public void Slide5(){
        Slide5 objCall = new Slide5();
        System.out.println("Number 1: " +objCall.num1);
        System.out.println("Number 2: " +objCall.num2);
        //Create a obj object:
        Slide5 objMethod = new Slide5();
        // Call the AdditionNum() method:
        objMethod.AdditionNum(objCall.num1,objCall.num2);
    }

}



