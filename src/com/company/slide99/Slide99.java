package com.company.slide99;

public class Slide99 {

    public void slide99()
    {
        zoo("dog","cat","snake","bird");
    }

    static void zoo(String... args){
        for(int i=0; i<args.length; i++ )
            System.out.println(args[i]);
    }
}
